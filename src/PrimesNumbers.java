import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimesNumbers {
    private BigInteger n;

    public boolean isPrime(BigInteger input) {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger i = two;
        while (i.compareTo(input.divide(two)) < 0) {
            if (input.mod(i).equals(BigInteger.ZERO)) {
                return false;
            }
            i = i.add(BigInteger.ONE);
        }
        return true;
    }

    public List<BigInteger> primecalcu(BigInteger bigInteger) {
        List<BigInteger> primeList = new ArrayList<>();
        BigInteger i = BigInteger.TWO;
        this.n = bigInteger;
        for (i = BigInteger.TWO; i.compareTo(bigInteger) <= 0; i = i.add(BigInteger.ONE)) {
            if (isPrime(i)) {
                System.out.println(i);
                primeList.add(i);
            }
        }
        return primeList;
    }
}

