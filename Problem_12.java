class Problem_12{
  public static void main(String[] args){
    long first = 1l;
    long last =1l;
    long count =0l;
    while(count <= 500){
      first = first +1 ; 
      last = last + first;
      System.out.println("last=" + last);
      long middle = (long)Math.sqrt(last);
      for(long i = 1; i<=middle; i++){
        if(last%i==0){
          count = count + 2;
        }
      }
      if (middle * middle == last) {
        count--;
      } 
      if(count>500){
        System.out.println("The result is "+last);
        break;
      }
      count =0;
    }
  }
}