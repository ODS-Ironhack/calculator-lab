public class Suma {

    private double valorAcumulado;

    public Suma(){
        this.valorAcumulado = 0;
    }

    // Suma de dos números de tipo double
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Suma de dos números enteros (int)
    public int sumar(int num1, int num2 ){
        return num1 + num2;
    }

    //Suma de tres números double
    public double sumar(double num1, double num2, double num3) {
        return num1 + num2 +num3;
    }

    public double getValorAcumulado() {
        return this.valorAcumulado;
    }

    public void sumarAlAcumulado(double valor) {
        this.valorAcumulado += valor;
    }
    

}
