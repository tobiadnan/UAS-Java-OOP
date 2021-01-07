public abstract class Pengggajian {
    private String nama, status;
    private char golongan;

    public Pengggajian(String nama, char golongan, String status) {
        this.nama = nama;
        this.status = status;
        this.golongan = golongan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public char getGolongan() {
        return golongan;
    }

    public void setGolongan(char golongan) {
        this.golongan = golongan;
    }
    public abstract void printdata();
}