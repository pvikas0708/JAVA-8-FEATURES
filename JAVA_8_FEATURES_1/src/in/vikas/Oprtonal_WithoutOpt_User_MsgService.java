package in.vikas;

import java.util.Optional;
import java.util.Scanner;

public class Oprtonal_WithoutOpt_User_MsgService {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter User ID");
		int userId = s.nextInt();

		Oprtonal_WithoutOpt_User u = new Oprtonal_WithoutOpt_User();
		String userName = u.getUsernameById(userId);
		String msg = userName.toUpperCase() + ", Hello";
		System.out.println(msg);

	}

}
/*Output:
Enter User ID
102
JOHN, Hello
But id 200 gives NullPointerExcetion => to avoid this NPE Optional class introduceds

to avoid this nullpointer exception we have to check */

