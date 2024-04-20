public interface CuentaBancaria {
    public String nombreCliente = new String();
    public double saldo();
    void depositar(double cantidad);
    double consultarsaldo();
    public CuentaBancaria(String nombreCliente, double saldoinicial) {
        this.nombreCliente = nombreCliente;
        this.saldo = saldoinicial;
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Se retiraron $" + cantidad + ". Saldo actual: $" + saldo);
            } else {
                System.out.println("Error: saldo insuficiente para realizar el retiro");
            }
        } else {
            System.out.println("Error: La cantidad a retirar debe ser mayor que cero");
        }
    }
        public double ObtenerSaldo() {
            return saldo;
        }

        public String obtenerNombredelCLiente(){
            return nombreCliente;
        }
}
