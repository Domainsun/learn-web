package com.domain.ssh.junit.test;

import com.domain.ssh.junit.MyTestDemo;
import org.junit.*;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;


public class MyTestDemoTest {

    MyTestDemo myTestDemo;


    @BeforeClass
    public static void methodBeforeClass(){
        System.out.println("在类的所有测试之前,必须定义为静态方法");
    }

    @Before
    public void before(){
        myTestDemo = new MyTestDemo();
        System.out.println("测试前初始化方法,每执行一个测试方法都会执行");
    }

    @Test
    public void testSayHi(){
        myTestDemo.sayHi();
    }

    @Test
    public void testSayHello(){
        System.out.println("hello");
    }

    @After
    public void after(){
        System.out.println("测试后结束方法,每执行一个测试方法都会执行");
    }

    @AfterClass
    public static void methodAfterClass(){
        System.out.println("在类的所有测试之后,必须定义为静态方法");
    }

    @Ignore
    @Test
    public void methodIgnore(){
        System.out.println("Ignore注解的测试方法将不会被执行");
    }


    /*------------------------断言Demo---------------------*/

    @Test
    public void testAssert() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] arithmetic1 = {1, 2, 3};
        int[] arithmetic2 = {1, 2, 3};

        assertEquals("值相等",obj1, obj2); //断言两个值相等。值可能是类型有 int, short, long, byte, char or java.lang.Object. 第一个参数是一个可选的字符串消息

        assertSame("地址相同",obj3, obj4); //断言，两个对象引用相同的对象

        assertNotSame("地址不相同",obj2, obj4); //断言，两个对象不是引用同一个对象

        assertNotNull("值不为空",obj1);//断言一个对象不为空(null)

        assertNull("值为空",obj5); //断言一个对象为空(null)

        assertTrue("条件成立", var1 == var2); //断言一个条件为真,这里很明显var!=var2

        assertArrayEquals(arithmetic1, arithmetic2);//断言预期数组和结果数组相等。数组的类型可能是 int, long, short, char, byte or java.lang.Object
    }

}
