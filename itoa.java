public class itoa{
	public static String[] ten_digits = {"thirty","forty","fifty","sixty"};
	public static String[] one_twenty = {"","one","two","three","four","five","six","seven","eight","nine",
		"ten","eleven","twelve","thirteen"};
	public static void translate(){
		int value = 111;
		String res = translate_helper(value);
		System.out.println(res);	
	}
	public static String translate_helper(int value){
		StringBuilder res_buffer = new StringBuilder();
		char[] ch_represent = Integer.toString(value).toCharArray();
		if(ch_represent.length > 5){
			System.out.println("wrong input");
			return null;
		}
		for(int i = 0; i < ch_represent.length; i++){
			int offset = ch_represent[i] - '0';
			int digit = ch_represent.length - i;
			if(digit == 4 && offset != 0)
				res_buffer.append(one_twenty[offset] + "thousand");
			else if (digit == 3 && offset != 0)
				res_buffer.append(one_twenty[offset] + "hundred");
			else if (digit == 2 && offset >= 2)
				res_buffer.append(ten_digits[offset -2]);
			else if (digit == 2 && offset < 2){
				res_buffer.append(one_twenty[value%100]);
				i++;
				}
			else if (digit == 1  && offset > 0)
				res_buffer.append(one_twenty[offset]);
		}
		return res_buffer.toString();	
	}
	public static void main(String[] args){
		itoa.translate();
	}
}
