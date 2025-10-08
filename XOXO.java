import java.util.Scanner;
public class XOXO {

	 static char a[][]=new char[3][3];

	public static void main(String[] args) {

		  Scanner s=new Scanner(System.in);

		  for(int i=0;i<a.length;i++) {

				for(int j=0;j<a[0].length;j++) {

					a[i][j]=' ';

				}

				System.out.println();

			}

		  char ch='X';

		while(!gameOver()) {

			for(int i=0;i<a.length;i++) {

				for(int j=0;j<a[0].length;j++) {

					System.out.print(a[i][j]+"|");

				}

				System.out.println();

			}
            if(a[0][0]!=' ' && a[0][1]!=' '&& a[0][2]!=' '&& a[1][0]!=' '&& a[1][1]!=' '&& a[1][2]!=' '&& a[2][0]!=' '&& a[2][1]!=' '&& a[2][2]!=' '){

                System.out.println("Match has drawn");
                System.exit(0);
    
            }

			if(ch=='X') {

				ch='O';

			}

			else {

				ch='X';

			}

			System.out.println("Enter the cordinates of "+ch);

			int x=s.nextInt();

			int y=s.nextInt();
            if(x<3 && y<3){
            if(a[x][y]==' '){
                a[x][y]=ch;
            }
            else{
                System.out.println("vundhi ra anla already kanlu kanipisthale");
                if(ch=='X'){
                    ch='O';
                }
                else{
                    ch='X';
                }
            }
        }
        else{
            System.out.println("bro bayta petta radhu bro(enter a valid number)");
            if(ch=='X'){
                ch='O';
            }
            else{
                ch='X';
            }
        }
		}

		for(int i=0;i<a.length;i++) {

			for(int j=0;j<a[0].length;j++) {

				System.out.print(a[i][j]+"|");

			}

			System.out.println();

		}

		if(gameOver()) {

		System.out.println(ch+" won the game");

		}
	}

	public static  boolean gameOver() {

		if(a[0][0]==a[1][1]&&a[0][0]==a[2][2]&& a[0][0]!=' '&& a[1][1]!=' '&&  a[2][2]!=' '|| a[0][2]==a[1][1]&& a[1][1]==a[2][0] && a[0][2]!=' ' && a[1][1]!=' '&&a[2][0]!=' ' )return true;

		if(a[0][0]==a[0][1] && a[0][1]==a[0][2] && a[0][0]!=' ' &&a[0][1]!=' '&&a[0][2]!=' '  ||a[1][0]==a[1][1] && a[1][1]==a[1][2]&&a[1][0]!=' ' && a[1][1]!=' ' && a[1][2]!=' '  ||a[2][0]==a[2][1] && a[2][1]==a[2][2] && a[2][0]!=' '&&a[2][1]!=' '&&a[2][2]!=' ')return true;

		if(a[0][0]==a[1][0] && a[1][0]==a[2][0] && a[0][0]!=' ' && a[1][0]!=' '&& a[2][0]!=' ' ||a[0][1]==a[1][1] && a[1][1]==a[2][1] && a[0][1]!=' '&&a[1][1]!=' '&& a[2][1]!=' ' || a[0][2]==a[1][2] && a[1][2]==a[2][2]&&a[0][2]!=' '&&a[1][2]!=' '&&a[2][2]!=' ')return true;
        
		return false;

	}

}

