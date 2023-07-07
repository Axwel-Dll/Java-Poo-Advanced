package Pooadvanced;

import java.util.Random;

public class BankAccount {
	private String numCuenta = "";
	private double saldoCuentaCorriente = 0.0;
	private double saldoCuentaAhorro = 0.0;
	private static int cuentasCreadas = 0;
	private static double saldoTotal = 0.0;

	public BankAccount() {
		super();
		this.numCuenta = crearCuenta();
		cuentasCreadas++;

	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}

	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public double getSaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}

	public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaAhorro = saldoCuentaAhorro;
	}

	private String crearCuenta() {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			numCuenta += String.valueOf(random.nextInt(10));
		}
		return numCuenta;
	}

	public void depositar(double monto, String tipo) {
		if (tipo == "ahorro") {
			this.saldoCuentaAhorro += monto;
			System.out.println("Depositas en cuenta " + tipo + " $" + monto);
		} else if (tipo == "corriente") {
			this.saldoCuentaCorriente += monto;
			System.out.println("Depositas en cuenta " + tipo + " $" + monto);
		} else {
			System.out.println("Elija el tipo de cuenta: ahorro/corriente");
		}
		saldoTotal -= monto;
	}

	public void retirar(double monto, String tipo) {
		if (tipo == "ahorro") {
			if (monto <= this.saldoCuentaAhorro) {
				this.saldoCuentaAhorro -= monto;
				System.out.println("Retiras en cuenta " + tipo + " $" + monto);
				saldoTotal -= monto;
			} else {
				System.out.println("No tiene fondos suficiente para realizar esta accion.");
			}
		} else if (tipo == "corriente") {
			if (monto <= this.saldoCuentaCorriente) {
				this.saldoCuentaCorriente -= monto;
				System.out.println("Retiras en cuenta " + tipo + " $" + monto);
			} else {
				System.out.println("No tiene fondos suficiente para realizar esta accion.");
				saldoTotal -= monto;
			}
		} else {
			System.out.println("Elija el tipo de cuenta: ahorro/corriente");
		}
	}

	public void verSaldoCuentas() {
		System.out.println("[Saldo Cuenta Corriente = $" + saldoCuentaCorriente
				+ ", saldo Cuenta Ahorro = $" + saldoCuentaAhorro + "]");
	}

	public void cantCuentasCreadas() {
		System.out.println(cuentasCreadas);
	}


}
