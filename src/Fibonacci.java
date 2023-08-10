import java.math.BigInteger;
class Fibonacci {
    private BigInteger bigInteger;
    private BigInteger a;
    private BigInteger b;
    public BigInteger[] FibonacciCAl(BigInteger bigInteger)

    {
        this.bigInteger =bigInteger;
        BigInteger x = BigInteger.ZERO;
        BigInteger y = BigInteger.ONE;
        BigInteger k;
        long startTime = System.currentTimeMillis();
        for (BigInteger i = BigInteger.TWO; i.compareTo(bigInteger) < 0; i = i.add(BigInteger.ONE)) {
            k = x.add(y);
            x = y;
            y = k;
        }
       String Str = y.toString();
        BigInteger c = BigInteger.valueOf(Str.length());
        return new BigInteger[]{this.a=y, this.b=c};

    }
}

