package oo.stati;

public class Student {
int english;
int math;
int chinese;
static int pass=60;
public Student(){
}
static{
	System.out.println("static");
	System.out.println("pass");
}
public Student (int english,int math,int chinese){
	super();
	this.english=english;
			this.math=math;
			this.chinese=chinese;
}
public void print(){
	System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t");
	
}


protected String getScore(int score){
	//自己跟繼承
	if (score<pass){
		return String.valueOf(score)+"*";
	}else{
		return String.valueOf(score);
	}
}

//PRIVATE 自己
@Override
public String toString(){
	return
			"eng:"+english+"\n"+
			"chinese:"+chinese+"\n"+
			"math:"+math;

}
}