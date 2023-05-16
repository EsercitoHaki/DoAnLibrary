package Home.Trung;

public class ProductList {
    private String MaSach;
    private String TenSach;
    private String TheLoai;
    private String NhaXuatBan;
    private String NamXuatBan;
    private String TacGia;

    public ProductList(String MaSach, String TenSach, String TheLoai, String NhaXuatBan, String NamXuatBan, String TacGia){
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.TheLoai = TheLoai;
        this.NhaXuatBan = NhaXuatBan;
        this.NamXuatBan = NamXuatBan;
        this.TacGia = TacGia;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }


    public String getTenSach() {
        return TenSach;
    }


    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }


    public String getTheLoai() {
        return TheLoai;
    }


    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }


    public String getNhaXuatBan() {
        return NhaXuatBan;
    }


    public void setNhaXuatBan(String NhaXuatBan) {
        this.NhaXuatBan = NhaXuatBan;
    }

    public String getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(String NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }
}
