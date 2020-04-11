package sbia.readinglist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sbia.readinglist.io.Book;
import sbia.readinglist.io.ReadingListRepository;

@Controller
@RequestMapping("/readingList")
public class ReadingListController {
	private static final String reader = "craig";

	@Autowired
	ReadingListRepository readingListRepository;
	
	@GetMapping
	public String readersBooks(Model model) {
		
		List<Book> readingList = readingListRepository.findByReader(reader);
		if (readingList != null) {
			model.addAttribute("books", readingList);
		}
		return "readingList";
	}
	
	@PostMapping
	public String addToReadingList(Book book) {
		book.setReader(reader);
		readingListRepository.save(book);
		return "redirect:/readingList";
	}
	
}
