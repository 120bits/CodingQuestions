public class AllReverseStringSolution {
	
	public static String reverseStringFunc1(String str) {
		StringBuilder reverse = new StringBuilder(str);
		return reverse.toString();
	}
	
	public static String reverseStringFunc2(String str) {
		char[] char_array = str.toCharArray();
		StringBuilder reverse = new StringBuilder(str.length());
		for (int i = char_array.length - 1; i >= 0; --i) {
			reverse.append(char_array[i]);
		}
		return reverse;
	}
	
	public static String reverseStringFunc3(String str) {
		char[] char_array = str.toCharArray();
		StringBuilder reverse = new StringBuilder(str.length());
		for (int i = char_array.length - 1; i >= 0; --i) {
			reverse.append(char_array[i]);
		}
		return reverse;
	}
	
	public static String reverseStringFunc4(String str) {
		byte[] strAsBytesArray = str.getBytes();
		byte[] reverseBytes = new byte[strAsBytesArray.length];
		for (int i = 0; i < strAsBytesArray.length; i++) {
			reverseBytes[i] = strAsBytesArray[strAsBytesArray.length - i - i];
		}
		return new String(reverseBytes);
	}
}
