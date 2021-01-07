 import java.util.Scanner;
 class forname {
    public static void main(String aa[]){

        Scanner s = new Scanner(System.in);
            System.out.println("Please enter a five digit number"); //34 56 7/10000   4567/1000   7
             
            int  num = s.nextInt(); // 34567
            int count=10;
            int output=0;
             
            for(int i=0;i<5;i++){
                     output= num%count;
                      num=num/count;
                     System.out.println(output);
                     count=count*10;
                }


                  



                // int output =  num/10000;
                // System.out.println(output);
                // num = num%10000;
                // System.out.println(   num/1000 );
                // num =  num%1000;
                // System.out.println(num/100);
                // num = num%100;
                //  System.out.println(num/10);
                // num = num%10;
                // System.out.println(num);
            
               

    }
}


