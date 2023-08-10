import java.lang.Math;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.MathContext;

class StirlingApproximation {
    private BigInteger bigInteger;
    public BigDecimal stirlingapp(BigInteger bigInteger)
    {
        this.bigInteger=bigInteger;
        BigDecimal factorialApproximation = calculateFactorialApproximation(bigInteger);
        return factorialApproximation;
    }

    public BigDecimal calculateFactorialApproximation(BigInteger n)
    {
        double pi = Math.PI;
        double e = Math.E;

        BigDecimal twoPiN = BigDecimal.valueOf(2 * pi * n.intValue());
        BigDecimal nOverE = new BigDecimal(n).divide(BigDecimal.valueOf(e), MathContext.DECIMAL128);
        BigDecimal powerN = nOverE.pow(n.intValue(), MathContext.DECIMAL128);

        BigDecimal factorialApproximation = twoPiN.sqrt(MathContext.DECIMAL128).multiply(powerN);

        return factorialApproximation;
    }
}
