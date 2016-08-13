
public class SquareRecursiveAppl {

	public static void main(String[] args) {
		int x = 11;
		System.out.println(x + " * " + x + " = " + sumX(x,x));
		System.out.println(x + " * " + x + " * " + x + " = " + cube(x));

	}

	private static int cube(int x) {
		int sq = sumX(x,x);
		return sumX(x,sq);
	}

	private static int sumX(int x, int i) {
		if(i == 1) return x;
		return x + sumX(x, i - 1);
	}

}
