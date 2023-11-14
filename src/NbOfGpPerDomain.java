public class NbOfGpPerDomain {
    private String domain;
    private int nbOfGp;

    public NbOfGpPerDomain(String domain, int nbOfGp) {
        this.domain = domain;
        this.nbOfGp = nbOfGp;
    }

    public String getDomain() {
        return domain;
    }
    public int getNbOfGp() {
        return nbOfGp;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    public void setNbOfGp(int nbOfGp) {
        this.nbOfGp = nbOfGp;
    }
}
