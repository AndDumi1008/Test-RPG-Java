import com.teach.testvali.entity.Npc;
import com.teach.testvali.enums.NpcType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NpcTest {
    private static Npc enemy;
    private static Npc services;

    @BeforeAll
    public static void constructInit() {
        enemy = new Npc("Hungry Wolf", 3, 40, 12, NpcType.ENEMY);
        services = new Npc("Captain Sparrow", 100, 3000, 420, NpcType.QUESTGIVER);
    }

    @Test
    public void testConstructEnemy() {
        assertEquals("Hungry Wolf", enemy.getName(), "Name mismatch");
        assertEquals(40, enemy.getHp(), "Wrong HP init");
        assertEquals(40, enemy.getMaxHp(), "Wrong max HP init");
        assertEquals(12, enemy.getDamage(), "Wrong damage");
        assertEquals(3, enemy.getLevel(), "Wrong level init");
        assertTrue(enemy.isAttackable(), "This target should be attackable");
    }

    @Test
    public void testConstructServices() {
        assertEquals("Captain Sparrow", services.getName(), "Name mismatch");
        assertEquals(3000, services.getHp(), "Wrong HP init");
        assertEquals(3000, services.getMaxHp(), "Wrong max HP init");
        assertEquals(420, services.getDamage(), "Wrong damage");
        assertEquals(100, services.getLevel(), "Wrong level init");
        assertFalse(services.isAttackable(), "This target should not be attackable");
    }

    @Test
    public void testTakingDamage() {
        enemy.takeDamage(10);
        assertEquals(30, enemy.getHp(), "Wrong HP init");

        services.takeDamage(300);
        assertEquals(3000, services.getHp(), "Wrong HP init");
    }
}
