class Program16{
    public static void main(String args[]){
        String s1="hello i am java developer";
        String s2="hello i am python developer";

        int i=0;

        while(i<s1.length() && i<s2.length()){

            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }

            i++;
        }

        if(i==0){
            System.out.println("-1");
        }
        else{
            System.out.println(s1.substring(0,i));
        }
    }
}