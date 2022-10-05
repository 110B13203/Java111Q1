class Data{
	private String name;
	private Test score;
	class Test{
		private int math;
		private int english;
		public Test(int eng,int m) {
			english=eng;
			math=m;
		}
		public double avg() {
			return (english+math)/2;
		}
	}
	public void show() {
		System.out.println("name:"+name+" english="+score.english+" math="+score.math+" avg="+score.avg());
	}
}
public class Class02 {

	public static void main(String[] args) {
		
	}

}
