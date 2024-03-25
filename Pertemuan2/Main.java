package Pertemuan2;

public class Main {
    public static void main(String[] args){
        Alamat alamat = new Alamat();
        alamat.jalan  = "Jalan Yusuf Bauty";
        alamat.kota   = "Kab. Gowa";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama   = "Fariz";
        mahasiswa.nim    = "H0712321066";

        System.out.println("Nama : "+ mahasiswa.getNama());
        System.out.println("Nim : "+ mahasiswa.getNim());
        System.out.println("Alamat : "+ mahasiswa.getAlamat());
    }
    
}

class Alamat{
    String jalan;
    String kota;
}

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    String getNama(){
        return nama;
    }
    String getNim(){
        return nim;
    }
    String getAlamat(){
        return alamat.jalan + ", " + alamat.kota;

    }
}