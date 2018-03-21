package string;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new JewelsAndStones().numJewelsInStones("aA", "aAAbbbb"));
		System.out.println(new JewelsAndStones().betterSolution("aA", "aAAbbbb"));
	}

	// time complexity O(MN)
	public int numJewelsInStones(String J, String S) {
		int output = 0;
		String[] jewelArray = J.split("");
		String[] stoneArray = S.split("");
		for (int m = 0; m < jewelArray.length; m++) {
			for (int n = 0; n < stoneArray.length; n++) {
				if (jewelArray[m].equals(stoneArray[n])) {
					output += 1;
				}
			}
		}
		System.out.println("Output:" + output);
		return output;
	}

	// time complexity O(M+N)
	public int betterSolution(String J, String S) {
		int output = 0;
		Set setJ = new HashSet();
		for (char j : J.toCharArray())
			setJ.add(j);
		for (char s : S.toCharArray())
			if (setJ.contains(s))
				output++;
		System.out.println("Output in betterSolution method :" + output);
		return output;
	}

}
