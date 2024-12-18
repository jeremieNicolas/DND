package Races;

import java.util.ArrayList;
import java.util.List;

public class Humain extends Race {

    private List<Caractéristique> caractéristiques;
    private EthnieHumaine ethnie;
    private EthnieHumaine[] listeEthnie;

    // Constructeur
    public Humain() {
        super.setNom("Humain");
        this.caractéristiques = new ArrayList<>();
        super.setDescription("Dans l'histoire de bien des mondes, les humains forment la plus jeune des races communes "
                + "et sont arrivés bien tardivement sur la scène mondiale comparés aux nains, aux elfes et aux dragons. "
                + "Peut-être est-ce à cause de leur espérance de vie réduite qu'ils tentent d'accomplir tant de choses lors "
                + "de leurs courte vie. Ou peut-être pensent-ils avoir quelque chose à prouver aux races plus anciennes et "
                + "bâtissent donc leurs puissants empires faits de commerce et de conquêtes. Quelles que soient leurs motivations, "
                + "les humains sont des innovateurs qui rencontrent un franc succès et deviennent les pionniers de leur monde.");

       List<String> nomsMasculinsCalishites = new ArrayList<String>(List.of("Aseir","Bardeid","Haseid","Khemed","Mehmen","Sudeiman","Zasheir"));
       List<String> nomsFémininsCalishites = new ArrayList<String>(List.of("Atala","Ceidil","Hama","Jasmal","Meilil","Seipora","Yasheira","Zasheida"));
       List<String> nomsFamilleCalishites = new ArrayList<String>(List.of("Basha","Dumein","Jassan","Khalid","Mostana","Pashar","Rein"));
       
       List<String> nomsMasculinsChondathiens = new ArrayList<String>(List.of("Darvin","Dorn","Evendur","Gorsag","Grim","Helm","Malark","Morn","Randal","Stedd"));
       List<String> nomsFemininsChondathiens = new ArrayList<String>(List.of("Arveene","Esvele","Jhessail","Kerri","Lureene","Miri","Rowan","Shandri","Tessèle"));
       List<String> nomsFamilleChondatiens = new ArrayList<String>(List.of("Dragonbrun","Fânecouronne", "Grandcerf","Griscastel","Lièvre","Platbois"));
       
       List<String> nomsMasculinsDamariens = new ArrayList<String>(List.of("Bor","Fodel","Glar","Grigor", "Igan","Ivor", "Kosef","Mival","Orel","Pavel","Sergor"));
       List<String> nomsFemininsDamariens = new ArrayList<String>(List.of("Aléthre","Kara","Katernine","Mara","Natali","Olma","Tana","Zora"));
       List<String> nomsFamilleDamariens = new ArrayList<String>(List.of("Bersk", "Chernin","Dotsk","Kulenov","Marsk", "Németsk", "Shemov","Starag"));
       
       List<String> nomsMasculinsIlluskiens = new ArrayList<String>(List.of("Andre","Blath","Bran", "Frath","Geth","Landre","Luth","Malcre","Stor","Taman","Urth"));
       List<String> nomsFemininsIlluskiens = new ArrayList<String>(List.of("Amafrey","Bèthe","Cefrey","Kethra","Mara","Olga","Silifrey","Westra"));
       List<String> nomsFamilleIlluskiens = new ArrayList<String>(List.of("Cornecorneille", "Manque","Porteur","Rivvent","Souffletempête","Vifbois"));
        
       List<String> nomsMasculinsMuliens = new ArrayList<String>(List.of("Aoth","Bareris","Ehput-Ki","Kethoth","Mumed","Ramas","So-Kehur","Thazar-De","Urhur"));
       List<String> nomsFemininsMuliens = new ArrayList<String>(List.of("Arizima","Chathi","Nephis","Nulara","Murithi","Sefris","Thola","Umara","Zolis"));
       List<String> nomsFamilleMuliens = new ArrayList<String>(List.of("Ankhalab","Anskuld","Fézim","Hahpet","Nathandem","Sepret","Uuthrakt"));
      
       List<String> nomsMasculinsRashémi = new ArrayList<String>(List.of("Borivik","Faurgar","Jandar","Kanithar","Madislak","Ralmevik","Shaumar","Vladislak"));
       List<String> nomsFemininsRashémi = new ArrayList<String>(List.of("Fyevarra","Hulmarra","Immith","Imzel","Navarra","Shévarra","Tammith","Yuldra"));
       List<String> nomsFamilleRashémi = new ArrayList<String>(List.of("Chergoba","Dyernina","Iltazyare","Murnyethare","Stayanoga","Ulmokina"));
       
       List<String> nomsMasculinsShou = new ArrayList<String>(List.of("An","Chen","Chi","Fai","Jiang","Jun","Jian","Lian","Long","Meng","On","Shan","Shui","Wen"));
       List<String> nomsFemininsShou = new ArrayList<String>(List.of("Bai","Chao","Jia","Lei","Mei","Qiao","Shui","Tai"));
       List<String> nomsFamilleShou = new ArrayList<String>(List.of("Chien","Huang","Kao","Kung","Lao","Ling","Mei","Pin","Shin","Sum","Sum","Tan","Wan"));
       
       List<String> nomsMasculinsTurami = new ArrayList<String>(List.of("Anton","Diero","Marcon","Pieron","Rimardo","Roméro","Salazar","Umbéro"));
       List<String> nomsFemininsTurami = new ArrayList<String>(List.of("Balama","Dona","Faila","Jalana","Luisa","Marta","Quara","Sélise","Vonda"));
       List<String> nomsFamilleTurammi = new ArrayList<String>(List.of("Agosto","Astorio","Calabra","Domine","Falone","Marivaldi","Pisacar","Ramondo"));
        // Exemple pour la liste d'ethnies si nécessaire
        this.listeEthnie = new EthnieHumaine[] {
                new EthnieHumaine("Calishite", "Les Calishites sont plus petits et plus trapus que la plupart des humains. Ils ont la peau bronzée et des cheveux ainsi que des yeux marron foncé. On les trouve principalement au sud-ouest de Féérune", nomsMasculinsCalishites, nomsFémininsCalishites, nomsFamilleCalishites),
                new EthnieHumaine("Chondathien", "Les Chondatiens présentent une silhouette élancée, une peau tannée et des cheveux châtains allant quasiment du blond au brun. Ils sont généralement de grande taille, avec des yeux verts ou marron, mais cela n'a rien d'universel. Les humains d'origine Chondatienne dominent le centre de Féérune, autour de la mer Intérieure.", nomsMasculinsChondathiens, nomsFemininsChondathiens, nomsFamilleChondatiens),
                new EthnieHumaine("Damarien", "Les Damariens occupent principalement le nord-ouest de Féérune. Ils sont de taille et de corpulence moyennes, leur peau allant du pâle au bronzé. Ils ont des cheveux châtains ou bruns, mais la couleur de leurs yeux varie beaucoup, le marron restant le plus répandu.", nomsMasculinsDamariens, nomsFemininsDamariens, nomsFamilleDamariens),
                new EthnieHumaine("Illuskien", "Les Illuskiens sont des gens de grande taille à la peau claire et aux yeux bleus ou gris acier. La plupart ont des cheveux noir de jais, mais ceux qui vivent aux confins nord-ouest ont des chevelures blondes, rousses ou châtain clair. ", nomsMasculinsIlluskiens, nomsFemininsIlluskiens, nomsFamilleIlluskiens),
                new EthnieHumaine("Mulien", "Les Muliens prédominent sur les rives sud et sud-est de la mer Intérieure. Ils sont généralement grands et minces, dotés d'une peau ambrée et d'yeux noisette ou marron. Leurs cheveux vont du brun au châtain foncé, mais, sur les terres où cette ethnie est majoritaire, les nobles et bien d'autres muliens se rasent le crâne.", nomsMasculinsMuliens, nomsFemininsMuliens, nomsFamilleMuliens),
                new EthnieHumaine("Shou", "Les shous représentent l'ethnie la plus nombreuse et la plus puissante du Kara-Tur, au lointain orient de Féérune. Ils ont une pigmentation bronze doré, des cheveux de jais et des yeux sombres. Ils annoncent leur nom de famille avant leur prénom."),
                new EthnieHumaine("Rashémi", "Les Rashémis se trouvent surtout à l'est de la mer intérieure, souvent mêlés aux muliens. Ils sont d'ordinaire petits, trapus et musculeux, avec une peau olivâtre, des yeux sombres et d'épais cheveux bruns.", nomsMasculinsRashémi,nomsFemininsRashémi,nomsFamilleRashémi),
                new EthnieHumaine("Shou", "Les Shous représentent l'ethnie la plus nombreuse et la plus puissante du Kara-Tur, au lointain orient de Féérune. Ils ont une pigmentation bronze doré, des cheveux de jais et des yeux sombres. Ils annoncent leur nom de famille avant leur prénom.", nomsMasculinsShou, nomsFemininsShou, nomsFamilleShou),
                new EthnieHumaine("Téthyrien","Les téthyriens sont très présents sur toute la côte des épées, à l'ouest de Féérune. Ils ont une carrure et une stature moyenne et la peau olivâtre, sachant qu'elle présente des teintes plus pâles vers le nord. La couleur de leurs yeux et de leurs cheveux varie grandement, le plus courant étant des cheveux bruns et des yeux bleus. Les Théthyriens utilisent principalement des noms condathiens", nomsMasculinsChondathiens, nomsFemininsChondathiens, nomsFamilleChondatiens),
                new EthnieHumaine("Turami","Natifs de la rive méridionale de la mer Intérieure, les Turamis sont grands et musculeux, avec une peau couleur d'acajou sombre, des cheveux noirs bouclés et des yeux sombres.", nomsMasculinsTurami, nomsFemininsTurami, nomsFamilleTurammi)                		
        };
        
        caractéristiques.add(new Caractéristique("Augmentation de caractéristiques","La valeur de toutes les caractéristiques augmentent de 1"));
        caractéristiques.add(new Caractéristique("Âge", "Les humains deviennent adultes vers 20 ans et vivent moins d'un siècle."));
        caractéristiques.add(new Caractéristique("Alignement","Les humaisn ne sont pas naturellement attirés vers un certain type d'alignement. On trouve parmi eux le meilleur comme le pire."));
        caractéristiques.add(new Caractéristique("Taille","Les humains ont des tailles et des carrures très variées. Ils peuvent faire 1,50 mètre comme plus de 1,80 mètre. Ils sont considérés comme de taille Moyenne, peu importe leur poids, leur taille ou leur carrure."));
        caractéristiques.add(new Caractéristique("Vitesse","La vitesse d'un humain au sol est de 9 mètres."));
        caractéristiques.add(new Caractéristique("Langues", "Les humaisn peuvent parler, écrire et lire le commun et une langue supplémentaire au choix. Les humains apprennent généralement la langue des peuples qu'ils fréquentent, même s'il s'agit d'obscurs dialectes. Ils aiment parsemer leur langue d'expressions empruntées à d'autres races : des jurons orcs, des expressions musicales elfiques, des citation militaire naines, etc."));
        caractéristiques.add(new Caractéristique("Variante de traits humains", "Si vous utilisez les règles optionnelles des dons du chapitre 6, le MD peut autoriser ces traits alternatifs qui remplacent le trait initial augmentation de caractéristiques : Augmentation de caractéristique - La valeur de deux caractérsitiques au choix augmente de 1. Compétence : maîtrise d'une compétence au choix. Don : Obtention d'un don au choix."));
    }
}
