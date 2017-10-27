package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test class TrackerTest.
 * @author ypak
 * @version $Id$
 * @since 0.1
 */
public class TrackerTest {
	/**
	 * Test.
	 */
	@Test
	public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("name",  "description", 123L, "comments");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    /**
     * test method add new Item.
     */
    @Test
    public void whenFindByIdThenReturnItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("name1",  "description1", 123L, "comments1");
        tracker.add(item);
        tracker.findById(item.getId());
        System.out.println(item.getId());
        assertThat(tracker.findAll()[0], is(item));
    }

    /**
     * test method add new Item.
     */
    @Test
    public void whenUpdateThenChangedItemOnItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("name2",  "description2", 123L, "comments2");
        tracker.add(item);
        Item item1 = new Item("name3",  "description3", 123L, "comments3");
        item1.setId(item.getId());
        tracker.update(item1);
        assertThat(tracker.findAll()[0], is(item1));
    }

    /**
     * test method add new Item.
     */
    @Test
    public void whenDeleteThenChangedForNull() {
        Tracker tracker = new Tracker();
        Item item = new Item("name4",  "description4", 123L, "comments4");
        tracker.add(item);
        Item item1 = new Item("name5",  "description5", 123L, "comments5");
        tracker.add(item1);
        tracker.delete(item);
        assertThat(tracker.findAll()[0], is(item1));
    }

    /**
     * test method add new Item.
     */
    @Test
    public void whenFindByNameThenReturnItem() {

        Tracker tracker = new Tracker();

        Item item = new Item("name6",  "description6", 123L, "comments6");
        tracker.add(item);
        tracker.findByName(item.getName());
        assertThat(tracker.findAll()[0], is(tracker.findByName(item.getName())[0]));
    }
}

