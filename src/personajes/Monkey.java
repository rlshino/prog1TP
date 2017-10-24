package personajes;

import java.awt.Color;

import elementos.Barril;
import elementos.Viga;
import entorno.Entorno;

public class Monkey {
	private int x;
	private int y;
	private int altura;

	public Monkey(int x, int y) {
		this.x = x;
		this.y = y;
		this.altura = 60;
	}

	public void dibujarse(Entorno entorno) {
		entorno.dibujarTriangulo(this.x, this.y, this.altura, 40, -Math.PI / 2, Color.green);
	}

	public void mover(int dx) {
		this.x = this.x + dx;
	}

	public Barril lanzarBarril() {
		int x_barril = this.x;
		int y_barril = this.y + (altura / 3);

		return new Barril(x_barril, y_barril);
	}

	/**
	 * 
	 * @param viga
	 * @return true si llego al tope false si aún no
	 */
	public boolean llegoTope(Viga viga) {
		return x == 500 || x == 50;
	}

	public int getY() {
		return y;
	}

	public int primeraViga() {
		return y + altura / 2;
	}

}
