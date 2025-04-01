public class Product {

    public static int productInt(int numA, int numB) {
        return numA * numB;
    }
    public static double productDouble(double numA, double numB) {
        return numA * numB;
    }

    public static double productDouble2(double numA, double numB, double numC) {
        return numA * numB * numC;
    }

    public static int powerInt(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int numA = 5;
        int numB = 10;
        double numC = 2.5;
        int resultInt = productInt(numA, numB);
        double resultDouble = productDouble(numA, numB);
        System.out.println("The product of " + numA + " and " + numB + " is: " + resultInt);
        System.out.println("The product of " + numA + " and " + numB + " is: " + resultDouble);
        resultDouble = productDouble2(numA,numB, numC);
        System.out.println("The product of " + numA + " and " + numB + " and " + numC + " is: " + resultDouble);
        resultInt = powerInt(numA,numA);
        System.out.println("The power of " + numA + " elevate to " + numA + " is: " + resultInt);

    }
}
