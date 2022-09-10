import com.teach.testvali.entity.Equipment;
import com.teach.testvali.entity.Item;
import com.teach.testvali.entity.ItemAbstract;
import com.teach.testvali.entity.Player;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerInventoryTest {
    @Test
    void playerInventory() {
        Player player = new Player("John");
        player.pickItem(new Equipment("Sword of Ra", 20, 40));
        player.pickItem(new Equipment("Sword of Gilgamesh", 20, 45));
        player.pickItem(new Item("Stone", 1, 1));

        List<ItemAbstract> inv = player.getInventory();
        assertEquals("Sword of Ra", inv.get(0).getName());
        assertEquals("Sword of Gilgamesh", inv.get(1).getName());
        assertEquals("Stone", inv.get(2).getName());
    }

}
