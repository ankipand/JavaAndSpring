package WissenTech;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNum {
public static void main(String[] args) {
	BigInteger bigInt = new BigInteger("233233233233");
	BigDecimal bigDecimal = new BigDecimal(bigInt); 
	System.out.println("bigDecimal " + bigDecimal);
	int scale = 2;
	BigDecimal bigDecimal1 = new BigDecimal(bigInt, scale);
	System.out.println(bigDecimal);
}
}
