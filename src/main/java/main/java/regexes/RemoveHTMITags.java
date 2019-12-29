package main.java.regexes;

/**
 * 去除HTML标签
 * @author 苏若墨
 */
public class RemoveHTMITags {
    public static void main(String[] args) {
        String input = "The <b>Good</b>, the <i>Bad</i>, and the <strong>Ugly</strong>";
        String regex = "</?[^>]+>";
        String output = input.replaceAll(regex, "");
        System.out.println(output);
    }
}
