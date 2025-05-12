package com.example.QuizAppDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="questions")
public class Quiz {

	@Id
	private int id;
	private String category;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String rightans;
	private String difficultylevel;
	private String questiontitle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getRightans() {
		return rightans;
	}
	public void setRightans(String rightans) {
		this.rightans = rightans;
	}
	public String getDifficultylevel() {
		return difficultylevel;
	}
	public void setDifficultylevel(String difficultylevel) {
		this.difficultylevel = difficultylevel;
	}
	public String getQuestiontitle() {
		return questiontitle;
	}
	public void setQuestiontitle(String questiontitle) {
		this.questiontitle = questiontitle;
	}
	public Quiz(int id, String category, String option1, String option2, String option3, String option4,
			String rightans, String difficultylevel, String questiontitle) {
		super();
		this.id = id;
		this.category = category;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.rightans = rightans;
		this.difficultylevel = difficultylevel;
		this.questiontitle = questiontitle;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", category=" + category + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", rightans=" + rightans + ", difficultylevel="
				+ difficultylevel + ", questiontitle=" + questiontitle + "]";
	}
	
	
}
