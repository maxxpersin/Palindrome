package CS353;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSubset {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		List<List<String>> testCaseOutput = new ArrayList<>();
		
		// Case 1:
		System.out.println("TEST CASE 1:");
		// input
		String testCase = "a";
		// build the expected output for case 1
		testCaseOutput.add(new ArrayList<String>(Arrays.asList("a")));
		// make method call to the solution
		List<List<String>> res = sol.partition(testCase);
		// display the result from the algorithm
		System.out.println("Your result is:");
		printListListString(res);
		// display the expected output
		System.out.println("Expected result should be:");
		printListListString(testCaseOutput);
		
		System.out.println("------");
		// Case 2:
		System.out.println("TEST CASE 2:");
		// input
		testCase = "aab";
		// build the expected output for case 1
		testCaseOutput.clear();
		testCaseOutput.add(new ArrayList<String>(Arrays.asList("a", "a", "b")));
		testCaseOutput.add(new ArrayList<String>(Arrays.asList("aa", "b")));
		// make method call to the solution
		res = sol.partition(testCase);
		// display the result from the algorithm
		System.out.println("Your result is:");
		printListListString(res);
		// display the expected output
		System.out.println("Expected result should be:");
		printListListString(testCaseOutput);
	}
	
	private static void printListListString(List<List<String>> list) {
		
		System.out.println('[');
		// traverse the list of list
		for (int i = 0; i < list.size(); i++) {
			// obtain the sublist from the list of list
			List<String> sublist = list.get(i);
			// print out the sublist
			System.out.print("[");
			
			// traverse the sublist
			if (sublist.size() == 0) {
				System.out.print("]");
			}
			else {
				for (int j = 0; j < sublist.size(); j++) {
					System.out.print(sublist.get(j));
					
					if (j == sublist.size() - 1) {
						System.out.print("]");
					}
					else {
						System.out.print(", ");
					}
				}
			}
			
			System.out.println();
		}
		System.out.println(']');
	}

}
