import java.util.*;
public class ReverseTheString {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of string array : ");
		int n = sc.nextInt();
		System.out.println("enter the string which You want to reverse it:");
		for(int i=0;i<n;i++) {
			//arr.add(sc.next());
			String str = sc.next();
			arr.add(str);
		}
		System.out.println("your array string is");
		for (int i=0;i<n;i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("The reverse array String is: ");
		for(int i=arr.size()-1;i>=0;i--) {
			System.out.println(arr.get(i));
		}

	}

}