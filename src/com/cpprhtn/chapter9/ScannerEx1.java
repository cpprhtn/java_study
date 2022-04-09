package com.cpprhtn.chapter9;

import java.util.*;

class ScannerEx1 { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		String[] argArr = null;

		while(true) { 
			String prompt = ">>"; 
			System.out.print(prompt); 

			String input = s.nextLine(); 

			input = input.trim(); // 입력받은 값에서 불필요한 앞뒤 공백을 제거.
			argArr = input.split(" +");  // 입력받은 내용을 공백을 구분자로 split.

			String command = argArr[0].trim(); 

			if("".equals(command)) continue;

			command = command.toLowerCase();

			if(command.equals("q")) { 
				System.exit(0); 
			} else { 
				for(int i=0; i < argArr.length;i++) 
					System.out.println(argArr[i]); 
			} 
		}
	}
}
