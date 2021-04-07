
package Latian;

public class Siswa {
    private String nama;
    private String kelas;
    private int absen;
    private String TTL;
    private double beratbadan;

    public String getNama() {
        return nama;
    }
    public String getTTL() {
        return TTL;
    }

    public double getBeratbadan() {
        return beratbadan;
    }
    
    public String getKelas() {
        return kelas;
    }

    public int getAbsen() {
        return absen;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public void setBeratbadan(double beratbadan) {
        this.beratbadan = beratbadan;
    }
    
    
    
}
