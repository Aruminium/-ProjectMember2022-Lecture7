package monster;

import skill.Skill;
import java.util.List;

public interface IMonster {
    String getName();
    int getHP();
    void setHP(int hp);
    int getPower();
    int getDefense();
    int getSpeed();
    List<Skill> getSkills();
    boolean isAlive();
}
