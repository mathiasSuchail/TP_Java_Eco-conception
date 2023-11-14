public class MaturityLevel {
    private String level;
    private String otherName;
    private int score;
    private String meaning;

    public MaturityLevel(String level, String otherName, int score, String meaning) {
        this.level = level;
        this.otherName = otherName;
        this.score = score;
        this.meaning = meaning;
    }

    public String getLevel() {
        return level;
    }
    public String getOtherName() {
        return otherName;
    }
    public int getScore() {
        return score;
    }
    public String getMeaning() {
        return meaning;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return  "level='" + level + '\'' +",\n"+
                "otherName='" + otherName + '\'' +",\n"+
                "score=" + score +",\n"+
                "meaning='" + meaning + '\''+'.';
    }
}
