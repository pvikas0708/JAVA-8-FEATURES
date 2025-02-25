package in.vikas;

import java.util.function.Supplier;

class Doctor {
	public Doctor() {
		System.out.println("Doctor Constructor..!");//Doctor Constructor..!
	}
}

public class MethodRef_Constructor {

	public static void main(String[] args) {
		Doctor d = new Doctor();// normal way of calling constructor=>Doctor Constructor..!
		
		Supplier<Doctor> s= Doctor::new;
		Doctor doctor = s.get();//Doctor Constructor..!
		System.out.println(s.get().hashCode()); //getting HashCode of Doctor =>258952499
	}
}
