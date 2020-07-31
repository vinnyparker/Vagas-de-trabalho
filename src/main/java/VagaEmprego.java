public class VagaEmprego {

    private String nomeVaga;
    private String cidade;

    public VagaEmprego() { }

    public VagaEmprego(String nomeVaga, String cidade) {
        this.nomeVaga = nomeVaga;
        this.cidade = cidade;
    }

    public String getNomeVaga() {
        return nomeVaga;
    }

    public void setNomeVaga(String nomeVaga) {
        this.nomeVaga = nomeVaga;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
