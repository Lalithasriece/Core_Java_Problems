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
    int num=sc.nextInt();
    int count=0;
    for( num=1;num<=10;num++){
        if(isPrime(num)){
            System.out.println(num);
            count++;
        }
    }
    System.out.println("The number of prime numbers is:"+count);
}

}