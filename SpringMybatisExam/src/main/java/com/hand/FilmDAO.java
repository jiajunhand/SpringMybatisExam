package com.hand;
import java.util.List;
import javax.sql.DataSource;
public interface FilmDAO {
	/**
	 * This is the method to be used to initialize
	 * database resources ie. connection.
	 */
	public void setDataSource(DataSource ds);
	/**
	 * This is the method to be used to create
	 * a record in the Student table.
	 */
	public void create(String title, String description,Integer language_id);
	/**
	 * This is the method to be used to list down
	 * a record from the Student table corresponding
	 * to a passed student id.
	 */
	public Film getFilm(Integer film_id);
	/**
	 * This is the method to be used to list down
	 * all the records from the Student table.
	 */
	public List<Film> listStudents();
	/**
	 * This is the method to be used to delete
	 * a record from the Student table corresponding
	 * to a passed student id.
	 */
	public void delete(Integer film_id);
	/**
	 * This is the method to be used to update
	 * a record into the Student table.
	 */
	public void update(Integer film_id, String title,Integer language_id);
}