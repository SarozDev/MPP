package Lab9.prob1.business;

import java.util.*;
import java.util.stream.*;
import Lab9.prob1.dataaccess.DataAccess;
import Lab9.prob1.dataaccess.DataAccessFacade;
import Lab9.prob1.business.Book;
import Lab9.prob1.business.LibraryMember;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);

		List<String> membersId = mems.stream()
				.filter(s-> s.getAddress().getZip().contains("3"))
				.map(mem->mem.getMemberId())
				.collect(Collectors.toList());
		//implement
		
		return membersId;
		
	}
	//Returns a list of all isbns of books having at least two copies
	public static List<String> allHavingAtLeastTwoCopies() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement

		List<String> copies = bs.stream()
				.filter(s->s.getCopies().length >= 2)
				.map(copy->copy.getIsbn())
				.collect(Collectors.toList());
		
		return copies;
		
	}

	//Returns a list of all isbns of Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement

		List<String> authors = bs.stream()
				.filter(s->s.getAuthors().size() > 1)
				.map(aut->aut.getIsbn())
				.collect(Collectors.toList());
		
		return authors;
		
		}

}
