package School;

public class Student {
	//����������Ա����
	//private:��ɼ��� ��ǰ����ֻ���ڱ����б�����
	//����Ա��������Ϊ˽�е� ������ķ�װ
	//�ⲿ����Ҫ���������Ա���� ����ͨ�����е�getter setter ����
	private String Name;
	//û�����η������ɼ��� ��ǰ����ֻ���ڱ����б�����
	private int  score;
	//���û�ж����κι��췽����java��������Զ�����һ���޲εĹ��췽��
	//������˴��εĹ��췽����java������������Զ�����һ���޲εĹ��췽��
	//����ʲô������������һ���޲εĹ��췽��
	//�����޲εĹ��췽��
	//���췽����һ�ֶ��صķ��������η�+���������������� ����������
	public Student(String Name, int score) {
		
		super();
		this.Name=Name;
		this.score=score;
	}

	public Student() {
		
		super();
	}
	public String getName() {
		return  Name;
	}
	public void setName(String Name) {
		
		this.Name=Name;
		
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		
		this.score=score;
	}

	
	
	}


