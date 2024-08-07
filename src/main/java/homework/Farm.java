package homework;

import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private List<AgreeCulture> agreeCultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCulture> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public void printInfo(){

        System.out.println(name);
        System.out.println(address);
        System.out.println(cattle);
        System.out.println(agreeCultural);

    }
}
