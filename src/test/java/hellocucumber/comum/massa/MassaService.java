package hellocucumber.comum.massa;

import hellocucumber.comum.massa.model.Massa;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MassaService {

    private static final Map<String, Massa> massas = new HashMap<>();

    public static Massa getMassa(String id) {
        Massa massa = massas.get(id);
        if (massa == null) {
            throw new RuntimeException(String.format("A massa de id %s não foi carregada, favor " +
                    "adicionar o passo \"a seguinte massa: {id}\" no inicio do cenário", id));
        }
        return massa;
    }

    @Given("as massas")
    public void asMassas(DataTable table) {
        List<Massa> massasCarregadas = table.asList(Massa.class);
        massasCarregadas.forEach(massa -> massas.put(massa.getId(), massa));
    }

    @DataTableType
    public Massa criarMassa(final Map<String, String> entry) {
        return new Massa(entry.get("id"), entry.get("day"), entry.get("example"));
    }
}
