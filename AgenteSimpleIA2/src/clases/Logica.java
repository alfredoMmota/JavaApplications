package clases;

public class Logica {

	private int x;
	private int y;
	private int[10][10] pos;

	public Logica() {

	}

	public Logica(int pos1, int pos2) {
		x = pos1;
		y = pos2;
		pos = new int[x][y];
	}

	public int[][] getPos() {
		return pos;
	}

	public void setPos(int[][] pos) {
		this.pos = pos;
	}

	public int[][] PosS1(int p, int p1) {
		int[][] mov;

		mov = new int[p - 1][p1 - 1];

		return mov;

	}

	public int[][] PosS2(int p, int p1) {
		int[][] mov;

		mov = new int[p - 1][p1];

		return mov;

	}

	public int[][] PosS3(int p, int p1) {
		int[][] mov;

		mov = new int[p - 1][p1 + 1];

		return mov;

	}

	public int[][] PosS4(int p, int p1) {
		int[][] mov;

		mov = new int[p][p1 + 1];

		return mov;

	}

	public int[][] PosS5(int p, int p1) {
		int[][] mov;

		mov = new int[p + 1][p1 + 1];

		return mov;

	}

	public int[][] PosS6(int p, int p1) {
		int[][] mov;

		mov = new int[p + 1][p1];

		return mov;

	}

	public int[][] PosS7(int p, int p1) {
		int[][] mov;

		mov = new int[p + 1][p1 - 1];

		return mov;

	}

	public int[][] PosS8(int p, int p1) {
		int[][] mov;

		mov = new int[p][p1 - 1];

		return mov;

	}

}
