package Model;

public class Specimen {


        private double qno;
        private String providerquestion;
        private String qmaybe_asked;
        private String patient_answer;
        private String ehr_field;
        private String fieldtype;
        private String possible_fieldvalue;
        private String field_value;
        private String inference;
        private String data_structure;
        private String go_to;

        public Specimen() {
        }

        public Specimen(double qno,String providerquestion,String qmaybe_asked,String patient_answer, String ehr_field, String fieldtype, String possible_fieldvalue ,String Field_Value,String inference,String data_structure,String go_to) {
            this.qno = qno;
            this.providerquestion=providerquestion;
            this.qmaybe_asked=qmaybe_asked;
            this.patient_answer=patient_answer;
            this.ehr_field = ehr_field;
            this.fieldtype= fieldtype;
            this.possible_fieldvalue=possible_fieldvalue;
            this.field_value=field_value;
            this.inference=inference;
            this.data_structure=data_structure;
        }

    public double getQno() {
        return qno;
    }
    public void setQno(double qno) {
        this.qno = qno;
    }

    public String getProviderquestion() {
        return providerquestion;
    }

    public void setProviderquestion(String providerquestion) {
        this.providerquestion = providerquestion;
    }

    public String getQmaybe_asked() {
        return qmaybe_asked;
    }

    public void setQmaybe_asked(String qmaybe_asked) {
        this.qmaybe_asked = qmaybe_asked;
    }

    public String getPatient_answer() {
        return patient_answer;
    }

    public void setPatient_answer(String patient_answer) {
        this.patient_answer = patient_answer;
    }

    public String getEhr_field() {
        return ehr_field;
    }

    public void setEhr_field(String ehr_field) {
        this.ehr_field = ehr_field;
    }

    public String getFieldtype() {
        return fieldtype;
    }

    public void setFieldtype(String fieldtype) {
        this.fieldtype = fieldtype;
    }

    public String getPossible_fieldvalue() {
        return possible_fieldvalue;
    }

    public void setPossible_fieldvalue(String possible_fieldvalue) {
        this.possible_fieldvalue = possible_fieldvalue;
    }

    public String getField_value() {
        return field_value;
    }

    public void setField_value(String field_value) {
        this.field_value = field_value;
    }

    public String getInference() {
        return inference;
    }

    public void setInference(String inference) {
        this.inference = inference;
    }

    public String getData_structure() {
        return data_structure;
    }

    public void setData_structure(String data_structure) {
        this.data_structure = data_structure;
    }

    public String getGo_to() {
        return go_to;
    }

    public void setGo_to(String go_to) {
        this.go_to = go_to;
    }



        @Override
        public String toString() {
            return "Specimen{" +
                    "qno=" + qno +
                    ", ehr_field='" + ehr_field + '\'' +
                    ", fieldtype='" + fieldtype + '\'' +
                    ", possible_fieldvalue='" + possible_fieldvalue + '\'' +
                    ", Field_Value='" + field_value+ '\'' +
                    ", inference='" + inference + '\'' +
                    ", data_structure='" + data_structure + '\'' +
                    ", go_to=" + go_to +
                    '}';



        }
    }

