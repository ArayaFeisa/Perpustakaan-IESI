package perpustakaan;

import java.util.ArrayList;

public class PeminjamanController {
    public void showFormPeminjaman() {
        Perpustakaan.formPeminjaman = new FormPeminjaman();
        Perpustakaan.formPeminjaman.tampilkan();
    }

    public void cariBukuFormPeminjaman(String judul) {
        BukuProvider bukuProvider = new BukuProvider();
        try {
            ArrayList<Buku> listBuku = bukuProvider.selectBuku(judul);
            if(listBuku.isEmpty())
            {
                DialogUI dialogUI = new DialogUI("Buku tidak terdaftar");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
            } 
            else Perpustakaan.formPeminjaman.display(listBuku);
        } catch(Exception ex) {
            DialogUI dialogUI = new DialogUI("Connection Error");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
    }

    public void Peminjaman(ArrayList <BukuDipinjam> bukuDipinjam){
        Peminjaman peminjaman = new Peminjaman(bukuDipinjam.size());
        for(int i = 0; i < bukuDipinjam.size(); i++) {
            peminjaman.add(bukuDipinjam.get(i));
        }
    }
}
