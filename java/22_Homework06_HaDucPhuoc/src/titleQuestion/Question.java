package titleQuestion;

import java.util.Scanner;

public class Question {

	private String titleQuestion;
	String [] answerList = new String[4];
	private String correct;
	public String getTitleQuestion() {
		return titleQuestion;
	}
	public void setTitleQuestion(String title) {
		this.titleQuestion = title;
	}
	public String[] getAnswerList() {
		return answerList;
	}
	public void setAnswerList(String[] ans) {
		this.answerList = ans;
	}
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String cor) {
		this.correct = cor;
	}
	public Question() {
	}
	public Question(String ti, String co) {
		this.setTitleQuestion(ti);
		this.setCorrect(co);
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter title question: ");
		this.titleQuestion = kb.nextLine();
		for(int i = 0; i < 4; i++)
		{
			if(i == 0)
				System.out.println("Enter A: ");
			else if(i == 1)
				System.out.println("Enter B: ");
			else if(i == 2)
				System.out.println("Enter C: ");
			else
				System.out.println("Enter D: ");
			this.answerList[i] = kb.nextLine();
		}
		System.out.println("Enter correct: ");
		this.correct = kb.next();
	}
	public void output()
	{
		System.out.println("- Title question: " + titleQuestion);
		for(int i = 0; i < 4; i++)
		{
			if(i == 0)
				System.out.println("A: ");
			else if(i == 1)
				System.out.println("B: ");
			else if(i == 2)
				System.out.println("C: ");
			else
				System.out.println("D: ");
			System.out.println(this.answerList[i]);
		}
	}
	public void isCorrect()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter answer: ");
		String c = kb.next();
		if(this.correct.equals(c) == false)
		{
			System.out.println("Answer false.");
			String a = kb.next();
			c = a;
		}
		else
			System.out.println("Answer true");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question q1 = new Question();
		q1.input();
		q1.output();
		q1.isCorrect();
	}

}
