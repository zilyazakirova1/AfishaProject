import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void test() {
        AfishaManager manager = new AfishaManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        Assertions.assertArrayEquals(expected, actual);

        String[] actual1 = manager.findLast();
        String[] expected1 = {"Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected1, actual1);
    }


}
