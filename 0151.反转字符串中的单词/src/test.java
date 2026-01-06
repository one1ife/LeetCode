import java.util.Collections;

/*
 * @author: zouzy
 * @date: 2026/1/6 16:58
 **/
public class test {
	public static void main(String[] args) {
		String s = new test().reverseWords(" good   example");
		System.out.println(s);
	}

	public String reverseWords(String s) {
		String[] split = s.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		Collections.reverse(java.util.Arrays.asList(split));
		for (String str : split) {
			if (!str.equals("")) {
				stringBuilder.append(str).append(" ");
			}
		}
		return  stringBuilder.toString().trim();
		}
}
