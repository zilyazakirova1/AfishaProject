import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void shouldFindAll() {
        AfishaManager manager = new AfishaManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        AfishaManager manager = new AfishaManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        String[] actual1 = manager.findLast();
        String[] expected1 = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected1, actual1);

    }

    @Test
    public void shouldFindAllIfLimitDefined() {
        AfishaManager manager2 = new AfishaManager(4);
        manager2.add("Movie 10");
        manager2.add("Movie 20");
        manager2.add("Movie 30");
        String[] actual2 = manager2.findAll();
        String[] expected2 = {"Movie 10", "Movie 20", "Movie 30"};
        Assertions.assertArrayEquals(expected2, actual2);
    }

    @Test
    public void shouldFindAllIfLimitDefinedSetter() {
        AfishaManager manager2 = new AfishaManager();
        manager2.setLimit(4);
        manager2.add("Movie 10");
        manager2.add("Movie 20");
        manager2.add("Movie 30");
        String[] actual2 = manager2.findAll();
        String[] expected2 = {"Movie 10", "Movie 20", "Movie 30"};
        Assertions.assertArrayEquals(expected2, actual2);
    }

    @Test
    public void shouldFindLastIfLimitDefined() {
        AfishaManager manager2 = new AfishaManager(4);
        manager2.add("Movie 10");
        manager2.add("Movie 20");
        manager2.add("Movie 30");
        String[] actual3 = manager2.findLast();
        String[] expected3 = {"Movie 30", "Movie 20", "Movie 10"};
        Assertions.assertArrayEquals(expected3, actual3);
    }

    @Test
    public void shouldFindLastIfLimitDefinedSetter() {
        AfishaManager manager2 = new AfishaManager();
        manager2.setLimit(4);
        manager2.add("Movie 10");
        manager2.add("Movie 20");
        manager2.add("Movie 30");
        String[] actual3 = manager2.findLast();
        String[] expected3 = {"Movie 30", "Movie 20", "Movie 10"};
        Assertions.assertArrayEquals(expected3, actual3);
    }

    @Test
    public void shouldFindLastIfLimitDefinedSetterGetter() {
        AfishaManager manager = new AfishaManager();

        manager.setLimit(4);
        manager.add("Movie 10");
        manager.add("Movie 20");
        manager.add("Movie 30");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 30", "Movie 20", "Movie 10"};
        manager.setMovies(expected);
        Assertions.assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    public void shouldFindAllGetLimit() {
        AfishaManager manager = new AfishaManager();
        manager.setLimit(6);
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        Assertions.assertEquals(6, manager.getLimit());
    }

    @Test
    public void shouldFindLastIfLimitEqual() {
        AfishaManager manager2 = new AfishaManager(3);
        manager2.add("Movie 10");
        manager2.add("Movie 20");
        manager2.add("Movie 30");
        String[] actual3 = manager2.findLast();
        String[] expected3 = {"Movie 30", "Movie 20", "Movie 10"};
        Assertions.assertArrayEquals(expected3, actual3);
    }


    @Test
    public void shouldFindLastIfLimitMore() {
        AfishaManager manager2 = new AfishaManager(2);
        manager2.add("Movie 10");
        manager2.add("Movie 20");
        manager2.add("Movie 30");
        String[] actual3 = manager2.findLast();
        String[] expected3 = {"Movie 30", "Movie 20"};
        Assertions.assertArrayEquals(expected3, actual3);
    }


}
