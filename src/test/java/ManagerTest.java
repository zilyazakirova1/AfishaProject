import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void test() {
        AfishaManager manager = new AfishaManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"};
        Assertions.assertArrayEquals(expected, actual);

        String[] actual1 = manager.findLast();
        String[] expected1 = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected1, actual1);

        AfishaManager manager2 = new AfishaManager(4);
        manager2.add("Movie 10");
        manager2.add("Movie 20");
        manager2.add("Movie 30");
        String[] actual2 = manager2.findAll();
        String[] expected2 = {"Movie 10", "Movie 20", "Movie 30"};
        Assertions.assertArrayEquals(expected2, actual2);

        String[] actual3 = manager2.findLast();
        String[] expected3 = {"Movie 30", "Movie 20", "Movie 10"};
        Assertions.assertArrayEquals(expected3, actual3);
    }


}
