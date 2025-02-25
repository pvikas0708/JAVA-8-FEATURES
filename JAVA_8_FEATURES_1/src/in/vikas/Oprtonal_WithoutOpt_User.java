package in.vikas;

public class Oprtonal_WithoutOpt_User {
	// Without Optional object
	public String getUsernameById(Integer id) {
		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else if (id == 102) {
			return "John";
		} else {
			return null;
		}

	}
}
