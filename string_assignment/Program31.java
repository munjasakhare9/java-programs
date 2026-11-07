
class Program31 {
    public static void main(String args[]) {

	String str = "{}{}{}";
        StringBuilder sb = new StringBuilder();

        int size = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                sb.append(ch);
                size++;
            }
            else if (size > 0 &&
                (('(' == sb.charAt(size - 1) && ch == ')') ||
                 ('[' == sb.charAt(size - 1) && ch == ']') ||
                 ('{' == sb.charAt(size - 1) && ch == '}'))) {

                sb.deleteCharAt(sb.length() - 1);
                size--;
            }
            else {
                size = -1;
                break;
            }
        }

        if (size == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
