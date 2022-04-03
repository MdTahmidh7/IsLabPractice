package Practice1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class RSA {
    public static void main(String[] args) {
        double p = 7, q = 11;
        double e, d;
        double n = p * q;
        double fiOfN = (p - 1) * (q - 1);
        double msg = 5;
        for (e = 2; e < fiOfN; e++) {
            if (gcd(e, fiOfN) == 1) {
                break;
            }
        }

        double x;
        int i;
        for (i = 1; ; i++) {
            x = (((fiOfN * i) + 1)) / e;
            if (x == (int) x) {
                d = x;
                break;
            }
        }
        System.out.println("fiOfN = " + fiOfN);
        System.out.println("The value of e = " + e);
        System.out.println(" The value of d = " + x);
        double encryption;
        encryption = Math.pow(msg, e) % n;
        System.out.println("Encryption code is = " + encryption);

        BigInteger decryption;
        BigInteger N = BigInteger.valueOf((long) n);
        BigInteger C = BigDecimal.valueOf(encryption).toBigInteger();

        decryption = (C.pow((int) d)).mod(N);
        System.out.println("The decryption Code = " + decryption);
    }

    private static double gcd(double e, double fiOfN) {
        if (e == 0) {
            return fiOfN;
        } else {
            return gcd(fiOfN % e, e);
        }
    }
}
