package hackerRank;

public class StringSplits {
    public static void main(String[] args) {
        String s = "welcomeToJava";
        int k = 3;

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String currentSubstring = s.substring(i, i + k);

            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }

            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
