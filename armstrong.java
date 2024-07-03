import java.util.*;
public class armstrong {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int original_no,res=0,rem;
original_no=a;
while(original_no!=0){
    rem=original_no%10;
    res+=Math.pow(rem,3);
    original_no/=10;
}
if(res==a){
    System.out.println("Armstrong Number");
}
else{
    System.out.println("Not an Armstrong Number");
}





    }
}
