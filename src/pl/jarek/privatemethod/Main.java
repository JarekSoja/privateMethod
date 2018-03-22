package pl.jarek.privatemethod;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args)throws Exception {

        Class c = PrivateMethodClass.class;
        Object o = c.newInstance();
        Method m = c.getDeclaredMethod("add", int.class);
        m.setAccessible(true);
        m.invoke(o, 4);

    }
}  