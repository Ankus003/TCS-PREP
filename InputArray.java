// import java.util.*;
import java.io.*;
public class InputArray {
    public static void main(String[] args) {

        // Inputs in array
        // Scanner sc = new Scanner(System.in);
        // 1. Limited size input
        // int n = sc.nextInt();
        // // int arr[] = new int[n];
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     // arr[i] = sc.nextInt();
        //     arr.add(sc.nextInt());
        // }

        // for(int a:arr){
        //     System.out.print(a+" ");
        // }

        // 2. Unlimited size input Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();

        // if(s.startsWith("{") && s.endsWith("}")){ //Add this if input is in the form of {1,2,3,4,5}
        //     s = s.substring(1, s.length()-1);
        // }
        // String ch[] = s.split(" "); //Add , if it is comma separated input
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(String a:ch){
        //     int num = Integer.parseInt(a);
        //     arr.add(num);
        // }

        // for(int a:arr){
        //     System.out.print(a+" ");
        // }

        //If scanner class is not present, use bufferreader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
        int a = Integer.parseInt(br.readLine());
        double b = Double.parseDouble(br.readLine());
        byte c= Byte.parseByte(br.readLine());
        boolean d = Boolean.parseBoolean(br.readLine());
        String name = br.readLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(name);
        }catch(Exception e){
            System.out.println(e);
        }

        // sc.close();
    }
}