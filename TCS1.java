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


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Dutch National Algorithm for 3-way partitioning   0 will index from 0 to low-1, 1 will be from low to mid-1, 2 will be from high+1 to n-1 when high crosses mid array is sorted..
    private static void dutchNationalFlag(int arr[], int n){
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }

            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
    }

    //String Based Questions!!

    private static String longest_common_prefix(String []s){
        StringBuilder ans = new StringBuilder();
        Arrays.sort(s);
        char [] first = s[0].toCharArray();
        char [] last = s[s.length-1].toCharArray();

        for(int i = 0; i < first.length; i++){
            if(first[i] == last[i]){
                ans.append(first[i]);
            }else{
                break;
            }
        }
        return ans.toString();
    }


    private static void daysCalculator(String s, int d){
        HashMap<String, Integer> dayMap = new HashMap<>();
        dayMap.put("Monday", 6);
        dayMap.put("Tuesday", 5);
        dayMap.put("Wednesday", 4);
        dayMap.put("Thursday", 3);
        dayMap.put("Friday", 2);
        dayMap.put("Saturday", 1);
        dayMap.put("Sunday", 0);

        int ans = 0;
        if(d - dayMap.get(s) > 1){
            ans = 1 + (d - dayMap.get(s)) / 7;
        }
        System.out.println("Answer is: " + ans);
    }

    // Matrix Based Questions!!
    private static void maxRowsOnes(int arr[][], int r, int c){
        int max_ones = -1;
        int row_index = 0;
        for(int i = 0; i < r; i++){
            int cnt = 0;
            for(int j = 0; j < c; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
            if(cnt > max_ones){
                max_ones = cnt;
                row_index = i;
            }
        }
        System.out.println("Row with maximum 1's is: " + row_index);
    }

    public static void main(String[] args) {
        // positiveandNegativeHash();
        // greatestPriorElementCount();
        // System.out.println("Answer of odd ballons is : " + oddBalloonCount());
        // oddBalloonCount1();
        // monkeySitting(10, 3, 4, 14, 4);
        // int arr[] = {0, 1, 2, 0, 1, 2};
        // dutchNationalFlag(arr, arr.length);
        // System.out.println("Sorted array is: ");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        //}
        // System.out.println(longest_common_prefix(new String[]{"flower", "flow", "flight"}));
        // daysCalculator("Monday", 15);
        int arr[][] = {{0, 1, 1, 1},
                       {0, 0, 1, 1},
                       {1, 1, 1, 1},
                       {0, 0, 0, 0}};
        maxRowsOnes(arr, 4, 4);
    }
}
