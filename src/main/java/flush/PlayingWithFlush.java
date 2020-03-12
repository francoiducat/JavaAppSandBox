package flush;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created on 03/12/2020.
 */
public class PlayingWithFlush {

  public static void main(String[] args) {
    try {
      OutputStream os = new FileOutputStream("test.txt");
      InputStream is = new FileInputStream("test.txt");
      os.write('A');

      os.write('B');
      System.out.println("" + (char) is.read());
      System.out.println("" + (char) is.read());
      System.out.println("" + (char) is.read());

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
