public class BasicOOps {
   public static void main(String[] args) {
       pen writoMeter= new pen();
       writoMeter.color="blue";
       writoMeter.tip=4;
       System.out.println(writoMeter.color);
      System.out.println(writoMeter.tip);
       writoMeter.setColor("red");
       writoMeter.setTip(10);
     System.out.println(writoMeter.color);
       System.out.println(writoMeter.tip);

   } 
}
class pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
     void setTip(int newTip){
        tip=newTip;
    }
}
