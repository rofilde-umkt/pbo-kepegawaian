package kepegawaian;

public class Universitas {
    private String nama; 
    private String alamat; 

    public void setData(String n, String a) {
        this.nama = n;
        this.alamat = a;
    }

    public String getNama() {
        return this.nama;
    }

}