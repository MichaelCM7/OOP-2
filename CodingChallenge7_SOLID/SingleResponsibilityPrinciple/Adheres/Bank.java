package OOP2_Coding_Challenges.CodingChallenge7_SOLID.SingleResponsibilityPrinciple.Adheres;

public class Bank {
    public void makeDeposit(){
        System.out.println("Deposited");
    }

    public void makeWithdrawal(){
        System.out.println("Withdrawn");
    }

    public void makeTransfer(){
        System.out.println("Transferred");
    }

    public void makePayment(){
        System.out.println("Paid");
    }
}
