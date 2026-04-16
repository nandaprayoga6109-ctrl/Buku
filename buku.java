class Buku {
    String judul;
    String penulis;
    int tahun;
    
    public Buku (){
        this.judul = "unknown";
        this.penulis = "unknown";
        this.tahun = 0;
    }
    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }
    public void tampilkan_informasi() {
        System.out.println("Judul Buku :" + this.judul);
        System.out.println("Penulis Buku :" + this.penulis);
        System.out.println("Tahun Terbit :" + this.tahun);
    }
}


