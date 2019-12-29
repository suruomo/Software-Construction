package main.java.regexes;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 判断表达式是否合法
 * @author 苏若墨
 */
public class JudgeExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expression =sc.nextLine();
        System.out.println(judge(expression));
    }

    /**
     * 判断表达式是否合法
     * @param expression
     * @return
     */
    private static boolean judge(String expression) {
        if(!expression.endsWith("#")){
            return false;
        }
        expression=expression.substring(0,expression.length()-1);
        String regex ="((\\[([0-9a-z].)(0-9a-z.){2,}+\\])|([0-9a-z]*(.[0-9a-z]+)?))((\\+|\\-|\\*|\\/)((\\[([0-9a-z].)([0-9a-z].){2,}+\\])|([0-9a-z]*(.[0-9a-z]+)?)))+";
        Pattern p=Pattern.compile(regex);
        return p.matcher(expression).matches();
    }
}
