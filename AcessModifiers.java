public class AcessModifiers {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        myAccount.username="Raushan34";
// password will not be directly accesible as 
// it is defined under private classifier.
  //      myAccount.password="djjdjj";
  //

//   although you can set password using the setpassword function.
        myAccount.setpassword("raushan345");

        System.out.println(myAccount.username);

}
}
class BankAccount {
    public String username;
    private String password;
    protected  void setpassword(String pwd){
        password=pwd;
    }
}
