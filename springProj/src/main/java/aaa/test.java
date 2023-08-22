package aaa;



public class test {

	public static void main(String[] args) {
		
		/*
		 * System.out.printf("홍길동\n홍 길 동\n홍  길  동\n");
		 * 
		 * System.out.printf("나는 유세현이다\n"); System.out.printf("나는 인천사람이다\n");
		 * System.out.printf("내 번호는 01099231543이다\n");
		 * 
		 * int a = 123; int b = 456;
		 * 
		 * System.out.printf("제 이름은 홍길동입니다.\n"); System.out.printf("제 나이는 20살이고요.\n");
		 * System.out.printf("제가 사는 곳의 번지수는 %d-%d  입니다.", a , b);
		 */
		
		/*
		 * Scanner sc = new Scanner(System.in); int num1 = sc.nextInt(); int num2 =
		 * sc.nextInt(); int num3 = sc.nextInt();
		 * 
		 * System.out.println((num1-num2)*(num2+num3)*(num3/num1));
		 */
		
		
		
		/*
		 * Scanner sc = new Scanner(System.in); int a = sc.nextInt();
		 * 
		 * if(a%2 == 0) { System.out.println("짝수구나"); }else {
		 * System.out.println("홀수구나"); }
		 */
		
		/*
		 * Scanner sc = new Scanner(System.in); int b = sc.nextInt(); if(b < 20) {
		 * System.out.println("미성년자구나"); }else { System.out.println("성인이구나"); }
		 */
		
		int [] arr = {23, 45, 67};
		int max = arr[0];
		if(arr[0] > max) {
			max = arr[1]; 
			
		}
		else if(arr[1] > max) {
			max = arr[2];
			
		}
		else if(arr[2] > max) {
			max = arr[2];
			
		}
		System.out.println(max);
		
		
		
		
	        
		
		
	}

}
