package example;

public class Sortor {
	private int[] arr;

	public int[] sortValue(int[] values) {
		// quick Sort
		arr = values;
		quickSort(0, arr.length - 1);
		return arr;
	}

	private void quickSort(int start, int end) {
		if (start >= end) {
			return;
		}
		int pivote = arr[end];
		int left = start, right = end - 1;
		while (left < right) {
			while (arr[left] <= pivote && left < right)
				left++;
			while (arr[right] >= pivote && left < right)
				right--;
			swap(left, right);
		}
		if (arr[left] >= arr[end]) {
			swap(left, end);
		} else {
			left++;
		}

		quickSort(start, left - 1);
		quickSort(left + 1, end);
	}

	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
