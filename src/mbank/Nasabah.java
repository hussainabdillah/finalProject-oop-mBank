package mbank;

public class Nasabah {
    private static String nama;
    public static double saldonasabah = 2000000;
    private static String noRekening;
    private String password;

    public Nasabah() {

    }

    public static String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}