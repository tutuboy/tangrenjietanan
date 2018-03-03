package test3;

public class Chapter3 {

	public static void main(String[] args) {
		//程序运算存在顺序结构，分支结构，循环结构。
		//分支结构，判断条件（关系运算符和逻辑运算符）>,<,>=,<=,==,!=.
		boolean first=3>2;//返回为true
		boolean scond=3<5;//返回为true
		boolean three=5==6;//返回为true
		boolean four=8!=8;//返回为false
		//逻辑运算符，&&，||，！
		boolean five=(6>2)&&(8>10);//返回为false
		boolean six=(6>2)||(8>10);//返回为true
		boolean seven=!(6>5);//返回为false
		boolean eight=!(five||six);//返回为false

	}

}
