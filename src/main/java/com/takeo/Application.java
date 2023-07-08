package com.takeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.takeo.entity.Book;
import com.takeo.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(Application.class, args);
		
		BookRepository daoImpl=ctx.getBean(BookRepository.class);
		
		Book book=new Book();
		
		book.setAuthor("Subin Bhattarai");
		book.setTitle("The Summer Love");
		book.setPubyear("2014");
		book.setIsbn(538981821);
		
		Book bk=daoImpl.save(book);
		
		//condition to insert
		if(bk != null)
			System.out.println(bk.getBid()+"\t"+bk.getAuthor()+"\t"+bk.getTitle()+"\t"+bk.getPubyear()+"\t"+bk.getIsbn());
		else
			System.out.println("Data Not Inserted!!");
	}

}
