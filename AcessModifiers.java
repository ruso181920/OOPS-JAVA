public class AcessModifiers {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        myAccount.username="Raushan34";
// password will not be directly accesible as 
// it is defined under private classifier.

  //      myAccount.password="djjdjj"; // it will give error
  
//   although you canget and set password using the getter and setter function.
        myAccount.setPassword("raushan345");
         System.out.println(myAccount.username);
       System.out.println(myAccount.getPassword());

}
}
class BankAccount {
    public String username;
    private String password;
//   In Java, Getters and Setters are public methods used to protect your data by controlling how variables are accessed and modified.
//  They are the primary tools for achieving Encapsulation.
// Getter (Accessor): A method that "gets" or reads the current value of a private variable.
// Setter (Mutator): A method that "sets" or updates the value of a private variable.
    public  void setPassword(String pwd){
        password=pwd;
    }
    String getPassword() {
        return this.password;
    
    }
}
