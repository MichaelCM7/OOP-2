package OOP2_Lesson1;

public class Main {
    public static void main(String[] args){
        Account MichaelAccount = new Account();
        MichaelAccount.AccountName = "Michael Chege Mbugua";
        MichaelAccount.AccountNo = "189977";
        MichaelAccount.Balance = 500;

        System.out.println("Account Number : " + MichaelAccount.AccountNo +
                "\nAccount Name: " + MichaelAccount.AccountName + "\nBalance: "
                + MichaelAccount.Balance);
    }
}
