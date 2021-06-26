public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a = {3, 1, -2, 7, 4, 0};
		
		int n = a.length;
		
		for(int i = 0; i < n-1; i++) {
			
			int minIndex = i;
			for(int j = 1; j < n; j++) {
				if(a[j] == a[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		
		for(int e: a) {
			System.out.print(e +" ");
		}

	}

}
