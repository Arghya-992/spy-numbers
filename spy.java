import java.util.Scanner;  
public class spy  {  
public static void main(String args[])  {   
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number to check: " );  
int num;
int  prod=1;
int  sum=0; 
int lastno;   
num=sc.nextInt();  

while(num>0){  
lastno=num%10;  
sum=sum+lastno;  

prod=prod*lastno;  
num=num/10;  
}  
if(sum==prod)  
System.out.println("Spy number");  
else  
System.out.println("Not a spy number");  
}  
}  