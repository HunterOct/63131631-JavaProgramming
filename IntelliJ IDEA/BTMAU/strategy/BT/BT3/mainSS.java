package strategy.BT.BT3;
// import java.util.Date;

public class mainSS {
    public static void main(String[] args) {
        QLSV ds = new QLSV();

        // ds.getDssv().add(new Sinhvien("Phuc", new Date(2001,1,1), (float) 9.0));
        // ds.getDssv().add(new Sinhvien("Hoang",new Date(2001,1,1),(float) 8.0));
        // ds.getDssv().add(new Sinhvien("Quan",new Date(2001,1,1),(float) 7.0));
        // ds.getDssv().add(new Sinhvien("Phi",new Date(2001,1,1),(float) 9.5));
        // ds.getDssv().add(new Sinhvien("Kit",new Date(2001,1,1),(float) 6.9));
        ds.setSs(new Sosanhtheoten());
        ds.sapXep();
        ds.inDS();

        
        // ISosanh<Sinhvien> ssTen = new Sosanhtheoten();
        // ISosanh<Sinhvien> ssDiem = new Sosanhtheodiem();

        // String sDate1="11/07/1999";
        // Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        // String sDate2="11/07/1999";
        // Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
        // String sDate3="11/07/1999";
        // Date date3=new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
        // String sDate4="11/07/1999";
        // Date date4=new SimpleDateFormat("dd/MM/yyyy").parse(sDate4);
        // String sDate5="11/07/1999";
        // Date date5=new SimpleDateFormat("dd/MM/yyyy").parse(sDate5);
        // String sDate6="11/07/1999";
        // Date date6=new SimpleDateFormat("dd/MM/yyyy").parse(sDate6);
        // Sinhvien sv1 = new Sinhvien("A", date1,(float) 7.8);
        // Sinhvien sv2 = new Sinhvien("B", date2,(float) 8.8);
        // Sinhvien sv3 = new Sinhvien("C", date3,(float) 7.9);
        // Sinhvien sv4 = new Sinhvien("D", date4,(float) 6.8);
        // Sinhvien sv5 = new Sinhvien("E", date5,(float) 7.5);
        // Sinhvien sv6 = new Sinhvien("F", date6,(float) 9.8);
        // // sv1.display();
        // // ds.themsv(sv1);
        // // ds.themsv(sv2);
        // // ds.themsv(sv3);
        // // ds.themsv(sv4);
        // // ds.themsv(sv5);
        // // ds.themsv(sv6);
        // ds.setSs(ssTen);
        // ds.sapXep();
        // ds.inDS();
        // ds.setSs(ssDiem);
        // ds.sapXep();
        // ds.inDS();
    }

}
