package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // Consume newline after integer input

        HashMap<String, String> phoneBook = new HashMap<String, String>();

        // Read phone book entries
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            String phone = in.nextLine();
            phoneBook.put(name, phone);
        }

        // Process queries
        while (in.hasNextLine()) {
            String query = in.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}





