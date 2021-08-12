package coding_qn_practices;

public class MergeSort {

	public static void main(String[] args) {
		 int arr[] = { 12, 11, 13, 5, 6, 7 };
//		 printArray(arr);
		 mergeSort(arr,0,arr.length-1);
		 printArray(arr);
	}
	
	public static void mergeSort(int []arr,int l,int r) {
		if(r > l) {
			int mid =l+ (r-l)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	
	public static void merge(int []arr, int l, int m, int r) {
//		printArray(arr);
		int n1 = m-l+1;
		int n2 = r-m;
		int temp_l[] = new int[n1];
		int temp_r[] = new int[n2];
		for(int i = 0; i < n1; i++) {
			temp_l[i] = arr[i+l];
		}
		
		for(int i = 0; i < n2; i++) {
			temp_r[i] = arr[i+m+1];
		}
//		printArray(temp_l);
//		printArray(temp_r);
		int i_l=0;
		int i_r=0;
		int k=l;
		
		while(i_l < n1 && i_r < n2) {
			if(temp_l[i_l] <= temp_r[i_r]) {
				arr[k] = temp_l[i_l];
				i_l++;
			}else {
				arr[k] = temp_r[i_r];
				i_r++;
			}
			k++;
		}
		
		while(i_l < n1)
		{
			arr[k]=temp_l[i_l];
			i_l++;
			k++;
		}
		
		while(i_r < n2)
		{
			arr[k]=temp_r[i_r];
			i_r++;
			k++;
		}
//		printArray(arr);
	
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void swap(int arr[],int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

}
