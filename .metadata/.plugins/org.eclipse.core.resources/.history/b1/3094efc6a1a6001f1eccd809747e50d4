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

        // Initialisation des noms
        List<String> nomsFéminins = new ArrayList<>(List.of(
                "Amafrey",
        		"Arveene",
                "Atala", 
                "Bèthe",
                "Cefrey",
                "Ceidil", 
                "Esvele", 
                "Hama", 
                "Jasmal",
                "Jhessail",
                "Kerri", 
                "Kethra",
                "Lureene",
                "Mara",
                "Meilil", 
                "Miri",
                "Olga",
                "Rowan", 
                "Seipora", 
                "Shandri",
                "Silifrey",
                "Tessèle", 
                "Westra",
                "Yasheira", 
                "Zasheida"
        ));

        List<String> nomsMasculins = new ArrayList<>(List.of(
                "Andre",
        		"Aseir", 
                "Bardeid",
                "Blath",
                "Bor",
                "Bran",
                "Darvin",
                "Dorn",
                "Evendur",
                "Frath",
                "Fodel",
                "Geth",
                "Glar",
                "Gorstag",
                "Grigor",
                "Grim", 
                "Haseid",
                "Helm",
                "Igan",
                "Ivor", 
                "Khemed",
                "Kosef",
                "Landre",
                "Luth",
                "Malark",
                "Malcre",
                "Mehmen",
                "Mival",
                "Morn", 
                "Orel",
                "Pavel",
                "Randal",
                "Sergor", 
                "Stedd", 
                "Stor",
                "Sudeiman",
                "Taman",
                "Urth",
                "Zasheir"
        ));

        List<String> nomsFamille = new ArrayList<>(List.of(
                "Basha",
                "Bersk", 
                "Chernin",
                "Cornecorneille",
                "Dotsk",
                "Dragonbrun",
                "Dumein", 
                "Flânecouronne", 
                "Grandcerf", 
                "Griscastel", 
                "Jassan", 
                "Khalid", 
                "Kulenov", 
                "Lièvre", 
                "Manque",
                "Marsk", 
                "Mostana", 
                "Németsk",
                "Pashar",
                "Platbois",
                "Porteur",
                "Rein", 
                "Rivvent",
                "Shemov",
                "Souffletempête",
                "Starag",
                "Vifbois"
        ));

        // Combiner tous les noms
        List<String> tousLesNoms = new ArrayList<>();
        tousLesNoms.addAll(nomsFéminins);
        tousLesNoms.addAll(nomsMasculins);

      

        // Exemple pour la liste d'ethnies si nécessaire
        this.listeEthnie = new EthnieHumaine[] {
                new EthnieHumaine("Calishite", "Les Calishites sont plus petits et plus trapus que la plupart des humains. Ils ont la peau bronzée et des cheveux ainsi que des yeux marron foncé. On les trouve principalement au sud-ouest de Féérune"),
                new EthnieHumaine("Chondathien", "Les Chondatiens présentent une silhouette élancée, une peau tannée et des cheveux châtains allant quasiment du blond au brun. Ils sont généralement de grande taille, avec des yeux verts ou marron, mais cela n'a rien d'universel. Les humains d'origine Chondatienne dominent le centre de Féérune, autour de la mer Intérieure."),
                new EthnieHumaine("Damarien", "Les Damariens occupent principalement le nord-ouest de Féérune. Ils sont de taille et de corpulence moyennes, leur peau allant du pâle au bronzé. Ils ont des cheveux châtains ou bruns, mais la couleur de leurs yeux varie beaucoup, le marron restant le plus répandu."),
                new EthnieHumaine("Illuskien", "Les illuskiens sont des gens de grande taille à la peau claire et aux yeux bleus ou gris acier. La plupart ont des cheveux noir de jais, mais ceux qui vivent aux confins nord-ouest ont des chevelures blondes, rousses ou châtain clair. "),
                
        };
    }
}
