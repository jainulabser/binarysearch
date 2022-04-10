import java.util.Scanner;

public class BinarySearch {
	private int arr[] = new int[5];
	private int mid;

	private void search() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) { //set array Elements in increment order
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(binarySearch(42, 0, arr.length));
	}

	public int binarySearch(int key, int start, int end) {

		if (start == end) {// check if processing array have single element
			if (arr[start] == key) {//if yes check whether is a key or not
				return start;
			} else
				return -1;
		} else {
			mid = (start + end) / 2; //if not single element then find mid as a key
			if (arr[mid] == key) {
				return mid;//if yes return index of mid
			}
			if (arr[mid] > key) {//if not check whether mid point is higher than key or not
				return binarySearch(key, start, mid - 1);//if high set end as mid other elements should be ignored
			} else {
				return binarySearch(key, mid + 1, end);//if low set mid as start other elements should be ignored
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch obj = new BinarySearch();
		obj.search();

	}

}
