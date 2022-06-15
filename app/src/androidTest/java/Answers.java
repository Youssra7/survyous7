public class Answers {
        int ID;
        //String type = "" ;
        String text = "";
        String type = "";

        public Answers(String ty, String tx){
            this.text = tx;
            this.type = ty;
        }

        public String[] getAnswer(){
            String [] an = new String[2];
            an[0] = this.type;
            an[1] = this.text;
            return an;
        }
        public void setAnswer(String type, String text) {
            this.type = type;
            this.text = text;
        }
    }
