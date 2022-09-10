import com.teach.testvali.entity.Equipment;
import com.teach.testvali.entity.ItemAbstract;
import com.teach.testvali.entity.playerEquipment.Weapon;
import com.teach.testvali.enums.MountPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeaponTest {

    @Test
    void testWeapon() {
        Weapon weapon = new Weapon("Sword of Ra", 13, 40, 8);
        assertEquals("Sword of Ra", weapon.getName());
        assertEquals(8, weapon.getDamage());

        assertTrue(weapon instanceof ItemAbstract, "Weapon must be a kind of Item");
        assertTrue(weapon instanceof Equipment, "Weapon must be a kind of Equipment");

        assertEquals(MountPoint.RIGHT_ARM, ((Equipment) weapon).getMountPoint(), "wrong mounting point... Remember that weapon is a kind of Equipment.class");
    }
}
