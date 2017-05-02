package oo.stati;

public class GraduateStudent extends Student {
int thesis;
public GraduateStudent(int english,int math,int chinese){
	this.english=english;
	this.chinese=chinese;
	this.math=math;
}
@Override
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t"+thesis);
		
	}

}
