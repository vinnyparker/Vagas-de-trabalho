import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main extends VagaEmprego {

    public static void main(String[] args) {
        List<String> cidades = new ArrayList<>();
        cidades.add("Gotham");
        cidades.add("Araras");
        cidades.add("Leme");
        cidades.add("Santuario de Atena");

        List<VagaEmprego> vagas = new ArrayList<>();
        vagas.add(new VagaEmprego("Motorista", "São Paulo"));
        vagas.add(new VagaEmprego("Empacotador", "Araras"));
        vagas.add(new VagaEmprego("Administrador", "Leme"));
        vagas.add(new VagaEmprego("Programador", "Pirassununga"));
        vagas.add(new VagaEmprego("Cavaleiro de Ouro de Aries", "Santuario de Atena"));


        FiltroCidade filtroCidade = new FiltroCidade();
        filtroCidade.setCandidato(1);
        filtroCidade.setCidades(cidades);


        List<String> cidadesEncontradas = new ArrayList<>();

        for (VagaEmprego vaga : vagas) {
            if (filtroCidade.getCidades().contains(vaga.getCidade())) {
                cidadesEncontradas.add(vaga.getCidade());
            }
        }

        ListIterator iterator = cidadesEncontradas.listIterator();
        while (iterator.hasNext()){
            System.out.println("Imprimindo o iterator: "+iterator.next());
        }
    }
}