package us.paulbrown;

import java.util.*;

public class PTTNode {
	
	public int id;
	public String question;
	public ArrayList<PTTAnswer> answers;
	public ArrayList<String> footnotes;
	
	
	
	
	
	
	
	public PTTNode(int id, String question, ArrayList<PTTAnswer> answers,
			ArrayList<String> footnotes) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
		this.footnotes = footnotes;
	}
	
	
	
	
	//Autogenerated Getters and Setters.  might not need some (or all) of setters.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public ArrayList<PTTAnswer> getAnswers() {
		return answers;
	}
	public void setAnswers(ArrayList<PTTAnswer> answers) {
		this.answers = answers;
	}
	public ArrayList<String> getFootnotes() {
		return footnotes;
	}
	public void setFootnotes(ArrayList<String> footnotes) {
		this.footnotes = footnotes;
	}

}