import java.util.Scanner;


public class InputString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();//so that the spaces after the integer input are not taken as input for the string
        String s = sc.nextLine();

        System.out.println(n + " " + s);
        sc.close();
    }
}


