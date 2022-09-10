import com.teach.testvali.entity.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void testConstructPlayer() {
        Player player = new Player("John");
        assertEquals("John", player.getName(), "Name mismatch");
        assertEquals(100, player.getHp(), "Wrong HP init");
        assertEquals(100, player.getMaxHp(), "Wrong max HP init");
        assertEquals(100, player.getStamina(), "Wrong stamina init");
        assertEquals(1, player.getLevel(), "Wrong level init");
    }
}
