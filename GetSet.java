public class GetSet {
     public static void main(String[] args) {
       Pen writoMeter= new Pen();
       writoMeter.setColor("blue");
       writoMeter.setTip(4);
       System.out.println(writoMeter.getColor());
      System.out.println(writoMeter.getTip());
       writoMeter.setColor("red");
       writoMeter.setTip(10);
     System.out.println(writoMeter.getColor());
       System.out.println(writoMeter.getTip());

   } 
}
class Pen{
   private  String color;
   private  int tip;

    String getColor(){
       return  this.color;
    }
     int getTip(){
      return this.tip;
    }

    void setColor(String newColor){
      this.color=newColor;
    }
     void setTip(int newTip){
        this.tip=newTip;
    }
}


