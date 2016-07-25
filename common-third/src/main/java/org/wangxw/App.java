package org.wangxw;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer i01 = 159;
        int i02 = 159;
        Integer i03 = Integer.valueOf(159);
        Integer i04 = new Integer(159);
        System.out.println(i01 == i02);
        System.out.println(i01 == i03);
        System.out.println(i03 == i04);
        System.out.println(i02 == i04);
        System.out.println(i01 == i04);
        System.out.println( "Hello World!" );
    }
}
