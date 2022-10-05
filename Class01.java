class test{
	private double pi=3.14159;
	int radius;
	int length;
	int width;
	int height;
	public void Cal_area(int r) {
		radius=r;
		System.out.println((double)Math.round(((4*pi*(r*r*r))/3)*10)/10);
	}
	public void Cal_area(int l,int w,int h) {
		length=l;
		width=w;
		height=h;
		System.out.println((length*width+length*height+height*width)*2);
	}
}
public class Class01 {

	public static void main(String[] args) {
		test t=new test();
		t.Cal_area(10);
		t.Cal_area(4,5,6);
	}

}
