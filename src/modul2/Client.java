package modul2;

/**
 * Created by kadyr on 04.12.2017.
 */
public class Client {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(5,5);

        matrix.fill();
        matrix.print();
       // System.out.println(matrix.getSumNear(5,5));

    }
}
