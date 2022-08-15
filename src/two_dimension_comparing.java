import java.util.Arrays;
import java.util.Comparator;

public class two_dimension_comparing {

	public static void main(String[] args) {
		
		int[][] arr = {{2,5},{1,5},{1,4}};
		
		
		Arrays.sort(arr,new Comparator<int[]>()
		{
			@Override
			public int compare(int[]o1,int[]o2) {
				if(o1[0]==o2[0]) { //2차원 배열의 첫번째 요소(0번째)의 값이 같으면 2번째 요소의 값 비교 (오름차순 )
					return o1[1]-o2[1];
				}
				
				else { //2차원 배열의 첫번째 요소의 값 다르면 1번째 요소의 값 오름차순으로 정렬 
					return o1[0]-o2[0];
				}
			}
		});
		
		
		System.out.println(Arrays.deepToString(arr));

	}

}
