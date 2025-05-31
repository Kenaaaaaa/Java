package Lists;
import javax.swing.*;
import java.util.HashMap;

public class CapitalCities {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<>();

        capitalCities.put("USA", "Washington, D.C.");
        capitalCities.put("Canada", "Ottawa");

        System.out.println(capitalCities);
        System.out.println("Capital of USA: " + capitalCities.get("USA"));
        System.out.println(capitalCities.size());
        JButton button = new JButton();
        button.addActionListener(e -> {System.out.println(capitalCities.get("USA"));});
    }
}
