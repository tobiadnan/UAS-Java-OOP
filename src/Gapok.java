public abstract class Gapok extends Pengggajian {
    private int gapok;

    public Gapok(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    public int getGapok() {
        return gapok;
    }

    public void setGapok(int gapok) {
        this.gapok = gapok;
    }
    public abstract void showGapok();
}
