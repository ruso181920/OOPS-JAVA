public class CopyConstructor {
    public static void main(String[] args) {
      Student s1=new Student();
      s1.name="Raushan";
      s1.roll=456;
      s1.password="abds";
      s1.marks[0]=67;
      s1.marks[1]=77;
      s1.marks[2]=87;

      // suppose student s1 forgot his password 
     // then we need to copy the data of s1 and create new password.
     //
     Student s2=new Student(s1);
     s2.password="xyz";
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

  // copy constructor
    public Student(Student s1) {
    this.name = s1.name;
    this.roll = s1.roll;
    this.password = s1.password;
    if (s1.marks != null) {
      this.marks = new int[s1.marks.length];
      for (int i = 0; i < s1.marks.length; i++) {
        this.marks[i] = s1.marks[i];
      }
    } else {
      this.marks = new int[3];
    }
    }

    

   public  Student() {
     marks=new int[3];

    }

   public Student(String name) {
        this.name=name;
        marks=new int[3];

    }

     public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        marks=new int[3];

    }
}

