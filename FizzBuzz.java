import java.util.Scanner;

public class FizzBuzz {

	/*
	 * ＜概要＞ １から入力された整数の値を順に表示する
	 * ＜詳細＞ ①キーボードから整数を入力する
	 *			②入力された数字まで１から順に表示し、
	 *			　３の倍数は"Fizz"、５の倍数は"Buzz"、両方に該当する数字は"FizzBuzz"と表示する
	 * ＜備考＞
	 */
	public static void main(String[] args) {

		//変数初期化
		int number = 0;

		Scanner sc = new Scanner(System.in);

		//入力受付開始
		System.out.println("整数を入力してください");
		number = sc.nextInt();

		//表示処理
		for(int i =1; i <= number; i++){

			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}

		//リソース解放
		sc.close();

	}

}
