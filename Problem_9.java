class Problem_9{
  public static void main(String[] args){
    int sum = 1000;
    int a;
    for (a = 1; a <= sum/3; a++){
        int b;
        for (b = a + 1; b <= sum/2; b++){
            int c = sum - a - b;
            if ( Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) ){
               System.out.println("a=" + a + " b= " + b + " c=" + c);
               int result = a*b*c;
              System.out.println("The abc = " + result);
            }
        }
    }
  }
}