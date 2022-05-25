package gugudan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan_basic {
	
	public static void main(String[] args)throws IOException {
		
		// 2단
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	
		
		//while 문 사용
		/*int p = 1;
		
		System.out.println("<" + n + "단 곱셈표>");
		
		while(p < 10) {
			System.out.println(n + " x " + p + " = " + n*p);
			p++;
		}*/
		
		
		// for 문 사용
		System.out.println("<" + n + "단 곱셈표>");
		
		for(int i = 1; i < 10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);			
		}
	}

}
