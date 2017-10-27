package ru.job4j.tracker;
/**
 * Class Item - описание заявки.
 * @autor ypak
 * @version $id$
 * @since 0.1
 */

public class Item {
	/**
	 * name - items name.
	 */
	public String name;
	/**
	 * description.
	 */
	public String description;
	/**
	 * create time.
	 */
	public long create;
	/**
	 * comments.
	 */
	public String comments;
	/**
	 * id item'a.
	 */
	private String id;
	/**
	 * default constructor.
	 */
	public Item() {

	}
	/**
	 * Item constructor.
	 * @param name - name.
	 * @param description - description.
	 * @param create - create.
	 * @param comments - comments.
	 */
	public Item(String name, String description, long create, String comments) {
		this.name = name;
		this.description = description;
		this.create = create;
		this.comments = comments;
	}
	/**
	 * method get.
	 * @return name.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * method get.
	 * @return description.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * method get.
	 * @return create.
	 */
	public long getCreate() {
		return this.create;
	}
	/**
	 * method get.
	 * @return comments.
	 */
	public String getComments() {
		return this.comments;
	}
	/**
	 * method get.
	 * @return id.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * method set.
	 * @param id.
	 */
	public void setId(String id) {
		this.id = id;
	}

}