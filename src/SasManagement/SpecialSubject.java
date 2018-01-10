package SasManagement;

public class SpecialSubject extends Subject implements ISpecialSubject {
    private String tenChuongTrinh;
    private final int phuThuSIE = 50000;
    private final int phuThuHEDSPI = 50000;
    private final int phuThuICT = 50000;

    SpecialSubject() {
        super();
        tenChuongTrinh = "";
    }

    public SpecialSubject(String tenChuongTrinh) {
        this.tenChuongTrinh = tenChuongTrinh;
    }

    public String getTenChuongTrinh() {
        return tenChuongTrinh;
    }

    public void setTenChuongTrinh(String tenChuongTrinh) {
        this.tenChuongTrinh = tenChuongTrinh;
    }

    public SpecialSubject(String maMH, String tenMH, int soTCHocPhan, int soTCThucHanh, String tenChuongTrinh) {
        super(maMH, tenMH, soTCHocPhan, soTCThucHanh);
        this.tenChuongTrinh = tenChuongTrinh;
    }

    @Override
    public int getSpecialFee() {
        if (tenChuongTrinh == "SIE") {
            return phuThuSIE * getSoTCHocPhan();
        } else if (tenChuongTrinh == "HEDSPI") {
            return phuThuHEDSPI * getSoTCHocPhan();
        } else if (tenChuongTrinh == "ICT") {
            return phuThuICT * getSoTCHocPhan();
        }
        return 0;
    }

    public int getFree() {
        int hocPhi = getSoTCHocPhi() * hocPhiMotTinChi;
        return hocPhi + getSpecialFee();
    }

    public String getEnrolmentLine() {
        String enrolment = "";
        enrolment = getMaMH() + " ";
        if (getTenMH().length() < 20) {
            enrolment = enrolment + getTenMH();
            for (int i = 0; i < (20 - getTenMH().length() + 2); i++) {
                enrolment = enrolment + " ";
            }
        } else {
            enrolment = enrolment + getTenMH().substring(0, 20) + "  ";
        }
        if (tenChuongTrinh.length() < 6) {
            enrolment = enrolment + tenChuongTrinh;
            for (int i = 0; i < (6 - tenChuongTrinh.length() + 2); i++) {
                enrolment = enrolment + " ";
            }
        } else {
            enrolment = enrolment + tenChuongTrinh.substring(0, 6);
        }
        enrolment = enrolment + "  " + getSoTCHocPhi() + "  " + this.getFree() + "  " + getSpecialFee();
        return enrolment;
    }

}
