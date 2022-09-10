<b>Use the following guidelines to pass the tests:</b> <br><br>
<b>1.</b> In order to compile the tests, all classes, interfaces, enumerations and methods need to be
   defined. Even if you cannot solve the specific requirement (you can return null or do nothing)
   you need to define them.

<b>2. PlayerTest:</b> you need to implement a constructor Player(String name) which sets the
   player name and initializes HP, Stamina, maxHP with 100 and level with 1.

<b>3. PlayerLevelTest:</b> you need to implement method levelUp(). This method increments
   the level and increases maxHP with 20% and base attack with 40%, but also reset hp to maxHP.
   

<b>4. WeaponTest:</b> you need to implement the constructor Weapon(String name, float weight, float price, int damage). 
      Make sure Weapon is a kind of Item that implements Equipment. The
      getMountPoint needs to return RIGHT_ARM.

<b>5. PlayerInventoryTest:</b> implement method pickItem(Item e) which will add an item to
   the inventory and method getInventory() which returns the list of items.

<b>6. NpcTest:</b> you need to implement a class NPC with following constructor 
   Npc(String name, int level, int maxHp, int damage, NpcType type). This class represents enemies
   but also Mission Giver NPC  or other Non-attackable enemies.

<b>7. PlayerActionTest:</b> Here you have to implement method attack(Npc target) which will attack
   an enemy but not other NPCs.

<b>8. PlayerEquipmentTest:</b> implement method equip(MountPoint m, int pos) which will
   mount the item on position pos in inventory at the specified mounting point. If a di↵erent piece
   of equipment is already mounted, then it will be removed and added to the end of the inventory.
   Also implement method getEquipment(MountPoint m) which returns the piece of equipment
   mounted on point m.

<b>9. PlayerWeaponsTest:</b> implement a static method findBestWeapon(List<Player>) which
   finds the best weapon in the inventory of all players. The best weapon is the one with the highest
   attack. 