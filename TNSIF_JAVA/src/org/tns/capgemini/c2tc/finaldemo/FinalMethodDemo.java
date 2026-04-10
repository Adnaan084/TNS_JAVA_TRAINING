package org.tns.capgemini.c2tc.finaldemo;

class calc
{
    public final void show()
    {
        System.out.println("AI integration done by hema");
    }

    public void add(int a, int b)
    {
        System.out.println(a + b);
    }
}

class Advcalc extends calc
{
    // show() NOT allowed here

    public void add(int a, int b)
    {
        System.out.println("welcome");
    }
}

public class FinalMethodDemo
{
    public static void main(String[] args)
    {
        Advcalc obj = new Advcalc();

        obj.show();   // calls parent method
        obj.add(10, 20);  // calls overridden method
    }
}