public class Main
{
    static int count =0;
    public void print() {
        if(count == 4){
            return ;
        }
        
        count ++;
        System.out.println(count);
        print();
        
    }
	public static void main(String[] args) {
		Main m = new Main();
		m.print();
		
	}
}
