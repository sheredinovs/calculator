package modul2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kadyr on 04.12.2017.
 */
public class MatrixTest {
    Matrix matrix;
    @Before
    public void setUp() throws Exception {
        matrix = new Matrix(5,5);
    }

    @After
    public void tearDown() throws Exception {
        matrix = null;
    }


    @Test
    public void fill() throws Exception {
        matrix.fill();
        int[][] array = matrix.getArray();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                Assert.assertNotEquals(array[row][column], 0);
            }
        }

    }
    @Test(expected = IllegalArgumentException.class)
    public void getBoundSum() throws Exception {
        Matrix matrixTest = new Matrix(5,5);
        matrix.fill();
        matrixTest.fill();
        Assert.assertNotEquals(matrix.getSumNear(5,5), matrixTest.getSumNear(5,5));

    }

    @Test(expected = IllegalArgumentException.class)
    public void getSum() throws Exception {
        Matrix matrixTest = new Matrix(10,10);
        matrix.fill();
        matrixTest.fill();
        Assert.assertNotEquals(matrix.getSumNear(5,5), matrixTest.getSumNear(5,5));

    }

}