import com.teach.testvali.entity.Item;
import com.teach.testvali.entity.Player;
import com.teach.testvali.entity.playerEquipment.Weapon;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerWeaponTest {
    @Test
    void bestWeapon(){
        Player player = new Player("John");
        player.pickItem(new Weapon("Sword of Ra", 20, 40, 20));

        player.pickItem(new Item("Stone", 1, 1));


        Player p2 = new Player("Mary");
        p2.pickItem(new Weapon("Sword of Zeus", 10, 45, 12));




        Player p3 = new Player("George");
        p3.pickItem(new Weapon("Sword of Gilgamesh", 25, 45, 25));

        p3.pickItem(new Item("Stone", 1, 1));



        List<Player> players = new ArrayList<Player>();
        players.add(player);
        players.add(p2);
        players.add(p3);

        Weapon weapon = Player.findBestWeapon(players);
        assertEquals("Sword of Gilgamesh", weapon.getName(), "Wrong weapon chosen");
    }
}
