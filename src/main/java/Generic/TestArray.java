package Generic;

public class TestArray {

    public static void main(String[] args) {

        String s1[] = {"abc123", "def456", "ghi789"};
        String s2 = "Dear Candidate Thank You";

        char newchar = 0;
        for (int i = 0; i < s1.length; i++) {

            for (int j = 0; j < s1[i].length(); j++) {

                if (s1[i].charAt(j) >= 'a' && s1[i].charAt(j) < 'Z') {

                    newchar = (char) (newchar + s1[i].charAt(j));

                }

            }

        }
        System.out.println(newchar);
    }
}


