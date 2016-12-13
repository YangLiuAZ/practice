public class bitvector{
	public static int[] vector;
	public static void test(){
		vector = new int[100/32 + 1];
		set(10);
		set(20);
		System.out.println(check(20));
		System.out.println(check(30));
	}
	public static void set(int i){
		if(i/32 >= vector.length){
			System.out.println("wrong input exceed size");
			return;
		}
		vector[i/32] |= 1<<(i%32);
	}
	public static boolean check(int bit){
		if((vector[bit/32] & (1<<bit%32)) != 0)
			return true;
		else return false;
	}
	public static void main(String[] args){
	bitvector.test();
	}
}
