public class Loop1{
	
	public static void main(String args[]){
		int x=2, y=5,z=20,q=25;
		//������ �������� ����������
		System.out.println("������ x=2, y=5;");
		if(x==1) System.out.println("����� � �������");
		else System.out.println("�� ��������� ������� x==1");
		if (x<y){
			System.out.println("��������� ������� x<y");
		}
		while(y<z){
		System.out.println(z+"  z - ����� 5");
		z=z-1;	
		}
		do{
			x=x+1;
			System.out.println(x+"   ���� x ������ q, q=25");
			
		}while(x<q);
		for(int count = 10; count > 0; count--){
			System.out.println(count + "  count - ����� 0");
					for(int count1 = 0; count1 < 10; count1++){
					System.out.println(count1 + "     count - ������ 10");
					}
		}		
	}
}

