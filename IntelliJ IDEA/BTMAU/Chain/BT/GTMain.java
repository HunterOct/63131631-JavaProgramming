package Chain.BT;

public class GTMain {
    public static void main(String[] args) {
        IGiaDien bac1 = new giaTien(50,1.678 );
        IGiaDien bac2 = new giaTien(50,1.734);
        IGiaDien bac3 = new giaTien(100,2.014);
        IGiaDien bac4 = new giaTien(100, 2.536 );
        IGiaDien bac5 = new giaTien(100, 2.834 );
        IGiaDien bac6 = new giaTienThapnhat(100, 2.927);
        bac1.setSuccessor(bac2)
            .setSuccessor(bac3)
            .setSuccessor(bac4)
            .setSuccessor(bac5)
            .setSuccessor(bac6);

        System.out.println("Tien dien cuoi thang nay la: "+ bac1.tinhTienDien(200) );
        
    }
}
