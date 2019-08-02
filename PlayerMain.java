package ui;

import service.PlayerServiceImp1;
import java.util.Scanner;
import bean.Player;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PlayerMain {
	static PlayerServiceImp1 service = new PlayerServiceImp1();
	public static void  showMenu() {
		System.out.println("01. Add an player");
		System.out.println("02. Retrieve players");
		System.out.println("03. Update an player");
		System.out.println("04. Delete an player");
		System.out.println("05. Exit");
		System.out.print("Enter Your Choice : ");
	}
	public static void  main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		while (true) {
			showMenu();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Player details:");
				System.out.println("Enter player name");
				String pname = scanner.next();
				scanner.nextLine();
				System.out.println("Enter country name");
				String c = scanner.nextLine();
				System.out.println("Enter specialized in");
				String spa = scanner.nextLine();
				Player p = new Player();
				p.setPlayerName(pname);
				p.setCountryName(c);
				p.setSpecializedIn(spa);
				service.putPlayer(c, p);
				System.out.println("player added successfully");
				break;

			case 2:

				System.out.println("player Details Are:");
				HashMap<String,Player> map=service.getPlayer();	
				for (Player p1 : map.values()) {
					System.out.println( p1.getPlayerName()+ " -- "+p1.getSpecializedIn());
				}
				System.out.println("retrived data successfully");
				break;
			case 3:
				System.out.println("Update player for country:");
				System.out.println("Enter country Name ");
				String con = scanner.next();
				scanner.nextLine();
				System.out.println("Enter new player");
				String newPlayer = scanner.next();
				scanner.nextLine();
				service.updatePlayer(con, newPlayer);;
				System.out.println("updated successfully");
				break;
			case 4:
				System.out.println("Deleting an player");
				System.out.println("Enter player countryName to be deleted");
				String con1= scanner.next();
				scanner.nextLine();
				service.deletePlayer(con1);;
				System.out.println("deleted successfully");
				break;
			case 5:
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Wrong Entry");
			}

			}


		}


	}

