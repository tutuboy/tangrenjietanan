package test3;

public class Chapter3 {

	public static void main(String[] args) {
		//�����������˳��ṹ����֧�ṹ��ѭ���ṹ��
		//��֧�ṹ���ж���������ϵ��������߼��������>,<,>=,<=,==,!=.
		boolean first=3>2;//����Ϊtrue
		boolean scond=3<5;//����Ϊtrue
		boolean three=5==6;//����Ϊtrue
		boolean four=8!=8;//����Ϊfalse
		//�߼��������&&��||����
		boolean five=(6>2)&&(8>10);//����Ϊfalse
		boolean six=(6>2)||(8>10);//����Ϊtrue
		boolean seven=!(6>5);//����Ϊfalse
		boolean eight=!(five||six);//����Ϊfalse

	}

}
