package IOutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.core.Pateint;

public interface ReadWrite {

	
	public static void storeToBinary( Map<Integer, Pateint> map ,String filename) throws FileNotFoundException, IOException {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
			
			out.writeObject(map);
			
		}
	}
		
		public static Map<Integer, Pateint> readFromBinary(String fname)throws FileNotFoundException,IOException{
			
			try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fname))){
			
			return (Map<Integer, Pateint>)in.readObject();
			
			}catch (Exception e) {
				System.out.println(e);
				return new HashMap<>();
			}
			
		}
		
	}
	
	
	

