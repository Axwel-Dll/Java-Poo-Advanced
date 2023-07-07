package Pooadvanced;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.depositar(15000, "ahorro");
		b1.retirar(1000, "ahorro");
		
		b1.depositar(5000, "corriente");
		b1.retirar(10000, "corriente");

		b1.verSaldoCuentas();
		
//		b1.cantCuentasCreadas();
//		System.out.println(b1.getNumCuenta());
	}

}
