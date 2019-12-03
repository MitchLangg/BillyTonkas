package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import daos.LoginDAO;
import database.Const;
import database.Database;
import javabeans.Login;

public class LoginTable implements LoginDAO {
	Database db = Database.getInstance();
	ArrayList<Login> login;
	@Override
	public ArrayList<Login> getAllLogin() {
		String query = "SELECT * FROM " + Const.TABLE_LOGIN;
		login = new ArrayList<>();
		try {
			Statement getLogin = db.getConnection().createStatement();
			ResultSet data = getLogin.executeQuery(query);
			while (data.next()) {
				login.add(new Login(data.getInt(Const.LOGIN_COLUMN_ID),
						data.getInt(Const.LOGIN_COLUMN_DB_NAME),
						data.getInt(Const.LOGIN_COLUMN_USER_NAME),
						data.getInt(Const.LOGIN_COLUMN_USER_PASSWORD)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return login;
	}
	@Override
	public Login getLogin(int loginID) {
		String query = "SELECT * FROM " + Const.TABLE_LOGIN + " WHERE " + Const.LOGIN_COLUMN_ID + " = "
				+ loginID;
		try {
			Statement getLogin = db.getConnection().createStatement();
			ResultSet data = getLogin.executeQuery(query);
			if (data.next()) {
				Login login = new Login(data.getInt(Const.LOGIN_COLUMN_ID),
						data.getInt(Const.LOGIN_COLUMN_DB_NAME),
						data.getInt(Const.LOGIN_COLUMN_USER_NAME),
						data.getInt(Const.LOGIN_COLUMN_USER_PASSWORD));
				return login;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}