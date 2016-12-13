public class urlify{
	public static void test(){
		String input = "  as dgt ";
		System.out.println(trans(input, 100));
	}
	public static String trans(String input, int max_size){
		int space_counter = 0;
		char[] res_buffer = new char[max_size];
		for(int i = 0; i < input.length(); i++){
			if( input.charAt(i) == ' ')
				space_counter++;
		}
		int j = input.length() - 1;
		for(int i = space_counter * 2 + input.length() - 1; i >= 0; i--){
				if(input.charAt(j) == ' '){
					i = i - 2;
					res_buffer[i] = '%';
					res_buffer[i+1] = '2';
					res_buffer[i+2] = '0';
				}
				else{
				res_buffer[i] = input.charAt(j);
				}
				j--;
		}
		for( int k = 0; k < space_counter * 2 + input.length(); k++)
			System.out.print(res_buffer[k]);
		System.out.println();
		return res_buffer.toString();
	}
	public static void main(String[] args){
	urlify.test();
	}
}
