interface Calci{
 public int getSum(int a,int b);
 public int getProduct(int a,int b);
}
class Calciimp implements Calci{
  public int getSub(int a,int b){
    return(a-b);
  }
  public int getdiv(int a,int b){
    return(a/b);

}
}
