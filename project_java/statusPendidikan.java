package project_java;

public class statusPendidikan {
    String SMK;
    String Diploma;
    String S1;

    public statusPendidikan(String SMK) {
        this.SMK = SMK;
    }

    public statusPendidikan(String SMK, String Diploma) {
        this.SMK = SMK;
        this.Diploma = Diploma;
    }

    public statusPendidikan(String SMK, String Diploma, String S1) {
        this.SMK = SMK;
        this.Diploma = Diploma;
        this.S1 = S1;
    }

    public void cetakpendidikan() {
        System.out.println("Lulusan :" + SMK + "\n" + Diploma + "\n" + this.S1);
    }
}
