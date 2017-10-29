import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger p = BigInteger.ONE;
        BigInteger k = new BigInteger("250000000000000");
        BigInteger twelve = new BigInteger("12");
        BigInteger eleven = new BigInteger("11");
        BigInteger two = new BigInteger("2");
        p = k.multiply(twelve).add(eleven);
        //k = k.add(BigInteger.ONE);
        BigInteger div = (p.subtract(BigInteger.ONE)).divide(two);

        Boolean pass = false;
        while (!pass) {
            if (p.isProbablePrime(100) == false){
                p = k.multiply(twelve).add(eleven);
                k = k.add(BigInteger.ONE);
                div = p.subtract(BigInteger.ONE).divide(two);
            }
            else if (div.isProbablePrime(100) == false){
                p = k.multiply(twelve).add(eleven);
                k = k.add(BigInteger.ONE);
                div = (p.subtract(BigInteger.ONE).divide(two));
            } else{
                pass = true;
            }

            //count--;
        }

        System.out.println("p = " + p);
        System.out.println("k = "+ k);

    }
}
