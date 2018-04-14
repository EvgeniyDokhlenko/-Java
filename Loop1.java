public class Loop1{
	
	public static void main(String args[]){
		int x=2, y=5,z=20,q=25;
		//Задали значения переменных
		System.out.println("Задано x=2, y=5;");
		if(x==1) System.out.println("Циклы и условия");
		else System.out.println("Не выполнено условие x==1");
		if (x<y){
			System.out.println("Выполнено условие x<y");
		}
		while(y<z){
		System.out.println(z+"  z - болше 5");
		z=z-1;	
		}
		do{
			x=x+1;
			System.out.println(x+"   пока x меньше q, q=25");
			
		}while(x<q);
		for(int count = 10; count > 0; count--){
			System.out.println(count + "  count - болше 0");
					for(int count1 = 0; count1 < 10; count1++){
					System.out.println(count1 + "     count - меньше 10");
						if(count1<5) 
							System.out.println(count1 + "  count1 меньше 5");
						else System.out.println(count1 + "  count1 больше 5");
						
					}
		}		
	}
}

