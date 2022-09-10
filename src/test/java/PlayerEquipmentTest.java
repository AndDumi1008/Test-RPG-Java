import com.teach.testvali.entity.Equipment;
import com.teach.testvali.entity.Item;
import com.teach.testvali.entity.Player;
import com.teach.testvali.entity.playerEquipment.Weapon;
import com.teach.testvali.enums.MountPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerEquipmentTest {

    @Test
    void playerEquipment() {
        Player player = new Player("John");
        player.pickItem(new Weapon("Sword of Ra", 13, 40, 8));
        player.pickItem(new Weapon("Sword of Gilgamesh", 20, 45, 13));
        player.pickItem(new Item("Stone", 1, 1));
        player.equip(MountPoint.RIGHT_ARM, 0);
        Equipment e = player.getEquipment(MountPoint.RIGHT_ARM);
        boolean allOk = false;
        try {
            Weapon weapon = (Weapon) e;
            assertEquals("Sword of Ra", weapon.getName());
            allOk = true;
        } catch (ClassCastException ex) {
            assertTrue(allOk, "Could not create back weapon out of equipment");
        }
    }
}
