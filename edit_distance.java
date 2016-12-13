public class edit_distance{
	public static void test(){
		System.out.println(in_one_distance("aaa","aab"));
		System.out.println(in_one_distance("aaa","aaa"));
		System.out.println(in_one_distance("aac","aa"));
	}
	public static boolean in_one_distance(String s1, String s2){
		String longer = s1.length()>s2.length()? s1:s2;
		String shorter = s1.length()>s2.length()? s2:s1;

		if(s1.length() == s2.length())
			return replace_same_test(s1,s2);
		else return edit_test(longer,shorter);
	}
	public static boolean edit_test(String s1, String s2){	
		int i  = 0, j = 0, diff_count = 0 ;
		while(i < s1.length() && j < s2.length()){
		if(s1.charAt(i) != s2.charAt(j)){
			i++;
			j--;
			diff_count++;
		}
		i++;
		j++;
		}
		return diff_count < 2;
	}
	public static boolean replace_same_test(String s1, String s2){
		int i = 0, j = 0, diff_count = 0;
		while(i < s1.length()){
		if(s1.charAt(i) != s2.charAt(j)){
			diff_count++;
		}
		i++;
		j++;
		}
		return diff_count < 2;
	}	
	public static void main(String[] args){
		edit_distance.test();
	}
}
