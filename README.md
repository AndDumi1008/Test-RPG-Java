Use the following guidelines to pass the tests:
1. In order to compile the tests, all classes, interfaces, enumerations and methods need to be
   defined. Even if you cannot solve the specific requirement (you can return null or do nothing)
   you need to define them.

2. (1p)PlayerTest: you need to implement a constructor Player(String name) which sets the
   player name and initializes HP, Stamina, maxHP with 100 and level with 1.

3. (1p)PlayerLevelTest: you need to implement method levelUp(). This method increments
   the level and increases maxHP with 20 % and base attack with 40.
   17

4. (1p)WeaponTest: you need to implement the constructor Weapon(String name, int minAttack,
   int maxAttack). Make sure Weapon is a kind of Item that implements Equipment. The
   getMountPoint needs to return ATTACK ARM.

5. (1p)PlayerInventoryTest: implement method addItem(Item e) which will add an item to
   the inventory and method getInventory() which returns the list of items.

6. (1p)PlayerActionTest:  ???

7. (1p)PlayerEquipmentTest: implement method equip(MountPoint m, int pos) which will
   mount the item on position pos in inventory at the specified mounting point. If a di↵erent piece
   of equipment is already mounted, then it will be removed and added to the end of the inventory.
   Also implement method getEquipment(MountPoint m) which returns the piece of equipment
   mounted on point m.

8. (2p)PlayerWeaponsTest: implement a static method findBestWeapon(List<Player>) which
   finds the best weapon in the inventory of all players. The best weapon is the one with the highest
   maxAttack. If two weapons have the same maxAttack, the one with the highest minAttack
   is better.