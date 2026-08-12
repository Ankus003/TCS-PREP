import java.util.*;
public class Main {
    public static void main(String[] args) {

        // Inputs in array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int arr[] = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            // arr[i] = sc.nextInt();
            arr.add(sc.nextInt());
        }

        for(int a:arr){
            System.out.print(a+" ");
        }
        sc.close();
    }
}