public class Intro2DArrays {
	public static void main(String[] args) {
		
		//declaration
		int[][] x = new int[3][4];	// [rows][columns]
		
		x[0][0] = 1;	//Top-left corner
		x[1][2] = 3;	//Bottom-right corner 
		System.out.println(x[0][0] + " " + x[1][2]);
		
		System.out.print(x.length);		//# of rows
		System.out.print(",");
		System.out.print(x[0].length);	//# of columns
		
		for (int row = 0; row < x.length; row++) {
			System.out.println("");
			for(int col = 0; col < x[0].length; col++) {
				x[row][col] = row+1 * col+1;
				System.out.print(x[row][col] + " ");
			}
		}
		
	}
}
