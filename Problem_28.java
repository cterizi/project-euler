class Problem_28{
  public static void main(String[] args){
    long size = 1001l;
    long sum = 1l;
    long temp = 1l;
    long x = 0l;
    long repeat = 1l; 
    while(temp < Math.pow(size,2) ){
      x = x + 2;
      for(int i = 1; i <= 4; i++){
        temp = temp + x;
        sum = sum + temp;
      } 
      repeat = repeat + 1;
    }
    System.out.println("The sum is " + sum);
  }
}