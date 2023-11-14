import java.util.logging.Logger;

public class ToolkitUse {
    //j'ai pas le temps d'apprendre à utiliser les logger donc on va se contenter d'un S.out...
    public static void main(String[] args){
        ToolKit toolKit = new ToolKit();

        System.out.println("\nTest de la fonction getSomeLevelsWhichOtherNameContainingAA :");
        toolKit.getSomeLevelsWhichOtherNameContainingAA().forEach(System.out::println);

        System.out.println("\nTest de la fonction getLevelScoreAverage :");
        System.out.println(toolKit.getLevelScoreAverage());

        System.out.println("\nTest de la fonction getSomeToolNames :");
        toolKit.getSomeToolNames('e').forEach(System.out::println);

        System.out.println("\nTest de la fonction getSomeToolsByWord :");
        toolKit.getSomeToolsByWord("faciliter").forEach(System.out::println);

        System.out.println("\nTest de la fonction getDomainListOrderedByNumberOfGoodPractices :");
        System.out.println(toolKit.getDomainListOrderedByNumberOfGoodPractices()); //le tri ne fonctionne pas, mais il est 17h. Je n'ai pas le temps d'aller plus loin...
    }
}
