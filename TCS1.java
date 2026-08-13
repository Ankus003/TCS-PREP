import java.util.*;
import java.io.*;



public class TCS1 {
private static void positiveandNegativeHash(){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int cnt_star = 0;
    int cnt_hash = 0;
    for(char ch : s.toCharArray()){
        if(ch == '*'){
            cnt_star++;
        }else if(ch == '#'){
            cnt_hash++;
        }
    }
    int diff = cnt_star - cnt_hash;
        if(diff < 0){
            System.out.println("Negative");
        } else if(diff > 0){
            System.out.println("Positive");
        } else {
            System.out.println("Neutral");
        }
    System.out.println("Difference: "+ diff);
    sc.close();
    }

    private static void greatestPriorElementCount(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[n];

        arr[0] = sc.nextInt();
        int cnt = 1;
        int mx = arr[0];
        for(int i = 1; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > mx){
                cnt++;
                mx = arr[i];
            }
        }
        System.out.println("Greatest prior element count: " + mx + " " + cnt);
        sc.close();
    }

    private static char oddBalloonCount(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [] arr = new char[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }

        HashMap<Character, Integer> map = new HashMap<>(); 
        char ans = ' ';
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+ 1 );
        }
        for(int i = 0; i < n; i++){
            if(map.get(arr[i]) % 2 != 0){
                ans = arr[i];
                break;
            }
        }
        sc.close();
        return ans;
    }

    private static void oddBalloonCount1(){ //XOR based only for single odd element
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [] arr = new char[n];

        char ans = ' ';
        for(int i = 0; i < n ; i++){
            arr[i] = sc.next().charAt(0);
            ans ^= arr[i];
        }
        sc.close();
        System.out.println("Odd balloon is: " + ans);
    }

    private static void monkeySitting(int n, int k, int j, int m, int p) {
    // n = 10  → total monkeys
    // k = 3   → bananas per monkey
    // j = 4   → peanuts per monkey
    // m = 14  → total bananas
    // p = 4   → total peanuts

    // Number of monkeys who can eat full banana portions
    int bananaMonkeys = m / k;
    int remainingBananas = m % k;

    // Number of monkeys who can eat full peanut portions
    int peanutMonkeys = p / j;
    int remainingPeanuts = p % j;

    // Total monkeys that have already eaten
    int monkeysGone = bananaMonkeys + peanutMonkeys;

    // Monkeys remaining on the tree
    int monkeysLeft = n - monkeysGone;

    // One last monkey can eat the remaining bananas + peanuts
    if (remainingBananas > 0 || remainingPeanuts > 0) {
        monkeysLeft--;
    }

    System.out.println("Monkey left: " + monkeysLeft);
}



    public static void main(String[] args) {
        // positiveandNegativeHash();
        // greatestPriorElementCount();
        // System.out.println("Answer of odd ballons is : " + oddBalloonCount());
        // oddBalloonCount1();
        monkeySitting(10, 3, 4, 14, 4);
    }
}
