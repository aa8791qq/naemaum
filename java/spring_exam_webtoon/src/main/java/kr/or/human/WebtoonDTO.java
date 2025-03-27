package kr.or.human;

public class WebtoonDTO {

	String title;
	String writer;
	String comment;
	String imgadd;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getImgadd() {
		return imgadd;
	}
	public void setImgadd(String imgadd) {
		this.imgadd = imgadd;
	}
	
	@Override
	public String toString() {
		return "WebtoonDTO [title=" + title + ", writer=" + writer + ", comment=" + comment + ", imgadd=" + imgadd
				+ "]";
	}
	
	
}
