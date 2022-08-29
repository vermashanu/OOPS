public class GettersAndSetters{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(6);
        System.out.println(p1.getTip());

        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}
    class Pen{
        private String color;
        private int tip;
        //getters
        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }

        //setters
        void setColor(String newColor){
            this.color = newColor;
        }
        void setTip(int tip){
            //this.tip means current object's tip and in the next line, it will get updated
            this.tip= tip; 
        }
    }
