public class Enemy 
{
    int strength=1, dexterity=1, intelligence=1, speed=dexterity*4, armor, damage;
    static int health, mana;
    static boolean bleeding, stealth, hasdodge, hasperception;
    String name; 
    
    public void spawn()
            {
                int maxhealth=strength*8, maxmana=intelligence*2;
                health=maxhealth;
                mana=maxmana;
            }
}
