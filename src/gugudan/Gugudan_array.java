package gugudan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan_array {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] result = new int[9];
		
		System.out.println("<" + n + "단 곱셈표>");
		
		for(int i = 1; i < result.length; i++) {
			result[i] = i * n;
			System.out.println(n + " x " + i + " = " + result[i]);
		}
	}

}
