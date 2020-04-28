package foo.bar;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;


public class FileSample {

	public static void main(String[] arg) throws IOException {

		Writer out = new CharArrayWriter();

		File file = new File("./src/foo/bar/ListSample.java");

		String str = file.getAbsolutePath();
		System.out.println(str);

		Charset charset = Charset.forName("UTF-8");
		InputStream is = new FileInputStream(file);
		Reader in = new InputStreamReader(is, charset);

		while(true){
		int c = in.read();
		if(c != -1){
		out.write(c);
		}
		else{
		break;
		}
		}
		in.close();

		String src = out.toString();

		System.out.println(src);

	}
}
