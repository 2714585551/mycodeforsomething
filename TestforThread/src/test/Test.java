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
			for(int i= 0 ; i<100000;i++){   // 当i《100 数字较小的时候  往往都是计算正确的
				test.counter();
			}
			
		}
	}
	
	
    public static void main(String[] args) {
    	Test test = new Test();
    	//启动两个线程
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
    	System.out.println(test.count);//200000   实际运行的时候  值不是200000 有很多情况 因此线程不安全
	}

}
