import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter element " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}
		SortMethod so = new SortMethod();
		int b[] = new int[n / 2];
		for (int i = 0; i < arr.length / 2; i++) {
			b[i] = arr[i];
		}
		int as[] = so.sortInAscend(b);
		System.out.println("Sorted 1st half of element in ascending order is:");
		for (int i = 0; i < as.length; i++) {
			System.out.print(as[i] + " ");
		}
		int count = 0;
		for (int j = arr.length / 2; j < arr.length; j++) {
			count++;
		}
		int c[] = new int[count];
		for (int i = arr.length / 2, j = 0; i < arr.length; i++, j++) {
			c[j] = arr[i];
		}
		int ds[] = so.sortInDescend(c);
		System.out.println();
		System.out.println("Sorted 2nd half of array in descending order is:");
		for (int i = 0; i < ds.length; i++) {
			System.out.print(ds[i] + " ");
		}
		sc.close();
	}
}