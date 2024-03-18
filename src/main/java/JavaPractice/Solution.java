package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Inputs you Want");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name and Number");

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i <= n; i++) {
            String name = sc.nextLine();
            String number = sc.nextLine();

            map.put(name, number);

        }

        System.out.println("Enter the name whose Phone no. you want to retrieve");
        String name = sc.nextLine();

        if(map.containsKey(name))
        {
            System.out.println(map.get(name));
        }
        else {
            System.out.println("Not found");

        }



       /* for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(entry.getValue());
            } else {
                System.out.println("Not found");

            }
        }*/
    }
}