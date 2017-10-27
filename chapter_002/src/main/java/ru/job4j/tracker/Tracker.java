package ru.job4j.tracker;

import ru.job4j.tracker.*;
import java.util.*;
/**
 * class Tracker.
 */
public class Tracker {
    /**
	 * Item array items.
	 */
	private Item[] items = new Item[10];
	/**
	 * param position.
	 */
	private int position = 0;
	/**
	 * constant param Random RN.
	 */
	private static final Random RN = new Random();
	/**
	 * method Item.
	 * @param item.
	 * @return result.
	 */
	public Item add(Item item) {
		item.setId(this.generateId());
	 	this.items[position++] = item;
	 	return item;
	}
	/**
	 * method findById.
	 * @param id.
	 * @return result.
	 */
	public Item findById(String id) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
	/**
	 * method findAll.
	 * @return result.
	 */
	public Item[] findAll() {
		Item[] result = new Item[this.position];
		for (int index = 0; index != this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}
	/**
	 * method delete.
	 * @param item.
	 */
	public void delete(Item item) {
      String currentItem = item.getId();
      for (int index = 0; index != position; index++) {
          if (this.items[index].getId().equals(currentItem)) {
              this.items[index] = null;
              break;
          }

      }
      for (int updatePos = 0; updatePos != position; updatePos++) {
          if (this.items[updatePos] == null) {
              this.items[updatePos] = this.items[position - 1];
              this.items[position - 1] = null;
              break;
          }

      }
      position--;
    }
    /**
	 * method update.
	 * @param item.
	 * @return result.
	 */
    public void update(Item item) {
    	String currentItem = item.getId();
      	for (int index = 0; index != position; index++) {
          if (this.items[index].getId().equals(currentItem)) {
              this.items[index] = item;
              break;
          }

      }
    }
    /**
	 * method findByName.
	 * @param key.
	 * @return result.
	 */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int temp = 0;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[temp] = this.items[index];
                temp++;

            }
        }
    result = Arrays.copyOf(result, temp);
    return result;
    }
    /**
	 * method generateId.
	 * @return result.
	 */
	public String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}
}