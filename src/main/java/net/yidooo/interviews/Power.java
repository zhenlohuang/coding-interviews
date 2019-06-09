package net.yidooo.interviews;

/**
 * 数值的整数次方
 */
public class Power {
    public double power(double base, int exponent) {
        if(base == 0) {
            return 0;
        } else if(exponent == 0) {
            return 1;
        } else {
            int unsignedExponent = exponent;
            if(exponent < 0) {
                unsignedExponent = -1 * exponent;
            }
            double result;
            if(unsignedExponent % 2 == 0) {
                double part = power(base, unsignedExponent / 2);
                result = part * part;
            } else {
                double part = power(base, (unsignedExponent - 1) / 2);
                result = base * part * part;
            }
            if(exponent < 0) {
                return 1 / result;
            } else {
                return result;
            }
        }
    }
}
