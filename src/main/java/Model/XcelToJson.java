package Model;

import com.google.gson.Gson;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XcelToJson {

    public static void main(String[] args )throws Exception
    {
        

        Gson gson = new Gson();
        FileInputStream file;
        file = new FileInputStream(new File ("C:\\Users\\Admin\\Desktop\\Specimen.xlsx"));

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);

        Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.iterator();

        List<Specimen> list = new ArrayList<Specimen> ();
        while (rowIterator.hasNext())
        {
            Specimen specimen = new Specimen();
            Row row = rowIterator.next();
//            if (null != row.getCell(4)) {
//                specimen.setField_value (row.getCell(4).getStringCellValue());
//            }
//            if (null != row.getCell(6)) {
//                specimen.setGo_to (row.getCell(6).getStringCellValue());
//            }
            if(null !=row.getCell ( 4 )){
                specimen.setProviderquestion (row.getCell(4).getStringCellValue());
            }if(null !=row.getCell ( 5 )){
            specimen.setQmaybe_asked ( row.getCell(5).getStringCellValue());
            }if(null !=row.getCell ( 6 )){
            specimen.setPatient_answer ( row.getCell(6).getStringCellValue());
            }
            if(null !=row.getCell ( 7 )){
                specimen.setEhr_field ( row.getCell(7).getStringCellValue());
            }if(null !=row.getCell ( 8 )){
            specimen.setFieldtype ( row.getCell(8).getStringCellValue());
        }if(null !=row.getCell ( 9 )){
            specimen.setPossible_fieldvalue ( row.getCell(9).getStringCellValue());
        }if(null !=row.getCell ( 10 )){
            specimen.setField_value ( row.getCell(10).getStringCellValue());
        }
            if(null !=row.getCell ( 11 )){
                specimen.setInference ( row.getCell(11).getStringCellValue());
            }
            if(null !=row.getCell ( 12 )){
                specimen.setGo_to ( row.getCell(12).getStringCellValue());
            }
            list.add(specimen);
        }
        file.close();
        System.out.println(gson.toJson(list));
    }
    }

