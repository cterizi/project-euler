class Problem_6{
  public static void main(String[] args){
    long number = 100l;
    long sum1=0;
    long sum2=0;
    for(long i =1; i<=number; i++){
      sum1 = sum1+ (long)Math.pow(i,2);
      sum2 = sum2 + i;
    }
    long sum2_2 = (long)Math.pow(sum2,2);
    System.out.println("The sum1 = " + sum1);
    System.out.println("The sum2_2 = " + sum2_2);
    long differ = 0l;
    differ = sum2_2-sum1;
    System.out.println("The different is  = " + differ);
  }
}