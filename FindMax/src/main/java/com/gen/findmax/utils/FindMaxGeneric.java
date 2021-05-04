package com.gen.findmax.utils;
public class FindMaxGeneric {
      public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
      T max = x; 
      
      if(y.compareTo(max) > 0) {
         max = y;
      }
      
      if(z.compareTo(max) > 0) {
         max = z;                 
      }
      return max;   
   }
   
   public static void main(String args[]) {
	   Integer maxI = maximum( 3, 4, 5 );
      System.out.println("Max  3, 4, 5, is: "+ maxI);

      Double maxD=maximum( 6.6, 8.8, 7.7 );
      System.out.println("Max 6.6, 8.8, 7.7 is: "+maxD);
      
      String maxS = maximum("pear", "apple", "orange");
      System.out.println("Max pear,apple, orange is: " +maxS );
   }
}