class Problem_45{
  public static void main(String[] args){
    long t = 286l;
    long p = 166l;
    long h = 144l;
    boolean temp = true;
    while(temp){
      long numberH = hexagonal(h);
      long numberP = pentagonal(p);
      long numberT = triangle(t);
      if(numberH == numberP && numberH == numberT && numberP == numberT){
        System.out.println(numberH);
        temp = false;
      }
      long minimum = numberH;
      if(numberP < minimum){
        minimum = numberP;
      }
      if(numberT < minimum){
        minimum = numberT;
      }
      if(minimum == numberH){
        h = h + 1;
      }
      else if (minimum == numberP){
        p = p + 1;
      }
      else{
        t = t + 1;
      }
    }
  }
  
  public static long triangle(long numberT){
    return ( (numberT * (numberT + 1) ) / 2);
  }
  
  public static long pentagonal(long numberP){
    return ( (numberP * (3 * numberP - 1) ) / 2);
  }
  
  public static long hexagonal(long numberH){
    return ( (numberH * (2 * numberH - 1) ) );
  }
}