package Sort;

public class MergeSort {
	
	public void Sort(int[] arrs, int begin, int end) {
		if(begin < end) {
			int mid = (begin + end) / 2;
			Sort(arrs, begin , mid);
			Sort(arrs, mid + 1, end);
			merge(arrs, begin, mid, end);
		}
	}
	
	public void merge(int[] arrs, int begin, int middle, int end) {
		int[] helper = new int[arrs.length];
		for(int i = begin; i <= end; i++) {
			helper[i] = arrs[i];
		}
		
		int i = begin;
		int j = middle + 1;
		int k = begin;
		
		while(i <= middle && j <= end) {
			if(helper[i] <= helper[j]) {
				arrs[k] = helper[i];
				i ++;
			}else {
				arrs[k] = helper[j];
				j ++;
			}
			k ++;
		}
		
		//copy the rest
		int remian = middle - i;
		for(int m = 0; m <= remian; m ++) {
			arrs[k + m] = helper[j + m];
		}
		
	}

	

}
