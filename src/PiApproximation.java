import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class PiApproximation {
    private BigInteger bigInteger;
    private BigDecimal bigDecimal;

    public BigDecimal PiApproxiCal(BigInteger bigInteger) {
        this.bigInteger = bigInteger;
        BigInteger k = bigInteger;
            BigDecimal piApproximation = BigDecimal.ZERO;
            boolean positive = true;

            for (BigInteger i = BigInteger.ONE; i.compareTo(k) <= 0; i = i.add(BigInteger.TWO)) {
                BigDecimal term = BigDecimal.ONE.divide(new BigDecimal(i), 100, RoundingMode.HALF_EVEN);
                if (positive) {
                    piApproximation = piApproximation.add(term);
                } else {
                    piApproximation = piApproximation.subtract(term);
                }
                positive = !positive;
            }

            piApproximation = piApproximation.multiply(BigDecimal.valueOf(4));
            return piApproximation;
        }
    }