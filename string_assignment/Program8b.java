class Program8b {
    public static void main(String args[]) {

        String s1 = "iamjavadeveloper";
        String target = "java";

        int k = target.length();

        for(int i = 0; i <= s1.length() - k; i++) {

            int j = 0;

            for(; j < k; j++) {

                if(s1.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }

            if(j == k) {
                System.out.println(target + " is substring of :- " + s1);
                return;
            }
        }

        System.out.println(target + " is not substring of :- " + s1);
    }
}