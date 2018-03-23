package string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new FizzBuzz().fizzBuzz(15));
		System.out.println(new FizzBuzz().betterSolution(15));
		System.out.println(new FizzBuzz().betterSolution2(15));
		System.out.println(new FizzBuzz().betterSolution3(15));
	}

	public List<String> fizzBuzz(int n) {
		if (n <= 0)
			return new ArrayList<String>();
		List<String> resArray = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			String item = String.valueOf(i);
			if (i % 3 == 0 && i % 5 == 0) {
				item = "FizzBuzz";
			} else if (i % 3 == 0) {
				item = "Fizz";
			} else if (i % 5 == 0) {
				item = "Buzz";
			} else {

			}
			resArray.add(item);
		}
		return resArray;
	}

	public List<String> betterSolution(int n) {
		return IntStream
				.range(1, n + 1).mapToObj(i -> new StringBuilder(12).append(i % 3 == 0 ? "Fizz" : "")
						.append(i % 5 == 0 ? "Buzz" : "").append((i % 3 != 0 && i % 5 != 0) ? i : "").toString())
				.collect(Collectors.toList());
	}
	
	public List<String> betterSolution2(int n) { 
		return IntStream.rangeClosed(1,n).mapToObj(FizzBuzz::toString).collect(Collectors.toList());
	}

	private static String toString(int i) {
	    if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
	    else if (i % 3 == 0) return "Fizz";
	    else if (i % 5 == 0) return "Buzz";
	    else return String.valueOf(i);
	}
	
	//to avoid % operand
	//一般来说，对于CPU取余数的运算相对来说效率很低，上面解法避免了使用大量的求余数操作，提升了程序的性能。
	public List<String> betterSolution3(int n){
		List<String> resArray = new ArrayList<String>(0);
		for(int i=1,fizz=0,buzz=0;i<=n;i++) {
			fizz++;
			buzz++;
			if(fizz==3 && buzz==5) {
				resArray.add("FizzBuzz");
				fizz=0;
				buzz=0;
			}else if(fizz==3) {
				resArray.add("Fizz");
				fizz=0;
			}else if(buzz==5) {
				resArray.add("Buzz");
				buzz=0;
			}else {
				resArray.add(String.valueOf(i));
			}
		}
		return resArray;
	}

}
