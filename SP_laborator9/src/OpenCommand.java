
public class OpenCommand implements Command {

	public OpenCommand(String p) {
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		JSONBuilder jsonBuilder = new JSONBuilder("D:\\Facultate\\AN 3\\Sabloane-de-proiectare\\SP_laborator9\\book.json");
	    jsonBuilder.build();
	    Book book = new Book("book.json");
	    book.add(jsonBuilder.getResult());
	    
	    DocumentManager.getInstance().setBook(book);
	    book.print();
	}

}
