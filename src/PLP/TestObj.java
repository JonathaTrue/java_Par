package PLP;

public class TestObj {

    private String nomeP;
    private int idadeP;

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public int getIdadeP() {
        return idadeP;
    }

    public void setIdadeP(int idadeP) {
        this.idadeP = idadeP;
    }

    public TestObj(String nomeP, int idadeP) {
        this.getNomeP();
        this.getIdadeP();
        this.setNomeP(nomeP);
        this.setIdadeP(idadeP);
    }
}
