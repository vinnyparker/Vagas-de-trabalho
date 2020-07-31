import java.util.ArrayList;
import java.util.List;

public class MainClass extends VagaDeEmprego {

    public static void main(String[] args) {

        List<VagaDeEmprego> vagas = new ArrayList<>();
        vagas.add(new VagaDeEmprego("Motorista", "São Paulo"));
        vagas.add(new VagaDeEmprego("Empacotador", "Araras"));
        vagas.add(new VagaDeEmprego("Administrador", "Leme"));
        vagas.add(new VagaDeEmprego("Programador", "Pirassununga"));


        FiltroDasCidade filtroDasCidade = new FiltroDasCidade();
        filtroDasCidade.setCandidato(1);

        filtroDasCidade.addCidade("Leme");
        filtroDasCidade.addCidade("Gotham");
        filtroDasCidade.addCidade("Pirassunga");


        List<VagaDeEmprego> cidadesEncontradas = new ArrayList<>();

        for (VagaDeEmprego vaga : vagas) {
            if (filtroDasCidade.getCidades().contains(vaga.getCidade())) {
                cidadesEncontradas.add(vaga);
            }


            System.out.println("Cidades encotradas = " + cidadesEncontradas);

        }
    }
}