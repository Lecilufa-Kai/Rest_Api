package n26.nicolas.utils;

import java.math.BigDecimal;

public class MathUtil {
	private static final int SCALE = 2;// default scale


	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}


	public static double sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}


	public static double mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}


	public static double div(double v1, double v2) {
		return div(v1, v2, SCALE);
	}

	public static double div(double v1, double v2, int scale) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	

	public static double round(double d, int scale) {
		BigDecimal b1 = new BigDecimal(Double.toString(d));
		return b1.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}