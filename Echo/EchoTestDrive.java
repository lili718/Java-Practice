class Echo{
	int count=0;
	void hello(){
		System.out.println("helloooo...");
	}
}
public class EchoTestDrive{
	public static void main(String[] args){
		Echo e1= new Echo();
		Echo e2=e1;
		int x=1;
		while(x<4){
			e1.hello();
			e1.count= e1.count + 1;
			
			if(x==4){
				e2.count= e2.count + 1;
			}
			if(x>1){
				e2.count= e2.count + e1.count;
			}
			x=x+1;
		}
		System.out.println(e2.count);
	}
}
//prints out 24 instead of 10 but why?
//got it down to 10 with a few changes