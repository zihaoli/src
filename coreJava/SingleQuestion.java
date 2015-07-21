package coreJava;

public class SingleQuestion extends Question{
	private String answer;
	public SingleQuestion(int id, String title, String[] options,String answer) {
		super(id, title, options);
		this.answer=answer;
		
	}
	@Override
	public boolean check(String anwser) {
		if (anwser.equals(this.answer)) {
			return true;
		}
		return false;
	}

}
