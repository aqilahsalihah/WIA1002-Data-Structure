import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList dates = new ArrayList();
        dates.add(new Date());
        Date date = (Date) dates.get(0);
    }
}
