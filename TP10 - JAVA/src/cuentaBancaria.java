public class cuentaBancaria {

    private Double saldo;
    private int numCuenta;

    public cuentaBancaria() {
    }

    public cuentaBancaria(Double saldo, int numCuenta) {
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public static double depositar (double saldo, int numCuenta, double montoDepositar) {

        double montoReal = 0;
        if (montoDepositar <= 0) {

            System.out.println(numCuenta + ", No puedes depositar números negativos o 0. ");

        } else {

            montoReal = (saldo + montoDepositar);

        }

        return montoReal;
    }

    public static double retirar (double saldo, int numCuenta, double montoRetirar) {

        double montoReal = 0;
        if (montoRetirar > saldo) {

            System.out.println(numCuenta + ", No puedes retirar más de lo que tienes en la cuenta ");

        } else {

            montoReal = (saldo - montoRetirar);

        }

        return montoReal;

    }

}
