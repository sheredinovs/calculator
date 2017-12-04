package modul2;

import java.util.Random;

/**
 * Created by kadyr on 04.12.2017.
 */
public class Matrix {
    private int[][] array;


    public Matrix(int count1, int count2){
        array = new int[count1][count2];
    }

    public void print(){
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

   public void fill(){
       Random random = new Random();
       for (int row = 0; row < array.length; row++) {
           for (int column = 0; column < array[row].length; column++) {
               array[row][column] = random.nextInt(100) + 1;
           }
       }
   }

   public int[][] getArray(){
       return array;
   }

   public int getSumNear(int address1, int address2){
       if(address1 < 0 || address2 <0){
           throw new IllegalArgumentException("address can not be less than o " + address1 + "  " + address2);
       }

       if(address1 >= array.length ||  address2 >= array.length ){
           throw new IllegalArgumentException("address can not be more than 10 " + address1 + "  " + address2);
       }

       return getElement(address1,address2 -1) + getElement(address1,address2 +1) +
               getElement(address1 -1,address2) + getElement(address1 +1 ,address2);

   }

   private int getElement(int address1, int address2){
       int res = 0;
       try{
           return res = array[address1][address2];
       }
       catch (ArrayIndexOutOfBoundsException e){
           return res;
       }
   }

}
