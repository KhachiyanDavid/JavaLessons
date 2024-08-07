package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Address farmAddress = new Address("NY", "Mountain sgtreet 1/5", 5500009);
        List<AgreeCulture> agreeCultures = new ArrayList<>();

        AgreeCulture soya = new AgreeCulture("Soya", 500);
        AgreeCulture wheet = new AgreeCulture("Wheet", 700);
        AgreeCulture pea = new AgreeCulture("Pea", 900);

        agreeCultures.add(0, soya);
        agreeCultures.add(1, wheet);
        agreeCultures.add(2, pea);

        Map<Cattle, Integer> cattle = new HashMap<>();

        cattle.put(Cattle.CHIKENS,10);
        cattle.put(Cattle.PIGS,7);
        cattle.put(Cattle.COWS, 9);
        cattle.put(Cattle.TURKEYS, 10);
        cattle.put(Cattle.SHEEPS, 20);

        Farm farmOne = new Farm("SheepFarm", farmAddress, cattle, agreeCultures);

        farmOne.printInfo();



    }
}
