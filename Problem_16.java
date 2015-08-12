import java.math.BigInteger;

class Problem_16{
  public static void main (String[] args){
    long sum = 0l;;
    BigInteger base = new BigInteger("2");
    int power = 1000;
    BigInteger p ;
    p = base.pow(power);
    String word = p.toString();
    for(char character : word.toCharArray()){
    sum = sum + Character.getNumericValue(character);
    }
    System.out.println("RESULT: " + sum);
  }
}