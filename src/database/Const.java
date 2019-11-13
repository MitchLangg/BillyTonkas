package database;

public class Const {

/*--------------CREATING CONSTANTS FOR CHOCOLATE TABLE----------------*/
public static final String TABLE_CHOCOLATE = "chocolate";
public static final String CHOCOLATE_COLUMN_ID = "id";
public static final String CHOCOLATE_COLUMN_NAME = "name";

/*--------------CREATING CONSTANTS FOR CHOCOLATE STATS TABLE------------*/
public static final String TABLE_CHOCOLATE_STATS = "chocolate_stats";
public static final String CHOCOLATE_STATS_COLUMN_ID = "id";
public static final String CHOCOLATE_STATS_COLUMN_PRICE = "price";
public static final String CHOCOLATE_STATS_COLUMN_QUANTITY = "quantity";

/*---------------CREATING CONSTANTS FOR CANDY TABLE-----------------*/
public static final String TABLE_CANDY = "candy";
public static final String CANDY_COLUMN_ID = "id";
public static final String CANDY_COLUMN_NAME = "name";

/*---------------CREATING CONSTANTS FOR CANDY STATS TABLE-------------*/
public static final String TABLE_CANDY_STATS = "candy_stats";
public static final String CANDY_STATS_COLUMN_ID = "id";
public static final String CANDY_STATS_COLUMN_PRICE = "price";
public static final String CANDY_STATS_COLUMN_QUANTITY = "quantity";

/*---------------CREATING CONSTANTS FOR INVENTORY TABLE---------------*/
public static final String TABLE_INVENTORY = "inventory";
public static final String INVENTORY_COLUMN_ID = "id";
public static final String INVENTORY_COLUMN_NAME = "name";

/*---------------CREATING CONSTANTS FOR LOGIN TABLE-------------------*/
public static final String TABLE_LOGIN = "login";
public static final String LOGIN_COLUMN_ID = "id";
public static final String LOGIN_COLUMN_DB_NAME = "db_name";
public static final String LOGIN_COLUMN_USER_NAME = "user_name";
public static final String LOGIN_COLUMN_USER_PASSWORD = "user_password";

/*---------------CREATING CHOCOLATE TABLE----------------*/
public static final String CREATE_TABLE_CHOCOLATE = 
		"CREATE TABLE " + TABLE_CHOCOLATE + "(" +
		CHOCOLATE_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		CHOCOLATE_COLUMN_NAME + " VARCHAR(50) NOT NULL" +
		");";

/*---------------CREATING CHOCOLATE STATS TABLE----------------*/
public static final String CREATE_TABLE_CHOCOLATE_STATS = 
		"CREATE TABLE " + TABLE_CHOCOLATE_STATS + "(" +
		CHOCOLATE_STATS_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		CHOCOLATE_STATS_COLUMN_PRICE + " VARCHAR(50) NOT NULL, " +
		CHOCOLATE_STATS_COLUMN_QUANTITY + " VARCHAR(50) NOT NULL" +
				");";

/*----------------CREATING CANDY TABLE-------------------*/
public static final String CREATE_TABLE_CANDY = 
		"CREATE TABLE " + TABLE_CANDY + "(" +
		CANDY_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		CANDY_COLUMN_NAME + " VARCHAR(50) NOT NULL" +
				");";

/*-----------------CREATING CANDY STATS TABLE--------------*/
public static final String CREATE_TABLE_CANDY_STATS =
		"CREATE TABLE " + TABLE_CANDY_STATS + "(" +
		CANDY_STATS_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		CANDY_STATS_COLUMN_PRICE + " VARCHAR(50) NOT NULL, " +
		CANDY_STATS_COLUMN_QUANTITY + " VARCHAR(50) NOT NULL" +
				");";

/*-----------------CREATING INVENTORY TABLE-----------------*/
public static final String CREATE_TABLE_INVENTORY = 
		"CREATE TABLE " + TABLE_INVENTORY + "(" +
		INVENTORY_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		INVENTORY_COLUMN_NAME + " VARCHAR(50) NOT NULL" +
				");";

/*-----------------CREATING LOGIN TABLE---------------------*/
public static final String CREATE_TABLE_LOGIN = 
		"CREATE TABLE " + TABLE_LOGIN + "(" +
		LOGIN_COLUMN_ID + " int NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
		LOGIN_COLUMN_DB_NAME + " VARCHAR(50) NOT NULL, " +
		LOGIN_COLUMN_USER_NAME + " VARCHAR(50) NOT NULL, " +
		LOGIN_COLUMN_USER_PASSWORD + " VARCHAR(50) NOT NULL" +
		");";

}
