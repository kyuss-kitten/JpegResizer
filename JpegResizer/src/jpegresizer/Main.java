package jpegresizer;
import java.util.Scanner;

import javax.imageio.ImageIO;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.io.FileFilter;
import jpegresizer.Dir;
import jpegresizer.Filter;

public class Main 
{
	
	
	
	

		
	


	private static Scanner in;

	public static void main(String[] args)
	{
		
		
		String path = (args.length == 0) ? "." : args[0];
		System.out.println("��� ��������� ��������������� �������� ������� �������������.");
		if (path == ".")
		{
			System.out.println("������� ������� ����������.");
			System.out.println("������� ���� � ����������: ");
			in = new Scanner(System.in);
			path = in.nextLine();
			System.out.println(path);
			String[] filename = Dir.getDir(path);
			Dir.print(filename);
			int choice;
			System.out.println("�������� ��������:");
			System.out.println("0 �����");
			System.out.println("1 �������� ������� �����������");
			
			choice = in.nextInt();
			switch(choice) 
				{
				case 0: break;
				case 1:
					System.out.println("������� ����������� ����������� ��������:");
					int coef = in.nextInt();
					double percent =coef / 100;
					
				try {
					
					//int c = 0;
					int lengthOfList = Dir.lengthOfList(path);
					for(int i = 0; i < lengthOfList; i++){
					Dir.getDir(path);
				
					String inputImagePath = Dir.getinputImagePath(path,i, filename);
					String outputImagePath =Dir.getoutputImagePath(inputImagePath);
					System.out.println("resizing"+inputImagePath );
					System.out.println(new File(inputImagePath).exists());
					ImageResizer.resize(inputImagePath,outputImagePath,percent);
					//c++;
					}
				} catch (IOException ex) {
					 System.out.println("Error resizing the image.");
					ex.printStackTrace();
				}
					
					
				break;
				default:
				break;
				}
		}
		

	}



}
