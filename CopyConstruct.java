public class CopyConstruct {
   public static void main(String[] args) {
       Student s1=new Student();
       s1.name="Raushan";
       s1.roll=45;
       s1.password="abcd";
       s1.marks[0]=68;
       s1.marks[1]=78;
       s1.marks[2]=82;

  System.out.println(s1.name);
   Student s2=new Student (s1);
     s1.marks[0]=54;
     s2.password="abc";
   System.out.println(s2.name);
   System.out.println(s2.password);
     for (int i = 0; i < 3; i++) {
         System.out.println(s2.marks[i]);
     }
   } 
}

class Student {
    String name;
    int roll;
    String password;
    int marks[]=new int[3];

    public Student() {

    }

    //copy constructor
        // public Student(Student s1){
        //     this.name=s1.name;
      //     this.roll=s1.roll;
           // here only reference of array is copied 
           // hence any change made in s1 marks array , will reflect on s2 marks. 
          // hence it is called shallow copy constructor
    //     this.marks=s1.marks;
    // }

    // deep copy constructor

  public Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
   // here actual value of array is copied 
   // hence any change made in s1 marks array , will not reflect on s2 marks. 
   // hence it is called deep copy constructor
        for (int i = 0; i < 3; i++) {
              this.marks[i]=s1.marks[i];
        }
    }


    public Student(String name, int roll, String password) {
        this.name = name;
        this.roll = roll;
        this.password = password;
    }
     
    
}