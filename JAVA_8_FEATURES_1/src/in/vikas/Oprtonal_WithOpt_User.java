package in.vikas;

import java.util.Optional;

public class Oprtonal_WithOpt_User {

	// with Optional Object
	public Optional<String> getUsername(Integer id) {
		String name = null;
		if (id == 100) {
			name = "Raju";
		} else if (id == 101) {
			name = "Rani";
		} else if (id == 102) {
			name = "John";
		}
		return Optional.ofNullable(name);
	}

}
