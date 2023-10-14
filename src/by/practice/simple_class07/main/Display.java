package by.practice.simple_class07.main;

public class Display {
	
	private Triangle tr = new Triangle();
	private Input in = new Input(tr);
	private Logic logic = new Logic();
	private Output out = new Output(logic);
	
	public Display() {
		in.inputDate();
		out.outputDate(tr);
	}
}
