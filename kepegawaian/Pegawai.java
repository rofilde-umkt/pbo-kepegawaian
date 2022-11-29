package kepegawaian;

abstract public  class Pegawai {
    protected String nip;
    protected String nama;
    protected int umur;

    abstract public double hitungGaji();

    public double pinjam(Bank bank, double uang) {

    }

    public String getNip() {
        return this.nip;
    }


    public String setUmur(int u) {
        if(u < 15) {
            System.out.println("Pekerja illegal");
            System.exit(u);; 
        }

        if(u > 60) {
            System.out.println("Kai tidur aja dirumah");
            System.exit(u);; 
        }

        this.umur = u;
    }

    public void tampil() {
        System.out.println("Nip " + this.nip);
        System.out.println("Nama " + this.nama);

    }
}
