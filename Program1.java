import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		char Alpha =(char)br1.read();
		BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));
		int num =Integer.parseInt(br2.readLine());

		for(int i= 1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(Alpha);
				Alpha--;
				System.out.print(j+" ");
			}
			
			
			System.out.println();
		}
	}

}
