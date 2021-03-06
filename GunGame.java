package Practice;

import java.util.*;


/**
 * @Author -- TkGitcode
 */

public class GunGame {

	void printarray(int[][] arr) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	static Scanner scanner = new Scanner(System.in);

	int n = scanner.nextInt();
	Random random = new Random();
	int x = 0;
	int y = 0;
	int ply01 = 0;
	int ply11 = 0;
	int ply02 = 0;
	int ply12 = 0;
	int step = 0;
	int player = 0;
	int winner = 0;
int flag=0;
	GunGame() {
		// Gun
		x = random.nextInt(n);
		y = random.nextInt(n); // Start from 0 and End at n-1
	}

	void playerstarting() {

		// Player 1
		ply01 = random.nextInt(n);
		ply11 = random.nextInt(n);

		// Player 2
		ply02 = random.nextInt(n);
		ply12 = random.nextInt(n);
		// Condition if Gun and Player1 or player2 are Equal then Player 1 and Player 2
		// position will Change
		if ((x == ply01 && y == ply11) || (x == ply02 && y == ply12)) {
			System.out.println("Gun is in My Hand I am Going to Restart");
			playerstarting();
		}
		if (ply01 == ply02 && ply11 == ply12) {
			System.out.println("You Both are in Same Position So iam Re-Allocating a Position");
			playerstarting();
		}

		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (x == i && y == j)
					arr[i][j] = 5; // Gun

				if (ply01 == i && ply11 == j)
					arr[i][j] = 1; // Player 1

				if (ply02 == i && ply12 == j)
					arr[i][j] = 2; // Player 2
			}
		}
		// Starting Position of Gun,Player1 and Player2
		System.out.println("Starting Position of Player1 :" + ply01 + " " + ply11);
		System.out.println("Starting Position of Player2 :" + ply02 + " " + ply12);
		System.out.println("Starting Position of Gun     :" + x + " " + y);
		printarray(arr);
		// Generating a Random player to Start the Game
		player = random.nextInt(2) + 1;

		while (!(x == ply01 && y == ply11) || !(x == ply02 && y == ply12)) {
			if (player == 1) {
				System.out.println("Player 1");

			} else if (player == 2) {
				System.out.println("Player 2");
			}
			int step;
			System.out.println("1.Move Up");
			System.out.println("2.Move Down");
			System.out.println("3.Move Left Side");
			System.out.println("4.Move Right Side");
			int option = scanner.nextInt();
			// Player 1
			if (player == 1) {
				step = 4;
				switch (option) {
				case 1:
					System.out.println("Current Player1 Position :" + ply01 + " " + ply11);
					// Checking the Given Move is less than 3
					while (step > 3) {
						System.out.println("Enter Your Step to Move");
						step = scanner.nextInt();
					}
					arr[ply01][ply11] = 0;

					int i = ply01 - step; 

					// If Moving value is More (or) Out of Position then value will set in last
					// position of Moving Direction
					if (i < 0)
						i = 0;
					arr[i][ply11] = 1;
					ply01 = i;
					printarray(arr);
					break;
				case 2:
					System.out.println("Current Player1 Position :" + ply01 + " " + ply11);
					while (step > 3) {
						System.out.println("Enter Your Step to Move");
						step = scanner.nextInt();
					}
					arr[ply01][ply11] = 0;
					int i1 = ply01 + step;
					if (i1 > n)
						i1 = n - 1;
					arr[i1][ply11] = 1;
					ply01 = i1;
					printarray(arr);
					break;
				case 3:
					System.out.println("Current Player1 Position :" + ply01 + " " + ply11);
					while (step > 3) {
						System.out.println("Enter Your Step to Move");
						step = scanner.nextInt();
					}
					arr[ply01][ply11] = 0;
					int j = ply11 - step;
					if (j < 0)
						j = 0;
					arr[ply01][j] = 1;
					ply11 = j;
					printarray(arr);
					break;
				case 4:
					System.out.println("Current Player1 Position :" + ply01 + " " + ply11);
					while (step > 3) {
						System.out.println("Enter Your Step to Move");
						step = scanner.nextInt();
					}
					arr[ply01][ply11] = 0;
					int j1 = ply11 + step;
					if (j1 > n)
						j1 = n - 1;
					arr[ply01][j1] = 1;
					ply11 = j1;
					printarray(arr);
					break;
				}
				winner = 1;
				player = 2;
			}
			// Player 2
			else if (player == 2) {
				step = 4;
				switch (option) {
				case 1:
					System.out.println("Current Player2 Position :" + ply02 + " " + ply12);
					while (step > 3) {
						System.out.println("Enter Your Step to Move");
						step = scanner.nextInt();
					}
					arr[ply02][ply12] = 0;
					int i = ply02 - step;
					if (i < 0)
						i = 0;
					arr[i][ply12] = 2;
					ply02 = i;
					printarray(arr);
					break;
				case 2:
					System.out.println("Current Player2 Position :" + ply02 + " " + ply12);
					while (step > 3) {
						System.out.println("Enter Your Step to Move");
						step = scanner.nextInt();
					}
					arr[ply02][ply12] = 0;
					int i1 = ply02 + step;
					if (i1 > n)
						i1 = n - 1;
					arr[i1][ply12] = 2;
					ply02 = i1;
					printarray(arr);
					break;
				case 3:
					System.out.println("Current Player2 Position :" + ply02 + " " + ply12);
					while (step > 3) {
						System.out.println("Enter Your Step to Move");
						step = scanner.nextInt();
					}
					arr[ply02][ply12] = 0;
					int j = ply12 - step;
					if (j < 0)
						j = 0;
					arr[ply02][j] = 2;
					ply12 = j;
					printarray(arr);
					break;
				case 4:
					System.out.println("Current Player2 Position :" + ply02 + " " + ply12);
					while (step > 3) {
						System.out.println("Enter Your Step to Move");
						step = scanner.nextInt();
					}
					arr[ply02][ply12] = 0;
					int j1 = ply12 + step;
					if (j1 > n)
						j1 = n - 1;
					arr[ply02][j1] = 2;
					ply12 = j1;
					printarray(arr);
					break;
				}
				winner = 2;
				player = 1;
			}
			if ((x == ply01 && y == ply11) || (x == ply02 && y == ply12)) {
				flag=1;
				break;
			}

		}
		if(flag==1)
		{
		System.out.println(" -=-=-=-=-Player " + winner + " is a Winner-=-=-=-=-");
		return;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter The Value for Matrix like(6x6)");
		GunGame gunGame = new GunGame();
		gunGame.playerstarting();
		scanner.close();
	}

}
