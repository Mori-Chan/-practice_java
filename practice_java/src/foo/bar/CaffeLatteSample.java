package foo.bar;

public class CaffeLatteSample {

	public static void main(String[] arg) {
		int sum = 0;
		for(int i = 0; i < 49 ; i++) {
			sum++;
			if(sum%5==0 && sum%3==0) {
				System.out.println("CAFFELATTE");
			}else if(sum%3==0) {
				System.out.println("CAFFE");
			}else if(sum%5==0) {
				System.out.println("LATTE");
			}else {
				System.out.println(sum);
			}
		}
		for(int i=1;i<50;i++){
			System.out.println((i%3<1?"CAFFE":"")+(i%5<1?"LATTE":i%3<1?"":i));
		}

	}

}