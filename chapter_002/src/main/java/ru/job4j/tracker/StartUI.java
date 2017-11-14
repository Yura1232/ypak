package ru.job4j.tracker;

public class StartUI {
	private static final String EXIT = "6";
	private static final String ADD = "0";
	private static final String SHOW = "1";
	private static final String EDIT = "2";
	private static final String DELETE = "3";
	private static final String FINDID = "4";
	private static final String FINDNAME = "5";
	private final Input input;
	private final Tracker tracker;
	public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
            	this.showItems();
            } else if (EDIT.equals(answer)) {
            	this.editItem();
            } else if (DELETE.equals(answer)) {
            	this.deleteItem();
            } else if (FINDID.equals(answer)) {
            	this.findItemByID();
            } else if (FINDNAME.equals(answer)) {
            	this.findItemByNAME();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }
    /**
     * Метод реализует вывод всех заявок.
     */
    private void showItems() {
    	System.out.println("------------ Вывод всех заявок --------------");
    	Item[] result = this.tracker.findAll();
    	for (Item item: result) {
    		System.out.println(item);
    	}
    }
    /**
     * Метод реализует изминение заявки.
     */
    private void editItem() {
    	System.out.println("------------ Редактирование заявки --------------");
    	String name = this.input.ask("Введите имя заявки :");
    	String desc = this.input.ask("Введите имя заявки :");
    	String comments = this.input.ask("Введите имя заявки :");
    	Item item = new Item(name, desc, System.currentTimeMillis(), comments);
    	this.tracker.update(item);
    }
    /**
     * Метод реализует удаление заявки.
     */
    private void deleteItem() {
    	System.out.println("------------ Удаление заявки --------------");
    	String id = this.input.ask("Введите id заявки :");
		Item item = this.tracker.findById(id);
    	this.tracker.delete(item);
    }
    /**
     * Метод реализует поиск заявки по ид.
     */
    private void findItemByID() {
    	System.out.println("------------ Поиск по ID --------------");
    	String id = this.input.ask("Введите id заявки :");
    	Item item = this.tracker.findById(id);
    	System.out.println(item);

    }
    /**
     * Метод реализует поиск заявки по имени.
     */
    private void findItemByNAME() {
    	System.out.println("------------ Поиск по имени --------------");
    	String name = this.input.ask("Введите имя заявки :");
    	Item[] result = this.tracker.findByName(name);
        for (Item item : result) {
            System.out.println(item);
        }

    }
    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой языки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите имя заявки :");
        String comments = this.input.ask("Введите имя заявки :");
        Item item = new Item(name, desc, System.currentTimeMillis(), comments);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }
     /**
     * Method show menu.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by ID");
        System.out.println("5. Find item by NAME");
        System.out.println("6. EXIT");
        System.out.println("Select:");
    }




	public static void main(String[] args) {

	}
}