import java.util.*;
import java.util.logging.Level;
import java.util.stream.Collectors;

public class ToolKit {
    private Map<String, MaturityLevel> levels;
    private List<GoodPractice> goodPractices;
    private List<NbOfGpPerDomain> nbOfGpPerDomains;
    private List<Tool> tools;
    private Random r;

    public ToolKit() {
        initTools();
        initGoodPractices();
        initLevels();
        initNbOfGpPerDomains();
        r=new Random();
    }

    private void initTools(){
        tools = new ArrayList<>();
        tools.add(new Tool("EcoIndex", "Algorithme pour évaluer la performance environnementale d'une URL"));
        tools.add(new Tool("Certification écoconception", "Certification écoconception de service numérique"));
        tools.add(new Tool("RWEB", "Référentiel d'écoconception web"));
        tools.add(new Tool("Check-list", "Pour faciliter la mise en oeuvre des bonnes pratiques"));
        tools.add(new Tool("Maturité", "Évaluation de la maturité environnementale"));
        tools.add(new Tool("Empreinte", "Évaluation de l'empreinte environnementale"));
        tools.add(new Tool("GreenIT-Analysis", "Extension pour calculer automatiquement l'EcoIndex d'une URL"));
        tools.add(new Tool("Liste de discussion", "La communauté française discute sur ecoconceptionweb@googlegroups.com"));
        tools.add(new Tool("Conférences", "Animation de conférences par les membres du collectif"));
        tools.add(new Tool("Site Web", "Site de sensibilisation à la démarche"));
        tools.add(new Tool("Slack", "Espace d'échange de la communauté"));
        tools.add(new Tool("Livre blanc", "État de l'art à jour et récent"));
        tools.add(new Tool("Accessibilité", "Initiatives autour de l'accessibilité numérique, de la qualité et de l'éthique"));
    }
    private void initLevels(){
        levels = HashMap.newHashMap(0);
        levels.put("Bronze", new MaturityLevel("Bronze", "Engagé Niveau 1 A", 45, "Niveau le plus difficile à atteindre. Les bonnes pratiques qui permettent d'atteindre le niveau Bronze sont celles qui ont le plus gros effet de levier pour réduire les impacts environnementaux."));
        levels.put("Argent", new MaturityLevel("Argent", "Confirmé Niveau 2 AA", 55, "Maturité et engagement importants sur la problématique."));
        levels.put("Or", new MaturityLevel("Or", "Exemplaire Niveau 3 AAA", 70, "Engagement fort et de fond sur la problématique."));
    }
    private void initGoodPractices(){
        goodPractices = new ArrayList<>();
        goodPractices.add(new GoodPractice("Retenir uniquement les fonctionnalités essentielles.", Constants.DOMAIN_1));
        goodPractices.add(new GoodPractice("Quantifier précisément le besoin.", Constants.DOMAIN_1));
        goodPractices.add(new GoodPractice("Supprimer les fonctionnalités non utilisées.", Constants.DOMAIN_1));
        goodPractices.add(new GoodPractice("Privilégier une approche 'mobile first'.", Constants.DOMAIN_1));

        goodPractices.add(new GoodPractice("Optimiser le parcours utilisateur.", Constants.DOMAIN_2));
        goodPractices.add(new GoodPractice("Éviter les animations Javascript/CSS.", Constants.DOMAIN_2));
        goodPractices.add(new GoodPractice("Limiter le recours aux carrousels.", Constants.DOMAIN_2));
        goodPractices.add(new GoodPractice("Préférer la pagination au défilement infini.", Constants.DOMAIN_2));
        goodPractices.add(new GoodPractice("Favoriser les pages classiques.", Constants.DOMAIN_2));

        goodPractices.add(new GoodPractice("Favoriser les polices standard.", Constants.DOMAIN_3));
        goodPractices.add(new GoodPractice("Valider son code avec un Linter.", Constants.DOMAIN_3));
        goodPractices.add(new GoodPractice("Optimiser la taille des cookies.", Constants.DOMAIN_3));
        goodPractices.add(new GoodPractice("Choisir un format de données adapté.", Constants.DOMAIN_3));
        goodPractices.add(new GoodPractice("Optimiser les requêtes aux bases de données.", Constants.DOMAIN_3));

        goodPractices.add(new GoodPractice("Utiliser un CDN.", Constants.DOMAIN_4));
        goodPractices.add(new GoodPractice("Utiliser tous les niveaux de cache du CMS.", Constants.DOMAIN_4));
        goodPractices.add(new GoodPractice("Utiliser un cache HTTP.", Constants.DOMAIN_4));
        goodPractices.add(new GoodPractice("Stocker les données dans le cloud.", Constants.DOMAIN_4));
        goodPractices.add(new GoodPractice("Utiliser un serveur asynchrone.", Constants.DOMAIN_4));

        goodPractices.add(new GoodPractice("Limiter l'utilisation des GIF animés.", Constants.DOMAIN_5));
        goodPractices.add(new GoodPractice("Limiter la taille des emails envoyés.", Constants.DOMAIN_5));
        goodPractices.add(new GoodPractice("Encoder les sons en dehors du CMS.", Constants.DOMAIN_5));
        goodPractices.add(new GoodPractice("Compresser les documents.", Constants.DOMAIN_5));
        goodPractices.add(new GoodPractice("Optimiser les PDF.", Constants.DOMAIN_5));

        goodPractices.add(new GoodPractice("Éviter les redirections.", Constants.DOMAIN_6));
        goodPractices.add(new GoodPractice("Désactiver les logs binaires.", Constants.DOMAIN_6));
        goodPractices.add(new GoodPractice("Avoir une stratégie de fin de vie des contenus.", Constants.DOMAIN_6));
        goodPractices.add(new GoodPractice("Mettre en place un plan de fin de vie du site.", Constants.DOMAIN_6));
    }
    private void initNbOfGpPerDomains(){
        nbOfGpPerDomains = new ArrayList<>();
        nbOfGpPerDomains.add(new NbOfGpPerDomain(Constants.DOMAIN_1, 4));
        nbOfGpPerDomains.add(new NbOfGpPerDomain(Constants.DOMAIN_2, 25));
        nbOfGpPerDomains.add(new NbOfGpPerDomain(Constants.DOMAIN_3, 40));
        nbOfGpPerDomains.add(new NbOfGpPerDomain(Constants.DOMAIN_4, 28));
        nbOfGpPerDomains.add(new NbOfGpPerDomain(Constants.DOMAIN_5, 14));
        nbOfGpPerDomains.add(new NbOfGpPerDomain(Constants.DOMAIN_6, 4));
    }


