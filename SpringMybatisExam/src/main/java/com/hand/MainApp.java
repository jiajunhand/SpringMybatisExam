package com.hand;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("Beans.xml");
		FilmJDBCTemplate filmJDBCTemplate =
				(FilmJDBCTemplate)context.getBean("filmJDBCTemplate");
		System.out.println("------Records Creation--------" );
		filmJDBCTemplate.create("Zara", "ahahh",1);
		filmJDBCTemplate.create("Nuha", "qweeee",1);
		filmJDBCTemplate.create("Ayan", "rrrrrr",1);
		System.out.println("------Listing Multiple Records--------" );
		List<Film> film = filmJDBCTemplate.listFilm();
		for (Film record : film) {
			System.out.print("Film_id : " + record.getFilm_id() );
			System.out.print(", Title : " + record.getTitle() );
			System.out.println(",Description : " + record.getDescription());
		}
		System.out.println("----Updating Record with ID = 2 -----" );
		filmJDBCTemplate.update(2, "ttttt");
		System.out.println("----Listing Record with ID = 2 -----" );
		Film film1 = filmJDBCTemplate.getStudent(2);
		System.out.print("Film_id : " + film1.getFilm_id() );
		System.out.print(", Title : " + film1.getTitle() );
		System.out.println(",Description : " + film1.getDescription());
	}
}