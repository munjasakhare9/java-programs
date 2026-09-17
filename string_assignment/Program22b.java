public class Program22b {

    public static boolean checkPangram(String s) {

        boolean[] seen = new boolean[26];
        int count = 0;

        for (char ch : s.toLowerCase().toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {

                int index = ch - 'a';

                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                }
            }
        }

        return count == 26;
    }

    public static void main(String[] args) {

        String s = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkPangram(s));
    }
}