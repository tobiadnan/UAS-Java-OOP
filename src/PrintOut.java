public class PrintOut extends Gaber{
    public PrintOut(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    @Override
    public void printdata() {
        System.out.println("Nama Karyawan  : "+getNama());
        System.out.println("Golongan (A/B) : "+getGolongan());
        System.out.println("Status (Nikah/Belum) : "+getStatus());
    }

    @Override
    public void showGapok() {
        if (getGolongan()== 'A'){
            setGapok(200000);
            System.out.println("Gaji pokok : Rp. "+getGapok());
        } else if (getGolongan()== 'B') {
            setGapok(350000);
            System.out.println("Gaji pokok : Rp. " + getGapok());
        } else {
            setGapok(400000);
            System.out.println("Gaji pokok : Rp. " + getGapok());
        }
    }

    @Override
    public void showTunjangan() {
        if (getGolongan()== 'A' && getStatus().equals("Nikah")){
            setTunjangan(50000);
            System.out.println("Tunjangan  : Rp. "+getTunjangan());
        }else if (getGolongan()== 'A' && getStatus().equals("Belum")) {
            setTunjangan(25000);
            System.out.println("Tunjangan  : Rp. " + getTunjangan());
        }else if (getGolongan()== 'B' && getStatus().equals("Nikah")) {
            setTunjangan(75000);
            System.out.println("Tunjangan  : Rp. " + getTunjangan());
        }else if (getGolongan()== 'B' && getStatus().equals("Belum")) {
            setTunjangan(60000);
            System.out.println("Tunjangan  : Rp. " + getTunjangan());
        }else {
            setTunjangan(0);
            System.out.println("Tunjangan  : Rp. "+getTunjangan());
        }
    }

    @Override
    public void showPotongan() {
        if (getGapok()<= 300000){
            setPotongan((getGapok()+getTunjangan())* (5F/100));
            System.out.printf("Potongan Iuran : Rp. %.0f",getPotongan());
        } else if (getGapok()> 300000) {
            setPotongan((getGapok() + getTunjangan()) * (10F / 100));
            System.out.printf("Potongan Iuran : Rp. %.0f", getPotongan());
        }
    }

    @Override
    public void showGaber() {
        setGaber((int)(getGapok()+getTunjangan()-getPotongan()));
        System.out.printf("\nGaji Bersih : Rp. "+getGaber());
    }
}