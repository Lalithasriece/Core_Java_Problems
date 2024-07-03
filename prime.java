import java.util.*;
public class prime {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
      for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
            return false;
      }
    }
    return true;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the start value:");
    int start=sc.nextInt();
    System.out.print("Enter the end value:");
    int end=sc.nextInt();
    int count=0;
    System.out.println("The prime numbers between "+start+" and "+end+" is :");
    for(int num=start;num<=end;num++){
       // System.out.println("The prime numbers between "+start+" and "+end+" is :");
        if(isPrime(num)){
            System.out.println(num);
            count++;
        }
    }
    System.out.println("The number of prime numbers is:"+count);
}
}

/*OUTPUT:
Enter the start value:5
Enter the end value:20
The prime numbers between 5 and 20 is :
5
7
9
11
13
17
19
The number of prime numbers is:7 */
