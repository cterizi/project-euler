class Problem_2{
  public static void main(String[] args){
    long zero = 0l;
    long first = 1l;
    long next ;
    long sum = 0l;
    while (first<=4000000) {
      long mod = first % 2 ;
      if(mod == 0){
        sum = sum + first ;
      }
      next = zero + first ; 
      zero  = first;
      first = next;
    }
    System.out.println("The final sum : "+sum);
  }
}