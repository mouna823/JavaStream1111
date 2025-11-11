import java.util.Arrays;
import java.util.List;

public class clientdata {
    public static List<Client> getClients() {
        return Arrays.asList(
            new Client(1, "Mouna", "Lyon", 95000),
            new Client(2, "Sara", "Paris", 40000),
            new Client(3, "Omar", "Lyon", 70000),
            new Client(4, "Yassine", "Paris", 85000),
            new Client(5, "Aya", "Rabat", 30000),
            new Client(6, "Nadia", "Paris", 60000)
        );
    }
}
