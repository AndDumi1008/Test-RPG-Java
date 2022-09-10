import com.teach.testvali.entity.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerLevelTest {

    @Test
    void playerFieldsTest() {
        Player player = new Player("John");

        player.levelUp();
        assertEquals(120, player.getMaxHp(), "max HP not updated");
        assertEquals(120, player.getHp(), "HP not updated when level up");
        assertEquals(7, player.getDamage(), "Damage not updated when level up");
        assertEquals(100, player.getStamina(), "Stamina not updated when level up");
        assertEquals(2, player.getLevel(), "Level not updated");

        player.levelUp();
        assertEquals(3, player.getLevel(), "Level not updated");
        assertEquals(144, player.getMaxHp(), "max HP not updated");
        assertEquals(144, player.getHp(), "HP not  updated when level up");
        assertEquals(9, player.getDamage(), "Damage not updated when level up");
        assertEquals(100, player.getStamina(), "Stamina not  updated when level up");
    }
}
