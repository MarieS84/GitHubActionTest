package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {

    @Test
    public void testAdd(){
        MyClass myClass = new MyClass();
        assertEquals(3, myClass.add(2, 1));
    }
}
