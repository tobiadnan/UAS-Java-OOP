public abstract class Gaber extends Potongan{

    private int gaber;

    public Gaber(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    public int getGaber() {
        return gaber;
    }

    public void setGaber(int gaber) {
        this.gaber = gaber;
    }

    public abstract void showGaber();
}
