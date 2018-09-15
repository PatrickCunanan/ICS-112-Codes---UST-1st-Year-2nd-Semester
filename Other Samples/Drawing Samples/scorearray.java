import java.util.*;
public class scorearray{
	public static void main(String[]args){
		Scanner S = new Scanner(System.in);
		int i,j;
		int numS = 0;
		System.out.println("How many sets?: ");
		numS=S.nextInt();
		S.nextLine();
        String chars[]=new String[numS];
		int [][]scorearray = new int[numS][11];
		for(i=0;i<numS;i++){
			System.out.printf("Set %d of the grades.\n",i+1);
			System.out.print("Input student's surname: ");
			chars[i]=S.nextLine();
			System.out.print("Input PRELIM CA (OVER 100):");
			int pca=S.nextInt();
			scorearray[i][0]=(int)(pca*.2);
			System.out.print("Input PRELIM PT (OVER 100):");
			int ppt=S.nextInt();
			scorearray[i][1]=(int)(ppt*.2);
			System.out.print("Input PRELIM Q (OVER 100):");
			int pq=S.nextInt();
			scorearray[i][2]=(int)(pq*.3);
			System.out.print("Input PRELIM ME (OVER 100):");
			int pme=S.nextInt();
			scorearray[i][3]=(int)(pme*.3);
			int ptotal=scorearray[i][0]+scorearray[i][1]+scorearray[i][2]+scorearray[i][3];
			scorearray[i][4]=ptotal;
			System.out.print("Input FINAL CA (OVER 100):");
			int fca=S.nextInt();
			scorearray[i][5]=(int)(fca*.2);
			System.out.print("Input FINAL PT (OVER 100):");
			int fpt=S.nextInt();
			scorearray[i][6]=(int)(fpt*.2);
			System.out.print("Input FINAL Q (OVER 100):");
			int fq=S.nextInt();
			scorearray[i][7]=(int)(fq*.3);
			System.out.print("Input FINAL ME (OVER 100):");
			int fme=S.nextInt();
			S.nextLine();
			scorearray[i][8]=(int)(fme*.3);
			int ftotal=scorearray[i][5]+scorearray[i][6]+scorearray[i][7]+scorearray[i][8];
			scorearray[i][9]=ftotal;
			int sg=(ptotal+ftotal)/2;
			scorearray[i][10]=sg;

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("Surname      PCA   PPT    PQ   PME    PT   FCA   FPT    FQ   FME    FT    SG R\n");
		for(i=0;i<numS;i++){
			System.out.printf("%-10s ",chars[i]);
			for(j=0;j<11;j++){
				System.out.printf("%5d ",scorearray[i][j]);
			}
			j--;
			if (scorearray[i][j]<50){
				System.out.print("F");
			}
			else if (scorearray[i][j]>=50&&scorearray[i][j]<60){
				System.out.print("E");
			}
			else if (scorearray[i][j]>=60&&scorearray[i][j]<70){
				System.out.print("D");
			}
			else if (scorearray[i][j]>=70&&scorearray[i][j]<80){
				System.out.print("C");
			}
			else if (scorearray[i][j]>=80&&scorearray[i][j]<90){
				System.out.print("B");
			}
			else if (scorearray[i][j]>=90&&scorearray[i][j]<=100){
				System.out.print("A");
			}
			System.out.println();
		}
	}
}