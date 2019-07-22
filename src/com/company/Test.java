package com.company;

    class A
    {
        int x = 10;
    }

    // class B
    class B extends A
    {
        int x = 20;
    }

    // Driver class
    public class Test
    {
        public static void main(String args[])
        {
            A a = new B(); // object of type Bz

            // Data member of class A will be accessed
            System.out.println(a.x);
        }
    }

