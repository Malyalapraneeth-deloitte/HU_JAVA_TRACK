import java.util.*;
import java.lang.*;
public class StringClass {

    public static void main(String args[]) {

        String s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        s2 = sc.next();
        s3 = sc.next();
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();
        if (n1 + n2 != n3) {
            System.out.println("Invalid");
        } else {
            int flag = 0;
            int i = 0, j = 0, k = 0;
            while (k < n3) {
                if (i < n1 && s1.charAt(i) == s3.charAt(k)) i++;
                else if (j < n2 && s2.charAt(j) == s3.charAt(k)) j++;
                else {
                    flag = 1;
                    break;
                }
                k++;
            }
            if (i < n1 || j < n2) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }
        }
    }
}
