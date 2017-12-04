package modul2;

/**
 * Created by kadyr on 04.12.2017.
 */
public class Matrix {
    private int[][] array = new int[10][10];

    public void print(){
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
   }

   public void fill(){
       for (int i = 0; i <10 ; i++) {
           for (int j = 0; j < 10; j++) {
               array[i][j] = j;
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

       if(address1 > 10 || address2 > 10){
           throw new IllegalArgumentException("address can not be more than 10 " + address1 + "  " + address2);
       }

       return array[address1][address2 -1] + array[address1][address2 +1] +
               array[address1-1][address2] + array[address1 +1][address2];

   }

}
