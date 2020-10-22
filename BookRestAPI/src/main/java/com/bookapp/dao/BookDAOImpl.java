package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
@Service
public class BookDAOImpl implements BookDAO {

	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> newBookList=new ArrayList<>();
		for(Book book:showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public Book getById(int id) {
		for(Book book:showBookList()) {
			if(book.getBookId()==id)
				return book;
		}

		return null;
	}

	@Override
	public List<Book> getByCategory(String category) {
		List<Book> newBookList=new ArrayList<>();
		for(Book book:showBookList()) {
			if(book.getCategory().equals(category))
				newBookList.add(book);
		}
		return newBookList;
	}

	private List<Book> showBookList(){
		return Arrays.asList(
				new Book(11,"learn java","kathy","tech",900.0),
				new Book(12,"habits","steve","SelfHelp",1900.0),
				new Book(13,"learn java","kathy","tech",700.0),
				new Book(14,"learn java","kathy","tech",680.5));
	}
}
