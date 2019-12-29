package main.java.example;

/**
 * @author 苏若墨
 */
public class MutableObjOperaTest {
	
	private static int time = 50000;

    public static void main(String[] args) {

        testString();
        
        testString1();

        testStringBuffer();

        testStringBuilder();

        test1String();

        test2String();

    }      

    public static void testString () {

        String s="";

        long begin = System.currentTimeMillis(); 

        for(int i=0; i<time; i++){ 

            s += "java"; 

        } 

        long over = System.currentTimeMillis(); 

        System.out.println("String:"+s.getClass().getName()+"消耗时间"+(over-begin)+"ms");

    }
    
    public static void testString1 () {

        String s="";

        long begin = System.currentTimeMillis(); 

        for(int i=0; i<time; i++){ 

            s = s + i; 

        } 

        long over = System.currentTimeMillis();

        System.out.println("String:"+s.getClass().getName()+"消耗时间"+(over-begin)+"ms");

    }     

    public static void testStringBuffer () {

        StringBuffer sb = new StringBuffer();

        long begin = System.currentTimeMillis(); 

        for(int i=0; i<time; i++){ 

            sb.append("java"); 

        } 

        long over = System.currentTimeMillis();

        System.out.println("StringBuffer:"+sb.getClass().getName()+"消耗时间"+(over-begin)+"ms");

    }
    
    public static void testStringBuilder () {

        StringBuilder sb = new StringBuilder();

        long begin = System.currentTimeMillis(); 

        for(int i=0; i<time; i++){ 

            sb.append("java"); 

        } 

        long over = System.currentTimeMillis();

        System.out.println("StringBuilder"+sb.getClass().getName()+"消耗时间"+(over-begin)+"ms");

    }

    public static void test1String () {

        long begin = System.currentTimeMillis(); 

        for(int i=0; i<time; i++){ 

            String s = "I"+"love"+"java"; 

        } 

        long over = System.currentTimeMillis(); 

        System.out.println("耗时"+(over-begin)+"ms");

    }

    public static void test2String () {

        String s1 ="I";

        String s2 = "love";

        String s3 = "java";

        long begin = System.currentTimeMillis(); 

        for(int i=0; i<time; i++){ 

            String s = s1+s2+s3; 

        } 

        long over = System.currentTimeMillis(); 

        System.out.println("耗时"+(over-begin)+"ms");

    }
}
