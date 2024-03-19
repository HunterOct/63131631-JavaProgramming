package BTMAU.Creational.BaiTap.BT1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthd;

    protected HoaDon(Builder builder) {
        header = builder.header;
        cthd = builder.cthd;
    }

    public void printInfo() {
        System.out.println(header.getMahd() + " " + header.getTenKH() + " " + header.getNgayban());
        for (int i = 0; i < cthd.size(); i++) {
            System.out.println(cthd.get(i).getSp() + " " + cthd.get(i).getSl() + " " + cthd.get(i).getDongia()+" "+ cthd.get(i).getChietkhau());
        }
    }

    public static class  Builder{
        HoaDonHeader header;
        CTHD chitietHD;
        List<CTHD> cthd = new ArrayList<CTHD>();

        // public Builder addHeader(int Mahd, String tenKH, String ngayban) {
        //     header = new HoaDonHeader(Mahd, tenKH, ngayban);
        //     return this;
        // }
        public Builder addHeader( HoaDonHeader hd ) {
            header = hd;
            return this;
        }
        public Builder addCTHD(CTHD ct) {
            cthd.add(ct);
            return this;
        }
        // public Builder addCTHD(String sp, int sl, int dongia, int chietkhau) {
        //     cthd.add(new CTHD(sp, sl, dongia, chietkhau));
        //     return this;
        // }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }

}
