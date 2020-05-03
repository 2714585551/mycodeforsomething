package test;

public class Test {
	
	private long count = 0;
	
	public void counter(){
		count++;
	}
	
	private static class Count extends Thread{
		private Test test; 
		
		public Count(Test test){
			this.test = test;
		}
		
		@Override
		public void run(){
			for(int i= 0 ; i<100000;i++){   // ��i��100 ���ֽ�С��ʱ��  �������Ǽ�����ȷ��
				test.counter();
			}
			
		}
	}
	
	
    public static void main(String[] args) {
    	Test test = new Test();
    	//���������߳�
    	Count count1  = new Count(test);
    	Count count2  = new Count(test);
    	count1.start();
    	count2.start();
    	try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(test.count);//200000   ʵ�����е�ʱ��  ֵ����200000 �кܶ���� ����̲߳���ȫ
	}

}
