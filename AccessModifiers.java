public class AccessModifiers{
    public static void main(String args[]){
        BankAccount myAccount = new BankAccount();
        myAccount.username = "Shivani";
        myAccount.setPassword("MyPassword");
        
    }
}



class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}