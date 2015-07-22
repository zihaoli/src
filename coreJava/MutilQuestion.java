package coreJava;

import java.util.Arrays;

public class MutilQuestion extends Question{
	private String[] answers;
	public MutilQuestion(int id, String title, String[] options,String[] answers) {
		super(id, title, options);
		this.answers =answers;
	}

	@Override
	public boolean check(String[] answers) {
		Arrays.sort(answers);
		System.out.println("你选的答案是:"+Arrays.toString(answers));
		return  Arrays.equals(this.answers, answers);
	}

	public String[] getAnswers() {
		return answers;
	}

	public void setAnswers(String[] answers) {
		this.answers = answers;
	}

}
