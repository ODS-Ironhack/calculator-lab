public class Resta {
    public static void main(String[] args) {
       Resta calc = new Resta();
       //probamos resta de dos dobles
        System.out.println("8.5 - 1.4: " + calc.restar(8.5, 1.4));
        //probamos a restar dos enteros
        System.out.println("5 - 3: " + calc.restar(5, 3));
        //restar tres doubles
        System.out.println("9.2 - 4.6 - 1.2: " + calc.restar(9.2, 4.6, 1.2));
    }
//variable acumulador inicializar a 0

    //restar dos números double
    public double restar(double num1, double num2) {
        return num1 - num2;
    }
    //restar dos números enteros
    public int restar(int num1, int num2){
        return num1 - num2;
    }
    //restar tres números double
    public double restar(double num1, double num2, double num3){
        return num1 - num2 - num3;
    }


}
