public class brackets{
	public static char[] result;
	public static void bfs(){
		int num_of_brackets = 3;
		result = new char[2*num_of_brackets];
		bfs_helper(num_of_brackets, 0, 0, 0);

	}
	public static void bfs_helper(int num, int start, int left_count, int right_count){
		if(start == 2*num){
			System.out.println(result);
		}
			if(left_count < num){
				result[start] = '{';
				bfs_helper(num,start+1,left_count+1,right_count);
			}
			if(right_count < left_count){
				result[start] = '}';
				bfs_helper(num,start+1,left_count,right_count+1);
			}
			
	}
	public static void main(String[] args){
	brackets.bfs();
	}
}
