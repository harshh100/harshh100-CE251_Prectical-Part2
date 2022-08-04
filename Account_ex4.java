
import java.util.Scanner;
//Created by HARSH PATEL
// ID NO 21CE090
public class Account_ex4{
    private int id=0;
    private double balance=500;
    private double AIR=7;
    private java.util.Date dateCreated;

    Account_ex4()
    {
        int id=0;
        double balance=500;
        double AIR=7;

        dateCreated= new java.util.Date();
    }
    Account_ex4(int i)
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
        if(w_amount<=balance){
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
class SavingAccount extends Account_ex4
{

    void swithdraw(double sw_amount) {
        super.withdraw(sw_amount);
    }


    void sdeposit(double sd_amount) {
        super.deposit(sd_amount);
    }
}

class CheckingAccount extends Account_ex4
{

    void cwithdraw(double cw_amount) {
        if(cw_amount>100)
        {
            super.withdraw(cw_amount);
        }
        else
        {
            System.out.println("minimum withdraw limit is 100 !!! ");
        }

    }


    void cdeposit(double cd_amount) {
        if(cd_amount>200)
        {
            super.deposit(cd_amount);
        }
        else
        {
            System.out.println("minimum deposit limit is 200 !!! ");
        }

    }
}

class main{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int aid;
        System.out.print("Enter ID : ");
        aid=sc.nextInt();
        Account_ex4 obj = new Account_ex4(aid);
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
        double x= sc.nextDouble();
        System.out.println("-------------------------------------");
        obj.deposit(x);
        System.out.println("Now your account balance   : "+obj.getBalance());
        System.out.println("-------------------------------------");
        System.out.print("Enter withdraw amount        : ");
        double y= sc.nextDouble();
        System.out.println("-------------------------------------");
        obj.withdraw(y);
        System.out.println("Now your account balance   : "+obj.getBalance());
        System.out.println("-------------------------------------");


        System.out.println("** For Saving Account **");
        SavingAccount sobj= new SavingAccount();
        System.out.print("Enter deposit amount         : ");
        double p= sc.nextDouble();
        System.out.println("-------------------------------------");
        sobj.sdeposit(p);
        System.out.println("Now your account balance   : "+sobj.getBalance());
        System.out.println("-------------------------------------");

        System.out.print("Enter Withdraw amount         : ");
        double q= sc.nextDouble();
        System.out.println("-------------------------------------");
        sobj.swithdraw(q);
        System.out.println("Now your account balance   : "+sobj.getBalance());
        System.out.println("-------------------------------------");

        System.out.println("** For Checking Account **");
        CheckingAccount cobj= new CheckingAccount();
        System.out.print("Enter deposit amount         : ");
        double i= sc.nextDouble();
        System.out.println("-------------------------------------");
        cobj.cdeposit(i);
        System.out.println("Now your account balance   : "+cobj.getBalance());
        System.out.println("-------------------------------------");

        System.out.print("Enter Withdraw amount         : ");
        double o= sc.nextDouble();
        System.out.println("-------------------------------------");
        cobj.cwithdraw(o);
        System.out.println("Now your account balance   : "+cobj.getBalance());
        System.out.println("-------------------------------------");
    }
}

