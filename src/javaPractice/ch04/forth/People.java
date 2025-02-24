package javaPractice.ch04.forth;

public class People {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.showMyName();
		
		User user = new User();
		user.showMyName();
		
		Member member = new Admin();
		member.showMyName();
		
		member = new User();
		member.showMyName();
	}
}
