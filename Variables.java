public class Variables{
	int id=11;
	String name = " Сидоров Иван Вованович ";
	int age = 50;
	int i = 10;
	int j = 15;
	int k = i + j;
	int x = k * 3;
	int y = x % 6;
	double z = 0.1;
	double w = 0.2;
	double r = z*w;
	char c = 'A';
	char a = 'B';

	public static void main(String[] args){
		Variables variables = new Variables();
		variables.person();
		variables.compilation();
	}
	void person(){
		System.out.println(id+name+age+" лет");
	}
	void compilation(){
		System.out.println("Результаты арифметических операций с типом int "+k+x+y);
		System.out.println("Результаты арифметических операций с типом double r ="+r);
		System.out.print("Результат сложения типов char  ");
		System.out.println (c - a);
	}
}