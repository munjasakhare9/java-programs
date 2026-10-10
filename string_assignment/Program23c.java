
class Program23c {
    private static int countNumberOfWords(String s1) {
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (!Character.isWhitespace(s1.charAt(i))
                    && (i == 0
                    || Character.isWhitespace(s1.charAt(i - 1)))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "i am java developer  since 2020c";
        System.out.println(countNumberOfWords(s1));
    }
}
