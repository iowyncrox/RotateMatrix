import java.util.Arrays;

public class Test {

	public static int[][] rotateMatrixRight(int[][] matrix) {
		int w = matrix.length;
		int h = matrix[0].length;
		// w and h swapped
		int[][] result = new int[h][w];
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				result[i][j] = matrix[w - j - 1][i];
			}
		}
		return result;
	}

	public static int[][] rotateMatrixLeft(int[][] matrix) {
		int w = matrix.length;
		int h = matrix[0].length;
		// w and h swapped
		int[][] ret = new int[h][w];
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				ret[i][j] = matrix[j][h - i - 1];
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int[][] result1 = rotateMatrixRight(array);
		int[][] result2 = rotateMatrixLeft(array);
		System.out.println(Arrays.deepToString(result1));
		System.out.println(Arrays.deepToString(result2));
	}
}