class PrimeFactors {
    public static void main(String args[]) {
        int num = 60;
        int temp = num;

        for(int i = 2; i * i <= temp; i++) {
            while(temp % i == 0) {
                System.out.print(i + " ");
                temp /= i;
            }
        }

        if(temp > 1) {
            System.out.print(temp);
        }
    }
}