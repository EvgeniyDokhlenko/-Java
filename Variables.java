public class Variables{
	int id=11;
	String name = " Сидоров Иван Вованович ";
	int age = 50;
	public static void main(String[] args){
		Variables variables = new Variables();
		variables.person();
	}
	void person(){
		System.out.println(id+name+age+" лет");
	}
}