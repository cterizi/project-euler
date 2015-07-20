class Problem_3{
  public static void main(String[] args) {
    long number = 600851475143l;
    long riza = (long)Math.sqrt(number); //775146
    for( long i = riza; i > 0; i--) {
      if( number % i == 0 ){
        if( primeNumber( i ) ){
          System.out.println("The longest number is " + i);
        }
      }
    }
  }
  
  public static boolean primeNumber( long number ) {
    if( number % 2 == 0 ){
      return( false );
    }
    for( long i = 3; i * i <= number; i = i + 2 ) {
      if( number % i == 0 ) {
        return( false );
      }
    }
    return( true );
  }
  
  
}