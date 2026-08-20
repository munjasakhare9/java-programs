class PrintWords2 {
    public static void main(String args[]) {
        int num = 5550;
		if (num < 1 || num >= 10000) {
			System.out.println("Enter a number between 1 and 9999");
			return;
		}
        String ones[] = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        String teens[] = {
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String tens[] = {
            "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
        };
		int temp=num;//103
		int count=1;
		while(temp!=0){
			count*=10;
			temp/=10;
		}
		temp=num;
		while(temp!=0){//100
			if(temp>999){
				System.out.print(ones[temp/1000]+" thousand"+" ");
			}
			else if(temp>99){
				System.out.print(ones[temp/100]+" hundred"+" ");
			}
			else if(temp>=20){
				System.out.print(tens[temp/10]+" ");
			}
			else if(temp>=10){
				System.out.print(teens[temp-10]+" ");
			}
			else if(temp>0){
				System.out.print(ones[temp]+" ");
				break;
			}
			count/=10;
			temp%=count;
		}
    }
}