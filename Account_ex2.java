
import java.text.DecimalFormat;
import java.util.Scanner;
//created by HARSH PATEL
//ID NO 21CE090
public class Account_ex2 {
    private int id=0;
    private double balance=500;
    private double AIR=7;
    private java.util.Date dateCreated;

    Account_ex2()
    {
        int id=0;
        double balance=500;
        double AIR=7;
        dateCreated= new java.util.Date();
    }
    Account_ex2(int i)
    {
        dateCreated= new java.util.Date();
        id=i;

    }

    void setid(int si)
    {
        id=si;
    }
    int getid()
    {
        return id;
    }


    void setBalance(double sb)
    {
        balance=sb;
    }
    double getBalance()
    {
        return balance;
    }


    void setair(double sair)
    {
        AIR=sair;
    }
    double getAIR()
    {
        return AIR/100;
    }


    java.util.Date getdate()
    {
        return dateCreated;
    }


    double getMonthlyInterestRate()
    {

        return AIR/12;
    }

    double getMonthlyInterest(double bal)
    {

        return bal*(AIR/1200);
    }

    void withdraw(double w_amount)
    {
        if(w_amount<balance){
            balance=balance-w_amount;
            System.out.println("Your Amount is withdraw successfully !!!");
        }
        else
        {
            System.out.println("Your account dose not have demanded amount !!!");
        }
    }
    void deposit(double d_amount)
    {
        balance=balance+ d_amount;
        System.out.println("Your Amount is deposit successfully !!!");
    }


}
class main{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int aid;
        System.out.print("Enter ID : ");
        aid=sc.nextInt();
        Account_ex2 obj = new Account_ex2(aid);
        System.out.println("your account created successfully !!!");
        System.out.println("-------------------------------------");
        System.out.println("Account ID      : "+obj.getid());
        System.out.println("Account balance : "+obj.getBalance());
        System.out.println("-------------------------------------");
        System.out.print("Enter annualInterestRate   : ");
        double air= sc.nextDouble();
        obj.setair(air);
        System.out.println("-------------------------------------");
        System.out.println("MonthlyInterestRate      : "+obj.getMonthlyInterestRate()+"%");
        System.out.println("MonthlyInterest          : "+obj.getMonthlyInterest(obj.getBalance()));
        System.out.println("-------------------------------------");
        System.out.print("Enter deposit amount         : ");
        double pa= sc.nextDouble();
        System.out.println("-------------------------------------");
        obj.deposit(pa);
        System.out.println("Now your account balance   : "+obj.getBalance());
        System.out.println("-------------------------------------");
        System.out.print("Enter withdraw amount        : ");
        double tel= sc.nextDouble();
        System.out.println("-------------------------------------");
        obj.withdraw(tel);
        System.out.println("Now your account balance   : "+obj.getBalance());
        System.out.println("-------------------------------------");

    }
}

