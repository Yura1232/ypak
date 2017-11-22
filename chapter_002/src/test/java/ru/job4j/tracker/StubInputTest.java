package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test class Stubinput.
 * @author ypak
 * @version $Id$
 * @since 0.1
 */
public class StubInputTest {
	/**
	 * Test.
	 */
	@Test
	public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
		Tracker tracker = new Tracker();
		Input input = new StubInput(new String[]{"0", "test", "test", "test", "6"});
		new StartUI(input, tracker).init(); 
		assertThat(tracker.findAll()[0].getName(), is("test"));
	}
	@Test
	public void whenUpdateThenTrackerHasUpdatedValue() {
    	Tracker tracker = new Tracker();
    	Item item = tracker.add(new Item("test", "test", 123L, "test"));
    	Input input = new StubInput(new String[]{"2", item.getId(), "test1", "1test", "1test", "6"});
    	new StartUI(input, tracker).init();
    	assertThat(tracker.findAll()[0].getName(), is("test1"));
 	}
 	@Test
 	public void whenDeleteThenTrackerDeleteItem() {
 		Tracker tracker = new Tracker();
 		Item item = tracker.add(new Item("test", "test", 123L, "test"));
 		Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        Item[] expected = new Item[]{};
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll(), is(expected));

 	}
 	@Test
 	public void whenFindByIdThenGetThisItem() {
 		Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "test", 123L, "test")); 
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker);
        assertThat(item.getName(), is("test"));
    }

    @Test
    public void whenFindByNameThenGetThisItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "test", 123L, "test"));
        Input input = new StubInput(new String[]{"5", item.getId(), "6"});
        new StartUI(input, tracker);
        assertThat(item.getName(), is("test"));
    }
}