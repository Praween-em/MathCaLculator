import java.math.BigInteger;
import java.util.ArrayList;

public class thtreexplusone {
    public ArrayList<BigInteger> threeplusone(BigInteger n){
        ArrayList<BigInteger> array = new ArrayList<>();
        while(n.compareTo(BigInteger.ONE) != 0){
            if(n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
                n = n.divide(BigInteger.valueOf(2));
                array.add(n);
            }else{
                n = n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
                array.add(n);
            }
        }
        return array;
    }
}
