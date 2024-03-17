// package perpustakaan;

// public class Peminjaman {
//     public BukuDipinjam[] daftarBuku;
    
//     public Peminjaman(){
        
//     }
// }

package perpustakaan;

public class Peminjaman {
    private BukuDipinjam[] daftarBuku;
    private int jumlahBuku;

    public Peminjaman(int ukuranMaksimal) {
        daftarBuku = new BukuDipinjam[ukuranMaksimal];
        jumlahBuku = 0;
    }

    public void add(BukuDipinjam bukuDipinjam) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = bukuDipinjam;
            jumlahBuku++;
        } else {
            System.out.println("Maaf, daftar buku sudah penuh.");
        }
    }
}

