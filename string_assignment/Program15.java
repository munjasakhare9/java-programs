class Program15{
    public static void main(String args[]){
        String s1="hello i am java developer   ";
        int count=0;

        int i=s1.length()-1;

        while(i>=0 && s1.charAt(i)==' '){
            i--;
        }

        while(i>=0 && s1.charAt(i)!=' '){
            count++;
            i--;
        }

        System.out.println("Length of Last word :- "+count);
    }
}