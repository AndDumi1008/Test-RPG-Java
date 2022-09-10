import com.teach.testvali.entity.Equipment;
import com.teach.testvali.entity.Npc;
import com.teach.testvali.entity.Player;
import com.teach.testvali.entity.playerEquipment.Weapon;
import com.teach.testvali.enums.MountPoint;
import com.teach.testvali.enums.NpcType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerActionTest {

    @Test
    public void testPlayerAction() {
        Player player = new Player("John");
        player.levelUp();
        player.levelUp();

        player.pickItem(new Weapon("Sword of Gilgamesh", 20, 45, 13));


        Npc enemy = new Npc("Hungry Wolf", 3, 40, 12, NpcType.ENEMY);
        Npc services = new Npc("Captain Sparrow", 100, 3000, 420, NpcType.QUESTGIVER);

        assertEquals("John", player.getName(), "Name mismatch");
        assertEquals(3, player.getLevel(), "Level not updated");
        assertEquals(144, player.getMaxHp(), "max HP not updated");
        assertEquals(144, player.getHp(), "HP not  updated when level up");
        assertEquals(9, player.getDamage(), "Damage not updated when level up");
        assertEquals(100, player.getStamina(), "Stamina not  updated when level up");

        player.equip(MountPoint.RIGHT_ARM, 0);
        Equipment e = player.getEquipment(MountPoint.RIGHT_ARM);
        boolean allOk = false;
        try {
            Weapon weapon = (Weapon) e;
            assertEquals("Sword of Gilgamesh", weapon.getName());
            allOk = true;
        } catch (ClassCastException ex) {
            assertTrue(allOk, "Could not create back weapon out of equipment");
        }
        assertEquals(22, player.getDamage(), "Damage not updated when level up");


        assertEquals(40, enemy.getHp(), "Wrong HP init");
        assertEquals(40, enemy.getMaxHp(), "Wrong max HP init");
        assertEquals(12, enemy.getDamage(), "Wrong damage");
        assertEquals(3, enemy.getLevel(), "Wrong level init");
        assertTrue(enemy.isAttackable(), "This target should be attackable");

        assertEquals(3000, services.getHp(), "Wrong HP init");
        assertEquals(3000, services.getMaxHp(), "Wrong max HP init");
        assertEquals(420, services.getDamage(), "Wrong damage");
        assertEquals(100, services.getLevel(), "Wrong level init");
        assertFalse(services.isAttackable(), "This target should not be attackable");

        player.levelUp();
        assertEquals(25, player.getDamage(), "Damage not updated when level up");
    }
}
