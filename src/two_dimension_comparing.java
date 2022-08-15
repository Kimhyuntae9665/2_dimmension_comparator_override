import java.util.Arrays;
import java.util.Comparator;

public class two_dimension_comparing {

	public static void main(String[] args) {
		
		int[][] arr = {{2,5},{1,5},{1,4}};
		
		
		Arrays.sort(arr,new Comparator<int[]>()
		{
			@Override
			public int compare(int[]o1,int[]o2) {
				if(o1[0]==o2[0]) { //2���� �迭�� ù��° ���(0��°)�� ���� ������ 2��° ����� �� �� (�������� )
					return o1[1]-o2[1];
				}
				
				else { //2���� �迭�� ù��° ����� �� �ٸ��� 1��° ����� �� ������������ ���� 
					return o1[0]-o2[0];
				}
			}
		});
		
		
		System.out.println(Arrays.deepToString(arr));

	}

}
