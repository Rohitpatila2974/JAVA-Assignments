package Assignment_04;

import java.util.Scanner;

public class bankaccount 
{String name;
int accountnumber;
String accounttype;
float balance=2000;
int deposite;
int withdraw;

  void bank()
  {
	  Scanner s=new Scanner (System.in);
	  System.out.println("Enter The name of Account Holder");
	  name=s.nextLine();
	  System.out.println("Enter The Account Number");
	  accountnumber=s.nextInt();
	  System.out.println("Enter The Type Of Account");
	  accounttype=s.next();
  }
  void display()
  {
	  System.out.println("Account Holder Name :"+name);
	  System.out.println("Account Number :"+accountnumber);
	  System.out.println("Account Type :"+accounttype);
  }
  void deposite()
  {
	  
	  Scanner s=new Scanner (System.in);
	  System.out.println("Enter The Amount To Be Deposited");
	  deposite=s.nextInt();
	  System.out.println("Deposited Amount ="+deposite);
	  balance=deposite+balance;
	System.out.println("Current Balance "+balance);  
  }
  void withdraw()
  {
	  Scanner s=new Scanner (System.in);
	  System.out.println("Enter The Amount To Be Withdraw");
	  withdraw=s.nextInt();
	  if(withdraw<=balance)
	  {
		  System.out.println("Amount withdraw in process");
	  }
	  else
	  {
		  System.out.println("Insufficient Balance In Account");
	  }
	  balance=balance-withdraw;
	  System.out.println("Balance Available"+balance);
  }
  

public static void main(String args[])
{
	  Scanner s=new Scanner (System.in);
	  System.out.println("Welcome to HDFC BANK");
	  bankaccount st=new bankaccount();
	  st.bank();
	  st.display();
	  st.deposite();
	  st.withdraw();
	
}
	

}

