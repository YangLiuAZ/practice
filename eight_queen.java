public class eight_queen{
	public void greeting(){
		System.out.println("hello");
	}
	public void queens(int num){
		int[] column_pos = new int[num];
		queen_helper(num,column_pos,0);
	}
	public void printQueens(int[] column_pos){
		int width = column_pos.length;
		for( int i = 0; i < width; i++){
	
			for(int j = 0; j < width; j++){
			if(column_pos[i] == j)
				System.out.print('0');
			else 
				System.out.print('1');
			}
			System.out.println();
		}
		System.out.println();
	}
	public boolean valid_placement(int[] columns, int row, int choice){
		for(int i = 0; i < row; i++){
			if(columns[i] == choice)
				return false;
			else if(row + choice == columns[i] + i)
				return false;
			else if(row + columns[i] == choice + i)
				return false;
		}
		return true;
	}
	public void queen_helper(int num, int[] columns, int row){
		if(row == num){
			printQueens(columns);
		}
		
		for(int choice = 0; choice < num; choice++){
			if(true == valid_placement(columns, row, choice)){
				columns[row] = choice;
				queen_helper(num,columns,row+1);
			}
		}
	}
	public static void main(String[] args){
	eight_queen instance = new eight_queen();
	instance.greeting();
	instance.queens(2);
	}
}
