package tugas3;

public class Tugas3model {
    private String namaSklh;
    private int spp;
    private int jangkaWaktu;
    private int total;

    public Tugas3model(String namaSklh, int spp, int jangkaWaktu,int total) {
        this.namaSklh = namaSklh;
        this.spp = spp;
        this.jangkaWaktu = jangkaWaktu;
        this.total = total;
    }

    @Override
    public String toString() {
        return "tugas3model{" +
                "Nama Sekolah = '" + namaSklh + '\'' +
                ", Jumlah SPP perbulan = " + spp +
                ", Jangka Waktu = " + jangkaWaktu +
                ", total = " + total +
                '}';
    }
}
