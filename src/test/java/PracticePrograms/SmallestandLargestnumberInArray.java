package PracticePrograms;

public class SmallestandLargestnumberInArray {

	public static void main(String[] args) {

		int a[] = { -10,-2,-6,34,67,89};

		int len = a.length;

		int smallest = a[0];
		int biggest = a[0];

		for (int i = 0; i <= len - 1; i++) {

			if (smallest > a[i]) {
				smallest = a[i];
			} else if (biggest < a[i]) {

				biggest = a[i];
			}
		}
		
		System.out.println("Smallest number is:"+ smallest);
		System.out.println("Biggest number is:"+ biggest);
	}

}
