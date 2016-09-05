package com.hand;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class FilmJDBCTemplate implements FilmDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void create(String title, String description,Integer language_id) {
		String SQL = "insert into film (title, description,language_id) values (?,?,?)";
		jdbcTemplateObject.update( SQL, title,description,language_id);
		System.out.println("Created Record Title = " + title + "Description = " + description);
		return;
	}
	public Film getStudent(Integer film_id){
		String SQL = "select * from film where film_id = ?";
		Film student = jdbcTemplateObject.queryForObject(SQL,

				new Object[]{film_id}, new FilmMapper());
		return student;
	}
	public List<Film> listFilm() {
		String SQL = "select * from film";
		List <Film> film = jdbcTemplateObject.query(SQL,
				new FilmMapper());
		return film;
	}
	public void delete(Integer film_id){
		String SQL = "delete from film where film_id = ?";
		jdbcTemplateObject.update(SQL, film_id);
		System.out.println("Deleted Record with ID = " + film_id );
		return;
	}
	public void update(Integer film_id, String description,Integer language_id){
		String SQL = "update film set description = ? where film_id = ? and language_id=?";
		jdbcTemplateObject.update(SQL, description, film_id,language_id);
		System.out.println("Updated Record with ID = " + film_id );
		return;
	}
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		
	}
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		
	}
	public Film getFilm(Integer film_id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void create(String title, String description) {
		// TODO Auto-generated method stub
		
	}
	public List<Film> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	public void update(Integer film_id, String title) {
		// TODO Auto-generated method stub
		
	}
}
