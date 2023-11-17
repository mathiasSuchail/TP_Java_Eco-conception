import java.util.logging.Logger;

public class ToolkitUse {
    private static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args){

        ToolKit toolKit = new ToolKit();

        logger.info("\nTest de la fonction getSomeLevelsWhichOtherNameContainingAA :\n"+toolKit.getSomeLevelsWhichOtherNameContainingAA()+"\n");
        logger.info("\nTest de la fonction getLevelScoreAverage :\n"+toolKit.getLevelScoreAverage()+"\n");
        logger.info("\nTest de la fonction getSomeToolNames :\n"+toolKit.getSomeToolNames('e')+"\n");
        logger.info("\nTest de la fonction getSomeToolsByWord :\n"+toolKit.getSomeToolsByWord("faciliter")+"\n");
        logger.info("\nTest de la fonction getDomainListOrderedByNumberOfGoodPractices :\n"+toolKit.getDomainListOrderedByNumberOfGoodPractices()+"\n");
        logger.info("\nTest de la fonction getNumberOfGoodPracticies :\n"+toolKit.getNumberOfGoodPractices()+"\n");
        logger.info("\nTest de la fonction getGoodPracticesByDomain :\n"+toolKit.getGoodPracticesByDomain("Spécification")+"\n");
        logger.info("\nTest de la fonction calculateGoodPracticeNumberOfLettersAverage :\n"+toolKit.calculateGoodPracticeNumberOfLettersAverage()+"\n");
        logger.info("\nTest de la fonction getGoodPracticesByWord :\n"+toolKit.getGoodPracticesByWord("retenir")+"\n");
        logger.info("\nTest de la fonction getAllGoodPractices :\n"+toolKit.getAllGoodPractices()+"\n");
        logger.info("\nTest de la fonction getNumberOfGoodPracticesByLetter :\n"+toolKit.getNumberOfGoodPracticesByLetter('u')+"\n");
        logger.info("\nTest de la fonction  : getStringGoodPracticesByDomain\n"+toolKit.getStringGoodPracticesByDomain("Spécification")+"\n");
        logger.info("\nTest de la fonction  : getRandomGoodPractice\n"+toolKit.getRandomGoodPractice()+"\n");
    }
}
