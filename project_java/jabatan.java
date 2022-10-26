package project_java;

public class jabatan {
    String karyawan;
    String manajer;
    String training;

    public jabatan(String karyawan) {
        this.karyawan = karyawan;
    }

    public jabatan(String karyawan, String manajer) {
        this.karyawan = karyawan;
        this.manajer = manajer;
    }

    public jabatan(String karyawan, String manajer, String training) {
        this.karyawan = karyawan;
        this.manajer = manajer;
        this.training = training;
    }

    public void cetakjabatan() {
        System.out.println("Karyawan :" + karyawan + "\n" +
                "Manajer :" + manajer + "\n" + "Training :" + this.training);
    }
}
