import java.util.Scanner;

interface Calci{
 public int getSub(int a,int b);
 public int getdiv(int a,int b);
 public int getproduct(int a,int b);
}
class Calciimp implements Calci{
  public int getSub(int a,int b){
    return(a-b);
  }
  public int getdiv(int a,int b){
    return(a/b);

}
 public int getproduct(int a,int b){
    return(a*b);
}
}
class CalciDriver{
  public static void main(String[] args) {
    Calciimp c=new Calciimp();
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st number:");
   int n1=sc.nextInt();
   System.out.println("enter 2nd number:");
   int n2=sc.nextInt();
   System.out.println(n1+"-"+n2+"="+c.getSub(n1, n2));
   System.out.println(n1+"/"+n2+"="+c.getdiv(n1, n2));
  }
}
