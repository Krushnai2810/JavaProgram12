package gc2;


class Data{
	int x;
	protected void finalize()throws Throwable{
		System.out.println("Inside finalize");
	}
}
public class TestGarbageCollection {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1=null;
		System.gc();
		

	}

}
