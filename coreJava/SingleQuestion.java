package coreJava;

import java.util.Arrays;

public class SingleQuestion extends Question{
	private String answer;
	public SingleQuestion(int id, String title, String[] options,String answer) {
		super(id, title, options);
		this.answer=answer;
		
	}
	@Override
	public boolean check(String[] anwsers) {
		System.out.println("你选的答案是:"+Arrays.toString(anwsers));
		if(anwsers.length!=1)
			return false;
		return anwsers[0].equals(this.answer);
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}


}
