import java.util.HashMap;
import java.util.HashSet;

/*
 * @
 * @author: zouzy
 * @date: 2026/1/6 17:09
 **/
public class test {
	public static void main(String[] args) {
		// 测试用例
		boolean result = new test().canConstruct("a", "b");
		System.out.println(result);
	}

	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : magazine.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : ransomNote.toCharArray()) {
			if (!map.containsKey(c) || map.get(c) == 0) {
				return false;
			}
			map.put(c, map.get(c) - 1);
		}
		return true;	
	}
}
