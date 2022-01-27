import java.util.Scanner;

public class test {
    static String removeCharRecursive(String str ,char X)
    {
        if (str.length() ==0)
        {
            return "";
        }
        if(str.charAt (0) == X)
        {
            return removeCharRecursive(str.substring(1),X);
        }
        return str.charAt(0) + removeCharRecursive(str.substring(1),X);
    }

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println("Enter character to remove");

        Character X  = sc.next().charAt(0);

        str = removeCharRecursive(str,X);

        System.out.println(str);
    }
}