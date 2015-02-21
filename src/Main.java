
public class Main {

	public static void main(String [] args){
		
		int [] a = {3,3,2};//column
		int [] b = {3,2,3};//row
		
		int [] [] matrix = new int [3][3];
		
		int [] [] matrix_min = new int [3][3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				matrix_min[i][j] = min(b[i],a[j]);
				
			}
		}
		
		
		int sum_row1 = 0;
		int sum_row2 = 0;
		int sum_row3 = 0;
		int sum_col1 = 0;
		int sum_col2 = 0;
		int sum_col3 = 0;
		
		
		for(int a00=0;a00<=matrix_min[0][0];a00++){
			for(int a01=0;a01<=matrix_min[0][1];a01++){
				for(int a02=0;a02<=matrix_min[0][2];a02++){
					for(int a10=0;a10<=matrix_min[1][0];a10++){
						for(int a11=0;a11<=matrix_min[1][1];a11++){
							for(int a12=0;a12<=matrix_min[1][2];a12++){
								for(int a20=0;a20<=matrix_min[2][0];a20++){
									for(int a21=0;a21<=matrix_min[2][1];a21++){
										for(int a22=0;a22<=matrix_min[2][2];a22++){
											matrix[0][0] = a00;
											matrix[0][1] = a01;
											matrix[0][2] = a02;
											matrix[1][0] = a10;
											matrix[1][1] = a11;
											matrix[1][2] = a12;
											matrix[2][0] = a20;
											matrix[2][1] = a21;
											matrix[2][2] = a22;
											
											
											
											sum_row1 = a00 + a01 + a02;
											sum_row2 = a10 + a11 + a12;
											sum_row3 = a20 + a21 + a22;
											sum_col1 = a00 + a10 + a20;
											sum_col2 = a01 + a11 + a21;
											sum_col3 = a02 + a12 + a22;
											
											
											
											
											if(sum_row1==b[0]&&sum_row2==b[1]&&sum_row3==b[2]&&sum_col1==a[0]&&sum_col2==a[1]&&sum_col3==a[2]){
												System.out.println("the grid is existing.");
												
												System.out.println("the successful matrix is:");
												System.out.println("********************");
												for(int i=0;i<3;i++){
													for(int j=0;j<3;j++){
														System.out.print(matrix[i][j]+"\t");
													}
													System.out.println();
												}
												System.out.println("********************");
												
											}
											
											
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		
		
		
		
		
		System.out.println("end the main.");
		
	}
	
	public static int min(int a, int b){

		if(a>b){
			return b;
		}
		else{
			return a;
		}
	}
	
	
}
