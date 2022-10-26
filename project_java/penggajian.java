package project_java;

public class penggajian {
    String gajiPokok;
    String tunjangan;
    String lembur;

    public penggajian(String gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public penggajian(String gajiPokok, String tunjangan) {
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    public penggajian(String gajiPokok, String tunjangnan, String lembur) {
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangnan;
        this.lembur = lembur;
    }

    public void cetakGaji() {
        System.out.println(
                "Gaji Pokok :" + gajiPokok + "\n" + "Gaji Tunjangan :" + tunjangan + "\n"
                        + "Gaji Lembur :" + this.lembur);
    }

}
