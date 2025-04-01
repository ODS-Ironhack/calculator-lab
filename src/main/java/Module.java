public class Module {
    public static void main(String[] args) {

        Module operaciones = new Module();

        System.out.println("9 % 3: " + operaciones.calculoModulo(9, 3));
        System.out.println("|10.5|:  " + operaciones.valorAbsoluto(10.5));

    }
    public int calculoModulo(int a, int b) {
        return a % b;
    }
    public double valorAbsoluto(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }

    }
}
