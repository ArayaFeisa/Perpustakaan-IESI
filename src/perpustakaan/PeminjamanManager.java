package perpustakaan;

public class PeminjamanManager {

    private Peminjaman peminjaman;
    public void Save(BukuDipinjam[] bukuDipinjamCOllection ){
        for (BukuDipinjam bukuDipinjam : bukuDipinjamCOllection) {
            // peminjaman
            peminjaman.add(bukuDipinjam);
        }
    }


}
