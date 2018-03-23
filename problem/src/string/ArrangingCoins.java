package string;

public class ArrangingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ArrangingCoins().solution(8));
		System.out.println(new ArrangingCoins().solution2(8));
	}

	public int solution(int n) {
		return (int) ((-1 + Math.sqrt(1 + 8 * (long) n)) / 2);
	}

	public int solution2(int n) {
		int i=0;
        while(n > 0){
            i+=1;
            n-=i;
        }
        
        return n==0 ? i : i-1;
	}
}
