package deo;

import java.util.HashMap;

import bean.Employee;
import bean.Player;

public class PlayerDaoImp1 implements PlayerDao{
	HashMap<String,Player> playermap = new HashMap<String,Player>();
	@Override
	public void putPlayer(String countryName,Player player) {
		
		playermap.put(countryName,player);
	}

	@Override
	public HashMap<String, Player> getPlayer() {
		return playermap;
	}
	
	@Override
	public void updatePlayer(String countryName,String playerName) {
		for(Player player:playermap.values()) {
			if(player.getCountryName().equals(countryName)) {
				player.setPlayerName(playerName);
			}
		}
				
		
	}

	@Override
	public void deletePlayer(String countryName) {
		// TODO Auto-generated method stub
		for(Player player: playermap.values()) {
			if(player.getCountryName().equals(countryName))
				playermap.remove(countryName);}

}
}
