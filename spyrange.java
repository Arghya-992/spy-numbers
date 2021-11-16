import java.util.Scanner;
public class spyrange {

 public static void main(String[] args) {
       System.out.println("Spy numbers between 1 to 1000 are: ");
       for(int i=1;i<=1000;i++){
        int num=i;
         int sum=0;
         int multiply=1;
         int rem;
          while(num!=0){
              rem=num%10;
              sum+=rem;
              multiply*=rem;
              num/=10;
          }

       if(sum==multiply)
       System.out.print(i+" ");
       }
       sc.close();
  }
 }