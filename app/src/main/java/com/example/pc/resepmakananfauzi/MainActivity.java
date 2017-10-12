package com.example.pc.resepmakananfauzi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<resep> resepList = new ArrayList<>();
    private RecyclerView recyclerView;
    private resepAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        myAdapter = new resepAdapter(this,resepList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdapter);

        ResepData();
    }

    public void ResepData(){
resep Resep = new resep("Rendang", R.drawable.rendang,"Makanan Lebaran Populer",

        "\nBahan-bahan utama :\n\n"
        + "\t -daging sapi lulur 500 gram, potong melebar kurang lebih 12 bagian\n"
        + "\t -daun kunyit 2 lembar\n"
        + "\t -daun jeruk 2 lembar\n"
        + "\t -serai 2 batang, memarkan\n"
        + "\t -pekak 1 buah\n"
        + "\t -kelapa parut sangrai 2 sendok makan\n"
        + "\t -santan 1000-1500 ml dari 2 butir kelapa\n"
        + "\t -minyak goreng 2 sendok makan\n"
        + "\t -bawang merah 10 butir\n"
        + "\t -bawang putih 6 siung\n"
        + "\t -cabai merah 150 gram\n"
        + "\t -cabai rawit sesuai selera\n"
        + "\t -kemiri 5 butir\n"
        + "\t -jinten 1/2 sendok teh\n"
        + "\t -ketumbar 1 sendok teh\n"
        + "\t -kunyit 1/2 cm\n"
        + "\t -jahe 1 cm\n"
        + "\t -garam secukupnya\n"
        + "\n\n" + "cara membuat : \n\n"
        + "\t1.Panaskan minyak, tumis bumbu halus, daun kunyit, daun jeruk, serai dan pekak hingga harum.\n"
        + "\t2.Masukkan daging, aduk hingga berubah warna.\n"
        + "\t3.Tuang santan dan tambahkan kelapa parut sangrai, masak di atas api sedang sambil diaduk perlahan hingga mendidih.\n"
        + "\t4.Kecilkan api, masak hingga daging matang, berminyak dan kecoklatan.\n"
        + "\t5.Angkat dan sajikan.");
        resepList.add(Resep);

        Resep = new resep("Seblak", R.drawable.seblak,"Makanan Tradisional Populer",

                "\nBahan-bahan utama:\n\n"
                + "\t -500 gram kerupuk aci mentah\n"
                + "\t -air panas untuk merendam kerupuk aci atau kerupuk seblak\n"
                + "\t -4 butir telur ayam\n"
                + "\t -100 ml air\n"
                + "\t -2 sendok teh garam\n"
                + "\t -1/2 sendok teh gula pasir\n"
                + "\t -1/2 sendok teh kaldu ayam bubuk\n"
                + "\t -2 batang daun bawang, diiris halus\n"
                + "\t -4 sendok makan minyak untuk menumis\n"
                + "\t -10 siung bawang putih\n"
                + "\t -2 buah tomat merah\n"
                + "\t -1 cm kencur\n"
                + "\t -2 buah cabai keriting\n"
                + "\t -6 buah cabai rawit\n"

                + "\n\n" + "cara membuat : \n\n"
                + "\t1.Rebus kerupuk sebentar sampai lunak. Angkat, tiriskan. Masukkan ke dalam air panas. Rendam hingga berwarna bening. Angkat. Tiriskan.\n"
                + "\t2.Panaskan minyak, tumis bumbu halus sampai harum.\n"
                + "\t3.Masukkan telur. Aduk sampai telur berbutir-butir.\n"
                + "\t4.Masukkan kerupuk. Tuangi air. Masukkan garam, gula, dan kaldu ayam bubuk. Tumis sampai meresap. Tambahkan daun bawang. Aduk rata. Angkat. Sajikan.");
                resepList.add(Resep);

        Resep = new resep("Gado-Gado", R.drawable.gadogado,"Makanan Desa Populer",

                "\nBahan-bahan utama :\n\n"

                        +"\t-.350 gram kentang, rebus, goreng, potong-potong\n"
                        +"\t-.350 gram tahu putih\n"
                        +"\t-.350 gram tempe\n"
                        +"\t-4.7lembar daun selada, sobek-sobek\n"
                        +"\t-.2 buah ketimun, iris tipis\n"
                        +"\t-.100 gram taoge, rebus\n"
                        +"\t-.200 gram kol, iris kasar, rebus\n"
                        +"\t-.Minyak untuk menggoreng\n"
                        +"\t-.3 siung bawang putih, haluskan\n"
                        +"\t-.1 sendok teh ketumbar bubuk\n"
                        +"\t-.1 sendok teh garam\n"
                        +"\t-.200 ml air\n"

                        +"\n\n" + "cara membuat : \n\n"
                            +"\t1.Rendam tempe dan tahu dalam bahan perendam. Goreng dalam minyak yang sudah dipanaskan diatas api sedang sampai matang. Sisihkan. Saus: tumis bumbu halus dan daun jeruk sampai harum. Tambahkan kacang tanah dan kecap manis Bango. Aduk rata.\n"
                            +"\t2.Masukkan santan, garam, dan gula merah. Aduk rata.\n"
                            +"\t3.Masak sambil diaduk sampai mendidih. Tambahkan air asam jawa. Aduk rata.\n"
                            +"\t4.Tata potongan kentang, tahu, tempe, daun selada, ketimun, taoge, dan kol di piring. Tuang saus. Tabur bawang merah goreng dan sajikan dengan pelengkap.");
        resepList.add(Resep);

        Resep = new resep("Siomay", R.drawable.siomay,"Makanan Kampung Populer",

                "\nBahan-bahan utama :\n\n"
                        +"\t-250 gr paha ayam, giling halus\n"
                        +"\t-150 gr udang, giling kasar \n"
                        +"\t-3 siung bawang putih, lalu dicacah\n"
                        +"\t-1 batang daun bawang, lalu dicacah \n"
                        +"\t-1 sdt garam\n"
                        +"\t-¾ sdt gula\n"
                        +"\t-1/8 sdt merica\n"
                        +"\t-1 sdt minyak wijen\n"
                        +"\t-80 gr tepung sagu\n"
                        +"\t-75 ml air es\n"
                        +"\t-Kulit siomay, secukupnya\n"

                        +"\n\n" + "cara membuat : \n\n"
                        +"\t1.Campurkan semua bahan, kecuali tepung sagu dan air es, di Mixing Bowl dan aduk hingga tercampur rata.\n"
                        +"\t2.Tambahkan tepung sagu dan air es, aduk kembali hingga rata.\n"
                        +"\t3.Isi selembar kulit siomay dengan bahan isian dan lipat sisinya.\n"
                        +"\t4.Kukus dengan Steam It selama 30 menit atau hingga matang.");

        resepList.add(Resep);

        Resep = new resep("Terancam", R.drawable.terancam,"Makanan Daerah Populer",

                "\nBahan-bahan utama :\n\n"
                        +"\t-3 tangkai daun kemangi, ambil daunnya saja\n"
                        +"\t-3 buah ketimun, buang bijinya lalu potong kotak\n"
                        +"\t-10 lonjor, kacang panjang, iris tipis\n"
                        +"\t-100 gram kol, iris halus\n"
                        +"\t-25 gram petai cina\n"
                        +"\t-100 gram kecambah\n"
                        +"\t-250 gram kelapa parut, kukus\n"
                       +"\t-4 buah cabai rawit merah\n"
                        +"\t-3 siung bawang putih\n"
                        +"\t-4 lembar daun jeruk\n"
                        +"\t-1 1/4 sendok teh garam\n"
                        +"\t-1 buah cabai merah\n"
                        +"\t-1 sendok teh terasi\n"
                        +"\t-1 1/2 sendok teh gula merah\n"
                        +"\t-2 cm kencur\n"

                        +"\n\n" + "cara membuat : \n\n"
                        +"\t1.Aduk rata bumbu yang telah di  haluskan bersama dengan kelapa yang telah di parut dan di kukus, aduk hingga benar benar rata.\n"
                        +"\t2.Aduk semua bahan sayuran, lalu campurkan dengan kelapa parut yang telah berbumbu, aduk rata lalu segera sajikan.");

                resepList.add(Resep);
    }
}
