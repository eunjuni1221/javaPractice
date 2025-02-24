package javaPractice.ch04.second;

public class MiddleSchool implements School {

	@Override
	public void gotoSchool() {
		// TODO Auto-generated method stub
		System.out.println("등교중");
	}

	@Override
	public void gotoHome() {
		// TODO Auto-generated method stub
		System.out.println("하교중");
	}
	public static void main(String[] args) {
		MiddleSchool middleSchool = new MiddleSchool();
		
		middleSchool.gotoSchool();
		middleSchool.gotoHome();

	}
}
