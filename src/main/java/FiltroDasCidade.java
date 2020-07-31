import java.util.List;

public class FiltroDasCidade {

    private int candidato;
    private List<String> cidades;

    public FiltroDasCidade() {

    }

    public int getCandidato() {
        return candidato;
    }

    public void setCandidato(int idCandidato) {
        this.candidato = idCandidato;
    }

    public List<String> getCidades() {
        return cidades;
    }

    public void setCidades(List<String> cidades) {
        this.cidades = cidades;
    }

    public void addCidade(String cidade) { // esta dando NullPointerException
        cidades.add(cidade);
    }
}