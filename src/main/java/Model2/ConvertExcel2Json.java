package Model2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ConvertExcel2Json {

    public static void main(String[] args) {
        // Step 1: Read Excel File into Java List Objects
        List  specimer = readExcelFile("C:\\Users\\Admin\\Desktop\\Specimen.xlsx");
        //  List  specimer = readExcelFile("Specimen.xlsx");

        // Step 2: Convert Java Objects to JSON String
        String jsonString = convertObjects2JsonString( specimer);

        System.out.println(jsonString);
    }

    /**
     * Read Excel File into Java List Objects
     *
     * @param filePath
     * @return
     */
    public static List readExcelFile(String filePath){
        try {
            FileInputStream excelFile = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook ( excelFile );
            Sheet sheet = workbook.getSheetAt (0);
            Iterator rows = sheet.iterator();

            List lspecimer = new ArrayList();

            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = (Row) rows.next();


                if(rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator cellsInRow = currentRow.iterator();

                Specimen speci = new Specimen();

                int cellIndex = 3;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = (Cell) cellsInRow.next();

                    if(cellIndex==3) { // Q_SNO
                        speci.setQ_SNO(currentCell.getNumericCellValue());
                    } else if(cellIndex==4) { // EHR_Field
                        speci.setEHR_Field(currentCell.getStringCellValue());
                    } else if(cellIndex==5) { // Field_Type
                        speci.setField_Type(currentCell.getStringCellValue());
                    } else if(cellIndex==6) { // Possible_fieldvalues
                        speci.setPossible_fieldvalues(currentCell.getStringCellValue());
                    }
                    else if(cellIndex==7) { // Field_Value
                        speci.setField_Value(currentCell.getStringCellValue());
                    }
                    else if(cellIndex==8) { // Inference
                        speci.setInference(currentCell.getStringCellValue());
                    } else if(cellIndex==9) { // GO_TO
                        speci.setGo_TO(currentCell.getNumericCellValue());
                    }

                    cellIndex++;
                }
                System.out.println ();

                lspecimer.add( speci);
            }

            excelFile.close();
            return lspecimer;
        } catch (IOException e) {
            throw new RuntimeException("FAIL! -> message = " + e.getMessage());
        }
    }

    /**
     * Convert Java Objects to JSON String
     *
     * @param specimer
     */
    private static String convertObjects2JsonString(List  specimer) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";

        try {
            jsonString = mapper.writeValueAsString( specimer);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonString;
    }
}
