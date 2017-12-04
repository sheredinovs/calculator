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
        matrix = new Matrix();
    }

    @After
    public void tearDown() throws Exception {
        matrix = null;
    }


    @Test
    public void fill() throws Exception {
        Matrix matrixTest = new Matrix();
        matrix.fill();
        matrixTest.fill();
        Assert.assertArrayEquals(matrix.getArray(), matrixTest.getArray());

    }
    @Test
    public void getSum() throws Exception {
        Matrix matrixTest = new Matrix();
        matrix.fill();
        matrixTest.fill();
        Assert.assertEquals(matrix.getSumNear(5,5), matrixTest.getSumNear(5,5));

    }

}