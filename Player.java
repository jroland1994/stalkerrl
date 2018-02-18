public class Player
    {
        //Variables for a character, effectivley, the character sheet:
        int strength=1, dexterity=1, intelligence=1, armor, damage, speed=dexterity*4, skillcount=intelligence+1;
        static int money, health, mana;
        static boolean living, bleeding, stealth;
        String name;
        String[] skills = new String[skillcount], inventory = new String[6];
        //Initialization class. Initialises beginer variable values for HP, MP, and livign status. Call after cahr creating when staring game:
        public void init()
            {
                int maxhealth=strength*8, maxmana = intelligene*2;
                living = true;
                health = maxhealth;
                mana = maxmana;
            }
    }
