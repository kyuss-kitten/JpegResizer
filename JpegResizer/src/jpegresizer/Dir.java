package jpegresizer;

import java.io.File;

public class Dir  {
	static String filename[];
	public	static int lengthOfList;
	
	public static int lengthOfList(String path) 
	{
		File dir = new File(path);
		File[] jpglist = dir.listFiles(new Filter("jepg,jpg"));
		 lengthOfList = jpglist.length;
		 return lengthOfList;
		
	}
		public static String[] getDir(String path) {
		
		File dir = new File(path);
		// lengthOfList = jpglist.length;
		File[] jpglist = dir.listFiles(new Filter("jpg"));
		lengthOfList = jpglist.length;
		 String[] filename = new String[lengthOfList];
		for(int i = 0; i < jpglist.length;){
			filename[i] =jpglist[i].getName();
			 i++;
			}
		return filename;
			
	}
		public static void print (String[] filename){
			//int j = filename.length;
		for (int i = 0; i < filename.length; i++){
			System.out.println(filename[i]);
		}
			
		}
/*	public static void print(String path){
		File dir = new File(path);
		// lengthOfList = jpglist.length;
		File[] jpglist = dir.listFiles(new Filter("jpeg,jpg"));
		lengthOfList = jpglist.length;
		 String[] filename = new String[lengthOfList];
		for(int i = 0; i < lengthOfList; i++){
			System.out.println( filename[i]);
			}
	}*/
	public static String getinputImagePath (String path,int i, String[] filename) {
		String inputImagePath =path + filename[i];
		return inputImagePath;
	}
	public static String getoutputImagePath (String inputImagePath) {
		String outputImagePath =inputImagePath + "(resized)";
		return outputImagePath;
	}
}
