package hellocucumber.comum.massa;

import hellocucumber.comum.massa.model.Massa;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MassaServiceV2 {

    private MassaServiceV2() {}

    public static Massa obtemMassa(String massaString) {
        String[] split = massaString.split(";");
        return new Massa(split[0].substring(split[0].indexOf("=") + 1),
                split[2].substring(split[2].indexOf("=") + 1),
                split[1].substring(split[1].indexOf("=") + 1));
    }
}
