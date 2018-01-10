package SasManagement;

public class Subject implements ISubject {
    private String maMH;
    private String tenMH;
    private int soTCHocPhan;
    private int soTCThucHanh;
    private int soTCHocPhi;
    private int hocPhi;
    protected final int hocPhiMotTinChi = 150000;

    Subject() {
        maMH = "";
        tenMH = "";
        soTCHocPhan = 0;
        soTCThucHanh = 0;
        soTCHocPhi = 0;
        hocPhi = 0;
    }

    protected Subject(String maMH, String tenMH, int soTCHocPhan, int soTCThucHanh) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTCHocPhan = soTCHocPhan;
        this.soTCThucHanh = soTCThucHanh;
    }

    protected String getMaMH() {
        return maMH;
    }

    protected void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    protected String getTenMH() {
        return tenMH;
    }

    protected void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    protected int getSoTCHocPhan() {
        return soTCHocPhan;
    }

    protected void setSoTCHocPhan(int soTCHocPhan) {
        this.soTCHocPhan = soTCHocPhan;
    }

    protected int getSoTCThucHanh() {
        return soTCThucHanh;
    }

    protected void setSoTCThucHanh(int soTCThucHanh) {
        this.soTCThucHanh = soTCThucHanh;
    }

    protected int getSoTCHocPhi(){
        return  this.soTCThucHanh * 2 + (this.soTCHocPhan - this.soTCThucHanh);
    }

    @Override
    public int getFree() {
        hocPhi = getSoTCHocPhi()*hocPhiMotTinChi;
        return hocPhi;
    }

    @Override
    public String getEnrolmentLine() {
        String enrolment = "";
        enrolment  = maMH + " " ;
        if (tenMH.length()<20) {
            enrolment = enrolment + tenMH;
            for (int i=0; i< (20-tenMH.length()+2); i++){
                enrolment = enrolment + " ";
            }
        }else {
            enrolment  = enrolment  + tenMH.substring(0,20) + "  ";
        }
        enrolment = enrolment + getSoTCHocPhi() + "  " + getFree();
        return enrolment;
    }
}
