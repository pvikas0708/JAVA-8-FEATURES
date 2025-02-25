package in.vikas;

import java.util.Optional;
import java.util.Scanner;

public class Oprtonal_With_User_MsgService {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter User ID");
		int userId = s.nextInt();

		Oprtonal_WithOpt_User u = new Oprtonal_WithOpt_User();

		Optional<String> username = u.getUsername(userId);

		if (username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase() + ", Hello");
		} else {
			System.out.println("No Data Found");
		}

	}

}
/*Output:
	Enter User ID
	102
	JOHN, Hello
And if user id=>200
Enter User ID
200
No Data Found

*/