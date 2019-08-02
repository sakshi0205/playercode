package service;

import java.util.HashMap;

import bean.Player;
import deo.PlayerDao;
import deo.PlayerDaoImp1;

public class PlayerServiceImp1 implements PlayerService{

	PlayerDao player1 = new PlayerDaoImp1();

	@Override
	public void putPlayer(String countryName, Player player) {
		player1.putPlayer(countryName, player);
	}

	@Override
	public HashMap<String, Player> getPlayer() {
		// TODO Auto-generated method stub
		return player1.getPlayer();
	}

	@Override
	public void updatePlayer(String countryName, String playerName) {
		// TODO Auto-generated method stub
		player1.updatePlayer(countryName, playerName);
		
	}

	@Override
	public void deletePlayer(String countryName) {
		// TODO Auto-generated method stub
		player1.deletePlayer(countryName);
	}
	
	

}
