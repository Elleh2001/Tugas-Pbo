package project_java;

public class mainApp {
    public static void main(String[] args) {
        pegawai pegawai = new pegawai("Hariadi", "Rembitan");
        pegawai pegawai2 = new pegawai("Hariadi", "Rembitan", "30 Juni 2001");
        pegawai pegawai3 = new pegawai("Hariadi", "Rembitan", "30 Juni 2001", "081960456721");
        pegawai pegawai4 = new pegawai("Hariadi", "Rembitan", "30 Juni 2001", "081960456721", "Laki-Laki");

        System.out.println("Nama Pegawai :" + pegawai.Nama_pegawai + "\n" + "Alamat :" + pegawai.alamat + "\n"
                + "Tanggal Lahir :" + pegawai2.tgl
                + "\n" + "No. Telpon :" + pegawai3.noTlp + "\n" + "Jenis Kelamin" + pegawai4.jk);

        pegawai.cetakpegawai();
        pegawai2.cetakpegawai();
        pegawai3.cetakpegawai();
        pegawai4.cetakpegawai();

        penggajian penggajian = new penggajian("3.500.000");
        penggajian penggajian2 = new penggajian("3.500.000", "2.500.000");
        penggajian penggajian3 = new penggajian("3.500.000", "2.500.000", "1.500.000");

        System.out.println("Gaji Pokok :" + penggajian.gajiPokok + "\n" + "Gaji Tunjangan :"
                + penggajian2.tunjangan + "\n" + "Gaji Lembur :" + penggajian3.lembur);

        penggajian.cetakGaji();
        penggajian2.cetakGaji();
        penggajian3.cetakGaji();

        statusPendidikan statusPendidikan = new statusPendidikan("lulus");
        statusPendidikan statusPendidikan2 = new statusPendidikan("lulus", "Tidak Ada");
        statusPendidikan statusPendidikan3 = new statusPendidikan("lulus", "Tidak Ada", "Sedang Ditempuh");

        System.out.println("Statu SMK :" + statusPendidikan.SMK + "\n" + "Status Diploma" + statusPendidikan2.Diploma
                + "\n" + "Status S1" + statusPendidikan3.S1);

        statusPendidikan.cetakpendidikan();
        statusPendidikan2.cetakpendidikan();
        statusPendidikan3.cetakpendidikan();

    }
}
