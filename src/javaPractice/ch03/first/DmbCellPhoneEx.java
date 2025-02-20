package javaPractice.ch03.first;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		
		CellPhone cellPhone = new CellPhone("Samsung", "Black");		
		System.out.println(cellPhone.getModel());
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Apple", "White");
		System.out.println(dmbCellPhone.getModel());
		
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
	}

}