    public List<String> getSomeLevelsWhichOtherNameContainingAA(){
        List<String> result = new ArrayList<>();
        levels.forEach((level, maturityLevel)->{
            if (maturityLevel.getOtherName().contains("AA")){
                result.add(level);
            }
        });
        return result;
    }
    public String getLevelScoreAverage(){
        int sum = 0;
        for (MaturityLevel maturityLevel : levels.values()) {
            sum += maturityLevel.getScore();
        }
        double avg=(double) sum/levels.size();
        return Math.round(avg * 100) / 100.0 + "%";
    }
    public List<Tool> getSomeToolNames(char firstLetter){
        List<Tool> result = new ArrayList<>();
        tools.forEach(tool -> {
            if(tool.name().toCharArray()[0]==Character.toUpperCase(firstLetter)){
                result.add(tool);
            }
        });
        return result;
    }
    public List<String> getSomeToolsByWord(String word){
        List<String> result = new ArrayList<>();
        tools.forEach(tool -> {
            if(tool.description().contains(word)){
                result.add(tool.name());
            }
        });
        return result;
    }
    public List<String> getDomainListOrderedByNumberOfGoodPractices(){
        List<String> result;
        result = nbOfGpPerDomains.stream().sorted((domain, nbOfGpPerDomain)->domain.getNbOfGp()).map(NbOfGpPerDomain::getDomain).toList();
        return result;
    }
    public int getNumberOfGoodPractices(){
        return goodPractices.size();
    }
    public List<GoodPractice> getGoodPracticesByDomain(String domain){
        return goodPractices.stream().filter(e->e.getField().toLowerCase().contains(domain.toLowerCase())).toList();
    }
    public double calculateGoodPracticeNumberOfLettersAverage(){
        return (double) Math.round(goodPractices.stream()
                .mapToDouble(e -> e.getName().length())
                .average()
                .orElse(0.0)*100)/100;
    }
    public List<GoodPractice> getGoodPracticesByWord(String word){
        return goodPractices.stream().filter(e -> e.getName().toLowerCase().contains(word.toLowerCase())).toList();
    }

    public List<String> getAllGoodPractices(){
        return goodPractices.stream().map(GoodPractice::getName).toList();
    }
    public int getNumberOfGoodPracticesByLetter(char letter){
        return (int) goodPractices.stream().filter(e->Character.toLowerCase(e.getName().toCharArray()[0]) ==Character.toLowerCase(letter)).count();
    }
    public String getStringGoodPracticesByDomain(String domain){
        return getGoodPracticesByDomain(domain).stream().map(GoodPractice::toString).collect(Collectors.joining("|"));
    }
    public String getRandomGoodPractice(){
        return goodPractices.get(r.nextInt(goodPractices.size())).toString();
    }

}
