package Practice1;

import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {

        int [] privateKey = {1,2,4,10,20,40};
        int m = 110;
        int n = 31;
        int [] publicKey = new int[privateKey.length];
        int [] plainText;
        for (int i = 0; i < privateKey.length; i++) {
            int x = privateKey[i];
            int y = x*n;
            int z = y % m ;
            publicKey[i] = z;
        }
        for (int i = 0; i < publicKey.length ; i++) {
            System.out.println(privateKey[i]+"     "+publicKey[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PlainText length : ");
        int length = scanner.nextInt();
        plainText = new int[length];
        System.out.println("Enter plain Text Value : ");
        for (int i = 0; i < plainText.length ; i++) {
            plainText[i]= scanner.nextInt();
        }
        for (int i = 0; i < plainText.length ; i++) {
           // System.out.println(plainText[i]);
        }
        int sum1 = 0,sum2=0,sum3=0;
        int loopNumber = plainText.length / publicKey.length;
        System.out.println("Total loop Number = "+loopNumber);
        int j,k=0;
        for (int i = 0; i <loopNumber; i++) {
            System.out.println("Value of i = "+i);
            for (j = 0; j < publicKey.length && k<plainText.length ; j++,k++) {
                int x = plainText[k];
                int y = publicKey[j];
                if(i==0){
                    sum1 = sum1 + (x*y);
                }
                if(i==1){
                    sum2 = sum2 + (x*y);
                }
                if(i==2){
                    sum3 = sum3 + (x*y);
                }
            }
        }
        System.out.println("Sum1 = "+sum1+" Sum2 = "+sum2+" sum3 = "+sum3);
        int p =   findNInverse(n,m);
        System.out.println("The value of inverse mod = "+p);
        int a,b,c;
        a = (p*sum1) % m;
        b = (p*sum2) % m;
        c = (p*sum3) % m;
        System.out.println(" A = "+a);
        System.out.println(" B = "+b);
        System.out.println(" C = "+c);

        int result = 0 ;
        for (int i = 0; i <privateKey.length ; i++) {
            int d = privateKey[i];
            result = result+d;
            a = a -result;
            for (int l = 1; l <privateKey.length ; l++) {
                if (a == privateKey[l]){
                    result = result + publicKey[l];
                }
                else {
                    if(publicKey[l]<a)
                    result = result+publicKey[l];
                }
            }
        }



    }

    private static int findNInverse(int n, int m) {
        double x;
        for (double i = 1; ; i++) {
            x = (((m*i)+1)/n);
            if (x == (int)x){
                return (int) x;
            }
        }
    }
}
