package telescope;

public class SkyView {
	
	private double[][] view;
	
	public SkyView(int numRows, int numCols, double[] scanned){
		//break scanned into parts each length numCols
		//odd number row keep order, even reverse order
		
		view = new double [numRows][numCols];
				
		for (int i = 0; i < 3; i++){
			view[0][i] = scanned[i];
			System.out.println(scanned[i]);
		}
		
		//this doesn't print out an array of doubles
		//number of items printed doesn't equal the number of items that should be in the array
		for (int i = 0; i < view.length; i++){
			System.out.println(view[i]);
		}
	}
	
	public double getAverage(int startRow, int endRow, int startCol, int endCol) {
		
		double totalVal = 0.0;
		int boxCount = 0;
		
		for (int i = startRow; i < endRow + 1; i++){
			for (int j = startCol; j < endCol + 1; j++){
				totalVal += view[i][j];
				boxCount++;
			}
		}
		
		return totalVal / boxCount;
	}
	
	public static void main(String[] args){
		double[] scanned = new double[]{0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
		SkyView s = new SkyView(4, 3, scanned);
	}
	
}
