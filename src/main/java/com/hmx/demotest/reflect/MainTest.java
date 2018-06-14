package com.hmx.demotest.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTest {

    void doTest(){
        try {
            Class cl=Class.forName("com.hmx.demotest.reflect.MyReflectDemo");
            MyReflectDemo myReflectDemo=  (MyReflectDemo)cl.newInstance();
            //myReflectDemo
            //getFields()：获得某个类的所有的公共（public）的字段，包括父类中的字段。
          //  getDeclaredFields()：获得某个类的所有声明的字段，即包括public、private和proteced，但是不包括父类的申明字段。
           // cl.getFields()
           // cl.getDeclaredFields()
          Method method= cl.getDeclaredMethod("doWrite",new Class[]{int.class ,int.class });
            method.invoke(myReflectDemo,new Object[]{1,2});

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


        MainTest mainTest=new MainTest();
        mainTest.doTest();
    }
}
