package com.example.sedinka.lekce3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movies = new ArrayList<>();
        movies.add(new Movie("https://img.csfd.cz/files/images/film/posters/162/505/162505167_735db9.jpg?h180", "Vykoupení z věznice Shawshank", "95%", "USA","1994", "Andy Dufresne (Tim Robbins) přichází do vězení v Shawshanku jako nový vězeň podezřelý z vraždy. Spřátelí se s doživotně odsouzeným Redem (Morgan Freeman) a společně se snaží přežít v nelidském prostředí vězeňského systému. Odmítají upadnout do rezignace a dodávají naději sobě i spoluvězňům."));
        movies.add(new Movie( "https://img.csfd.cz/files/images/film/posters/000/501/501780_540187.png?h180", "Nedotknutelní", "91%", "Francie","2011","Ochrnutý a bohatý aristokrat Philippe si za svého nového opatrovníka vybere Drisse, živelného mladíka z předměstí, kterého právě propustili z vězení. Jinými slovy - najde si na tuto práci tu nejméně vhodnou osobu. Podaří se jim však propojit nemožné: Vivaldiho a populární hudbu, serióznost a žoviální vtípky, luxusní obleky a tepláky. Bláznivým, zábavným, silným, neočekávaným a hlavně „nedotknutelným“, přesně takovým se stane jejich přátelství…"));
        movies.add(new Movie("https://img.csfd.cz/files/images/film/posters/159/527/159527754_a3224e.jpg?h180",  "Hvězdný prach", "84%", "VB/USA/Island","2007","Ten příběh začíná pádem hvězdy. Není se ostatně čemu divit, když se na jeho vzniku tolik hvězd podílelo. Napsal ho Neil Gaiman, jeden z nejčtenějších spisovatelů současnosti, režíroval Matthew Vaughn, autor stylově čisté gangsterky Po krk v extázi, a hrají v něm takoví herci, jako Robert De Niro, Michelle Pfeiffer nebo Claire Danes. Říká se, že když padá hvězda, měl by si člověk něco přát a ono se mu to splní. Pokud si všichni výše zmínění tvůrci přáli natočit úžasnou podívanou, která naplní pravý obsah slova velkofilm, pak tahle pověra platí."));
        movies.add(new Movie( "https://img.csfd.cz/files/images/film/posters/162/971/162971855_8cffa5.png?h180", "Bohemian Rhapsody", "90%", "USA","2018","Film Bohemian Rhapsody je oslavou rockové skupiny Queen, jejich hudby a především Freddieho Mercuryho, který svou tvorbou i životem vzdoroval všem myslitelným stereotypům, díky čemuž se stal jedním z nejvýraznějších umělců na světě. Snímek mapuje raketový vzestup nekonvenční skupiny prostřednictvím jejich revolučního zvuku a ikonických písní, jako jsou „We Will Rock You“, „We Are the Champions“ nebo právě „Bohemian Rhapsody."));
        movies.add(new Movie( "https://img.csfd.cz/files/images/film/posters/000/004/4110_632c7c.jpg?h180", "Pelíšky", "91%", "ČR","1999","Děj je zasazen do konce šedesátých let - podzim 67 až léto 68 s krátkým epilogem přesahujícím do let sedmdesátých. Pražská vilová čtvrť Hanspaulka, jemná poetika a humorná nadsázka jsou charakteristické pro mozaikové vyprávění paralelních životních osudů tří generací mužů a žen ve zvláštním období našich dějin v roce 1968."));
        movies.add(new Movie( "https://img.csfd.cz/files/images/film/posters/159/533/159533679_74f8c0.jpg?h180","Láska Nebeská", "86%", "USA/Francie/VB","2003","Láska nebeská, nová romantická komedie ve stylu Čtyři svatby a jeden pohřeb, Notting Hill a Deník Bridget Jonesové, nás zavede do současného předvánočního Londýna, kde se odehraje příběh skládající se z mnoha nádherných milostných historek - někdy romantických, někdy smutných, někdy pošetilých. Žádná nepostrádá svůj osobitý humor. Všude, kam se podíváte, způsobuje láska chaos. "));
        movies.add(new Movie("https://img.csfd.cz/files/images/film/posters/158/336/158336635_61bc7c.jpg?h180", "Pulp Fiction: Historky z podsvětí", "91%", "USA","1994","Nejkultovnější z kultovních filmů 90. let je autorskou Biblí Quentina Tarantina, který v tomto opusu definoval základní prvky své režisérské poetiky a vytvořil dílo rozněcující náročné kritiky na festivalu v Cannes, levicové a pravicové intelektuály i zedníky dopřávající si po těžké šichtě trochu oddychu. Pulp Fiction je multižánrovým opusem, který přetéká fetišistickými detaily a popkulturními odkazy a zároveň dokonale funguje jako svrchovaně napínavý film rozvržený do inovativní příběhové struktury. "));
        movies.add(new Movie( "https://img.csfd.cz/files/images/film/posters/159/964/159964838_e9edec.jpg?h180", "Amy", "81%", "VB","2015","Kým ve skutečnosti byla dívka, která stojí za slavným jménem Amy Winehouse? Co tato hudební ikona skrývala před okolním světem a proč zemřela v pouhých 27 letech? Celovečerní dokument nechává promlouvat zejména Amy samotnou prostřednictvím dosud nezveřejněných archivních záběrů, rozhovorů, ale především skrze její hudbu a původní texty, které vždy reflektovaly aktuální události jejího života."));
        movies.add(new Movie("https://img.csfd.cz/files/images/film/posters/159/391/159391481_7c80d9.jpg?h180", "Amélie z Montmartru", "85%", "Francie", "2001","Amélie žije v pařížské čtvrti Montmartre, která je světem sama pro sebe. Je číšnicí v místním bistru, nakupuje u místního zelináře, zdraví sousedy jako na malém městě. V jejím životě se nikdy neudálo nic zvláštního, až na matčinu kuriózní smrt, nad níž Améliin tatínek stále truchlí. Amélie by asi zůstala smířená se svým osamělým údělem, kdyby jednoho dne neobjevila ve svém bytě ukrytý poklad v podobě staré krabice s památkami na dětství někdejšího nájemníka. Nejenže se Amélie rozhodne po letech doručit krabici jejímu majiteli, ale dospěje současně k poznání, že může pomáhat zlepšit a napravovat okolní svět. Když pak jednoho dne objeví člověka sbírajícího u nádražních fotoautomatů zahozené podobenky cizích lidí, Amélie se zamiluje."));
        movies.add(new Movie( "https://img.csfd.cz/files/images/film/posters/000/059/59386_f5a3e3.jpg?h180", "Lekce neslušného chování", "78%", "VB/Kanada","2008","Larita, krásná a rozvedená Američanka, se ve Francii seznámí s pohledným anglickým mladíkem Johnem a záhy se za něj provdá. Ihned po svatbě se vydávají k jeho rodičům na starobylé anglické venkovské sídlo, aby jim John představil svou okouzlující ženu. Johnova matka má ihned averzi vůči své nové snaše. Naopak Jim, Johnův otec, v ní nalezne spojence a spřízněnou duši v tomto staropanensky nudném prostředí. Začíná hra bez pravidel... V níž ten (respektive \"ta\") nejdůvtipnější vyhrává. Anebo prohrává...? Komedie, plná typicky sarkastického anglického humoru"));

        OurAdapter adapter = new OurAdapter(this, movies);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
 //               Toast.makeText(MainActivity.this, movies.get(position).title,
 //               Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("data",movies.get(position));
                MainActivity.this.startActivity(intent);
            }

        });
    }
}
