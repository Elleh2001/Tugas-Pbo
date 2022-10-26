package project_java;

public class pegawai {
    String Nama_pegawai;
    String alamat;
    String tgl;
    String noTlp;
    String jk;

    public pegawai(String Nama_pegawai, String alamat) {
        this.Nama_pegawai = Nama_pegawai;
        this.alamat = alamat;

    }

    public pegawai(String Nama_pegawai, String alamat, String tgl) {
        this.Nama_pegawai = Nama_pegawai;
        this.alamat = alamat;
        this.tgl = tgl;

    }

    public pegawai(String Nama_pegawai, String alamat, String tgl, String noTlp) {
        this.Nama_pegawai = Nama_pegawai;
        this.alamat = alamat;
        this.tgl = tgl;
        this.noTlp = noTlp;

    }

    public pegawai(String Nama_pegawai, String alamat, String tgl, String noTlp, String jk) {
        this.Nama_pegawai = Nama_pegawai;
        this.alamat = alamat;
        this.tgl = tgl;
        this.noTlp = noTlp;
        this.jk = jk;
    }

    public void cetakpegawai() {
        System.out.println("Nama Pegawai :" + Nama_pegawai + "\n" + "Alamat :" + alamat + "\n" + "Tanggal Lahir :" + tgl
                + "\n" + "No. Telpon :" + noTlp + "\n" + "Jenis Kelamin" + this.jk);
    }
}