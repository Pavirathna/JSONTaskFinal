package com.auxo.task;



public class Specimen {

        private double Q_SNO;
        private String EHR_Field;
        private String Field_Type;
        private String Possible_fieldvalues;
        private String Field_Value;
        private String Inference;
        private String Data_Structure;
        private double Go_TO;

        public Specimen() {
        }

        public Specimen(double Q_SNO, String EHR_Field, String Field_Type, String Possible_fieldvalues ,String Field_Value,String Inference,String Data_Structure,double Go_To) {
            this.Q_SNO = Q_SNO;
            this.EHR_Field = EHR_Field;
            this.Field_Type= Field_Type;
            this.Possible_fieldvalues=Possible_fieldvalues;
            this.Field_Value=Field_Value;
            this.Inference=Inference;
            this.Data_Structure=Data_Structure;
        }

        public double getQ_SNO() {
            return Q_SNO;
        }

        public void setQ_SNO(double Q_SNO) {
            this.Q_SNO =Q_SNO;
        }

        public String getEHR_Field() {
            return EHR_Field;
        }

        public void setEHR_Field(String EHR_Field) {
            this.EHR_Field = EHR_Field;
        }

        public String getField_Type() {
            return Field_Type;
        }

        public String getField_Value() {
            return Field_Value;
        }

        public void setField_Value(String field_Value) {
            Field_Value = field_Value;
        }

        public void setField_Type(String Field_Type) {
                this.Field_Type = Field_Type;
            }

        public String getPossible_fieldvalues() {
            return Possible_fieldvalues;
        }

        public void setPossible_fieldvalues(String Possible_fieldvalues) {
            this.Possible_fieldvalues=Possible_fieldvalues;
        }


        public String getInference() {
            return Inference;
        }

        public void setInference(String inference) {
            Inference = inference;
        }

        public String getData_Structure() {
            return Data_Structure;
        }

        public void setData_Structure(String data_Structure) {
            Data_Structure = data_Structure;
        }

        public double getGo_TO() {
            return Go_TO;
        }

        public void setGo_TO(double go_TO) {
            Go_TO = go_TO;
        }



    @Override
    public String toString() {
        return "Specimen{" +
                "Q_SNO=" + Q_SNO +
                ", EHR_Field='" + EHR_Field + '\'' +
                ", Field_Type='" + Field_Type + '\'' +
                ", Possible_fieldvalues='" + Possible_fieldvalues + '\'' +
                ", Field_Value='" + Field_Value + '\'' +
                ", Inference='" + Inference + '\'' +
                ", Data_Structure='" + Data_Structure + '\'' +
                ", Go_TO=" + Go_TO +
                '}';
    }
}



