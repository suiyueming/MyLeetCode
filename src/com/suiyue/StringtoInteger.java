package com.suiyue;

public class StringtoInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("result = " + myAtoi("        1"));

	}
	
	/*
	 * 1、不符合格式的输出0
	 * 2、字符串首尾的空格忽略
	 * 3、溢出的输出最大值
	 * 4、开头的一部分符合整数的形式则只输出开头的一部分
	 * 5、±号
	 */
	public static int myAtoi(String str) {
		str = str.trim();
		boolean isNegative = false;
		int result = 0;
		if (str.length() == 0) {
			return 0;
		} else if (str.charAt(0) == '-') {
			isNegative = true;
			if (str.length() == 1) {
				return 0;
			}
			str = str.substring(1);
			System.out.println(str);
		} else if(str.charAt(0) == '+') {
			if (str.length() == 1) {
				return 0;
			}
			str = str.substring(1);
		}
		int i = 0;
		while (i<str.length() && str.charAt(i)>47 && str.charAt(i)<58) {
			if (isNegative) {
				result = result * 10 - (str.charAt(i) - '0');
			} else {
				result = result * 10 + (str.charAt(i) - '0');
			}
			if (result == 0) {
				i++;
				continue;
			}
			if (isNegative) {
				if(result + (str.charAt(i) - '0') != result/10 * 10) {
					return isNegative?-2147483648:2147483647;
				}
			} else {
				if(result - (str.charAt(i) - '0') != result/10 * 10) {
					return isNegative?-2147483648:2147483647;
				}
			}
			
			i++;	
		}
		
		return result;
        
    }

}
