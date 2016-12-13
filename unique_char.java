public class unique_char{
	public static boolean[] appear = new boolean[256];
	public static void unique_test(String input){
		char[] word = input.toCharArray();
		for(int i = 0; i < word.length; i++){
			if(appear[word[i]] == false)
				appear[word[i]] = true;
			else
				System.out.println("found" + word[i]);
		}
	}
	public static void test(){
		String input = "aaaxx";
		unique_test(input);
	}
	public static void main(String[] args){
	unique_char.test();
	}
}
