package nate.badge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by roondog on 7/28/16.
 */
public class Reader {
	public Reader(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
	}
}
