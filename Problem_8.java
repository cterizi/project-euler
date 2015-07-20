class Problem_8{
  public static void main(String[] args){
    String string1 = "73167176531330624919225119674426574742355349194934" ;
    String string2 = "96983520312774506326239578318016984801869478851843";
    String string3 = "85861560789112949495459501737958331952853208805511";
    String string4 = "12540698747158523863050715693290963295227443043557";
    String string5 = "66896648950445244523161731856403098711121722383113";
    String string6 = "62229893423380308135336276614282806444486645238749";
    String string7 = "30358907296290491560440772390713810515859307960866";
    String string8 = "70172427121883998797908792274921901699720888093776";
    String string9 = "65727333001053367881220235421809751254540594752243";
    String string10 = "52584907711670556013604839586446706324415722155397";
    String string11 = "53697817977846174064955149290862569321978468622482";
    String string12 = "83972241375657056057490261407972968652414535100474";
    String string13 = "82166370484403199890008895243450658541227588666881";
    String string14 = "16427171479924442928230863465674813919123162824586";
    String string15 = "17866458359124566529476545682848912883142607690042";
    String string16 = "24219022671055626321111109370544217506941658960408";
    String string17 = "07198403850962455444362981230987879927244284909188";
    String string18 = "84580156166097919133875499200524063689912560717606";
    String string19 = "05886116467109405077541002256983155200055935729725";
    String string20 = "71636269561882670428252483600823257530420752963450";
    
    String string = string1 + string2 + string3 + string4 + string5 + string6 + string7 + string8 + string9 + string10
                    + string11 + string12 + string13 + string14 + string15 + string16 +
                    string17 + string18 + string19 + string20 ;
                    
    int length = string.length();
    long maxMul=0;
    for(int i = 0; i<(length-12); i++){      
      String first = string.substring(i,i+13);
      char[] c = first.toCharArray();
      long multiple13 = 1l;
      for(int j=0; j<c.length; j++){
        //System.out.print(c[j]);
        //System.out.println("---");
        multiple13 = multiple13 * Character.getNumericValue(c[j]);
        //System.out.println(Character.getNumericValue(c[j]) + 1);
        //System.out.println("---");
      }
      if(multiple13>maxMul){
        maxMul=multiple13;
      }
    }
    System.out.println("MaxMul = " + maxMul);
  }
  
}