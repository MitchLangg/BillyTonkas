package database;

public class Const {
	/**
	 * @author MitchellLang
	 * @description Class containing all of the constants
	 */
/*--------------CREATING CONSTANTS FOR CHOCOLATE TABLE----------------*/
public static final String TABLE_CHOCOLATE = "chocolate";
public static final String CHOCOLATE_COLUMN_ID = "id";
public static final String CHOCOLATE_COLUMN_NAME = "name";
public static final String CHOCOLATE_COLUMN_PRICE = "price";
public static final String CHOCOLATE_COLUMN_QUANTITY = "quantity";



/*---------------CREATING CHOCOLATE TABLE----------------*/
public static final String CREATE_TABLE_CHOCOLATE = 
		"CREATE TABLE " + TABLE_CHOCOLATE + "(" +
		CHOCOLATE_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		CHOCOLATE_COLUMN_NAME + " VARCHAR(50) NOT NULL, " +
		CHOCOLATE_COLUMN_PRICE + " VARCHAR(50) NOT NULL, " +
		CHOCOLATE_COLUMN_QUANTITY + " VARCHAR(50) NOT NULL" +
		");";


/*---------------CREATING CONSTANTS FOR CANDY TABLE-----------------*/
public static final String TABLE_CANDY = "candy";
public static final String CANDY_COLUMN_ID = "id";
public static final String CANDY_COLUMN_NAME = "name";
public static final String CANDY_COLUMN_PRICE = "price";
public static final String CANDY_COLUMN_QUANTITY = "quantity";


/*----------------CREATING CANDY TABLE-------------------*/
public static final String CREATE_TABLE_CANDY = 
		"CREATE TABLE " + TABLE_CANDY + "(" +
		CANDY_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		CANDY_COLUMN_NAME + " VARCHAR(50) NOT NULL, " +
		CANDY_COLUMN_PRICE + " VARCHAR(50) NOT NULL, " +
		CANDY_COLUMN_QUANTITY + " VARCHAR(50) NOT NULL" +
				");"; 

/**
 * @author MitchellTodd
 * @description gummy/inv/login table SQL creation
 * @date Week 6-8
 */

/*--------------CREATING GUMMY FOR GUMMY TABLE----------------*/
public static final String TABLE_GUMMY = "gummy";
public static final String GUMMY_COLUMN_ID = "id";
public static final String GUMMY_COLUMN_NAME = "name";
public static final String GUMMY_COLUMN_PRICE = "price";
public static final String GUMMY_COLUMN_QUANTITY = "quantity";

/*---------------CREATING GUMMY TABLE----------------*/
public static final String CREATE_TABLE_GUMMY = 
		"CREATE TABLE " + TABLE_GUMMY + "(" +
		GUMMY_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		GUMMY_COLUMN_NAME + " VARCHAR(50) NOT NULL, " +
		GUMMY_COLUMN_PRICE + " VARCHAR(50) NOT NULL, " +
		GUMMY_COLUMN_QUANTITY + " VARCHAR(50) NOT NULL" +
		");";

/*---------------CREATING CONSTANTS FOR INVENTORY TABLE---------------*/
public static final String TABLE_INVENTORY = "inventory";
public static final String INVENTORY_COLUMN_ID = "id";
public static final String INVENTORY_COLUMN_NAME = "name";

/*-----------------CREATING INVENTORY TABLE-----------------*/
public static final String CREATE_TABLE_INVENTORY = 
		"CREATE TABLE " + TABLE_INVENTORY + "(" +
		INVENTORY_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		INVENTORY_COLUMN_NAME + " VARCHAR(50) NOT NULL" +
				");";

/*---------------CREATING CONSTANTS FOR LOGIN TABLE-------------------*/
public static final String TABLE_LOGIN = "login";
public static final String LOGIN_COLUMN_ID = "id";
public static final String LOGIN_COLUMN_DB_NAME = "db_name";
public static final String LOGIN_COLUMN_USER_NAME = "user_name";
public static final String LOGIN_COLUMN_USER_PASSWORD = "user_password";

/*-----------------CREATING LOGIN TABLE---------------------*/
public static final String CREATE_TABLE_LOGIN = 
		"CREATE TABLE " + TABLE_LOGIN + "(" +
		LOGIN_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		LOGIN_COLUMN_DB_NAME + " VARCHAR(50) NOT NULL, " +
		LOGIN_COLUMN_USER_NAME + " VARCHAR(50) NOT NULL, " +
		LOGIN_COLUMN_USER_PASSWORD + " VARCHAR(50) NOT NULL" +
		");";

}
