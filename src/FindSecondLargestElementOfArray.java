import java.util.Scanner;

public class FindSecondLargestElementOfArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum value is : " + max);

        int second_max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            if(arr[i] > second_max && arr[i]!=max) {
                second_max = arr[i];
            }
        }
        System.out.println("The second maximum value is : " + second_max);
    }
}
