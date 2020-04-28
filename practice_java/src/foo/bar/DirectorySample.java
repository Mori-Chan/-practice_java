package foo.bar;

import java.io.File;

public class DirectorySample {

	public static void main(String[] arg) {

		File dir = new File("D:\\pleiades\\workspace\\practice_java\\src\\foo\\bar");
		File[] files = dir.listFiles();

		for(File file: files){
			if(file.isDirectory()){
				System.out.println("[d]: " + file.getName());
			}
			if(file.isFile()){
				System.out.println("[f]: " + file.getName());
			}
	        File file1 = new File(file.getName());

	        //ファイルパスを取得する
	        String str = file1.getAbsolutePath();

	        System.out.println("pass : " + str);
		}


	}

}
