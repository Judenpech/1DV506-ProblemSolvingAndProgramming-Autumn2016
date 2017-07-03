package jl223vy_assign4;

import java.io.*;
import java.util.*;

public class Histogram {
	public static void main(String[] args){	
		String path="C:\\Temp\\";
		String fileName="integers.dat";
		File f=new File(path+fileName);
		
		if(!f.exists() && !f.isFile()){
			try{  //create file
				createDirectory(path);
			    createFile(fileName);
				Scanner sc=new Scanner(System.in);
			    System.out.print("How many integers do you want in the file? ");
			    int n=sc.nextInt();
			    PrintWriter pw=new PrintWriter(f);
			    createText(pw,n);
			    pw.close();
			    sc.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		try{  //read file
			Scanner scan=new Scanner(f);
			ArrayList<String> fList=new ArrayList<>();
			while(scan.hasNextLine()){
				fList.add(scan.nextLine());
			}
			String[] fArr=new String[fList.size()];
			for(int i=0; i<fList.size(); i++){
				fArr[i]=fList.get(i);
			}
			System.out.println("\nReading integers from file: "+f.getAbsolutePath());
			System.out.println("Number of integers in the interval [1,100]: "+integersInTheInterval(fArr));
			System.out.println("Others: "+(fList.size()-integersInTheInterval(fArr)));	
			printHistogram(fArr);
		    
			scan.close();
			//deleteFile(path+fileName);  //to delete test file if you want
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void createDirectory(String path) throws IOException{   
	    File file = new File(path);  
	    if(!file.exists()){  
	        file.mkdirs();  
	    }  
	}  
	public static void createFile(String fileName) throws IOException{  
	    File file = new File(fileName);  
	    if(!file.exists()){  
	        try {  
	            file.createNewFile();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	}  
	public static void deleteFile(String filePath) throws IOException{  
	    File file = new File(filePath);  	      
	    if(!file.exists()){
	    	return;
	    }
	    if(file.isFile()){  
	        file.delete();  
	    }
	    else if(file.isDirectory()){  
	        File[] files = file.listFiles();  
	        for(int i=0;i<files.length;i++){  
	            deleteFile(filePath + "\\" + files[i]);  
	        }  	          
	        file.delete();  
	    }  
	}  

	public static PrintWriter createText(PrintWriter pw, int tn){
		Random rd=new Random();
		for(int i=0; i<tn; i++){
			int x=rd.nextInt(200)+1;
			pw.println(x);
		}
		return pw;
	}
	
	public static int integersInTheInterval(String[] arr){
		int nIn=0;
		int t;
		for(int i=0; i<arr.length; i++){
			t=Integer.parseInt(arr[i]);
			if(t>=1 && t<=100){
				nIn++;
			}
		}
		return nIn;
	}
	
	public static void printHistogram(String[] arr){
		int[] fileArr=new int[10];
		for(int i=0; i<arr.length; i++){
			int t=Integer.parseInt(arr[i]);
			if(t>0 && t<=100){
				if(t<=10)
					fileArr[0]++;
				else if(t<=20)
					fileArr[1]++;
				else if(t<=30)
					fileArr[2]++;
				else if(t<=40)
					fileArr[3]++;
				else if(t<=50)
					fileArr[4]++;
				else if(t<=60)
					fileArr[5]++;
				else if(t<=70)
					fileArr[6]++;
				else if(t<=80)
					fileArr[7]++;
				else if(t<=90)
					fileArr[8]++;
				else
					fileArr[9]++;												
			}
		}
		System.out.println("Histogram");
		System.out.println("  1  - 10  | "+printStar(fileArr[0]));
		System.out.println("  11 - 20  | "+printStar(fileArr[1]));
		System.out.println("  21 - 30  | "+printStar(fileArr[2]));
		System.out.println("  31 - 40  | "+printStar(fileArr[3]));
		System.out.println("  41 - 50  | "+printStar(fileArr[4]));
		System.out.println("  51 - 60  | "+printStar(fileArr[5]));
		System.out.println("  61 - 70  | "+printStar(fileArr[6]));
		System.out.println("  71 - 80  | "+printStar(fileArr[7]));
		System.out.println("  81 - 90  | "+printStar(fileArr[8]));
		System.out.println("  91 - 100 | "+printStar(fileArr[9]));
	}
	public static String printStar(int amount){
		String star="";
		while(amount!=0){
			star=star+"*";
			amount--;
		}
		return star;
	}
}
