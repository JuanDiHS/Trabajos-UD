package co.edu.udistrital.model;

public class Concatenación {
	private int A, B, C;
	String concatenación;

	public Concatenación() {
		A = 0;
		B = 0;
		C = 0;
	}

	public Concatenación(int A, int B, int C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}

	public double getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public double getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public double getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public String getconcatenación() {
		return concatenación;
	}

	public void setconcatenación(String Concatenación) {
		concatenación = Concatenación;
	}

	public void Concatenar() {
		concatenación = "" + A + B + C;
	}

}
