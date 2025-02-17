import java.util.Random;

public class TeamMaker {
	public static ICombatant[] makeTeam1() {
		ICombatant[] knights = new ICombatant[3];
		for (int i = 0; i < knights.length; i++) {
			knights[i] = makeRandomTeam1Member();
		}
		return knights;
	}

	public static ICombatant[] makeTeam2() {
		ICombatant[] warriors = new ICombatant[3];
		for (int i = 0; i < warriors.length; i++) {
			warriors[i] = makeRandomTeam2Member();
		}
		return warriors;
	}

	private static ICombatant makeRandomTeam1Member() {
		Random rand = new Random();
		int baseHP = rand.nextInt(999 - 99) + 1;
		int wp = rand.nextInt(2);
		return (wp % 2 == 0) ? new Knight(baseHP, wp) : new Paladin(500, 1);
	}

	private static ICombatant makeRandomTeam2Member() {
		Random rand = new Random();
		int baseHP = rand.nextInt(999 - 99) + 1;
		int wp = rand.nextInt(2);
		return (Battle.GROUND % 2 == 0) ? new Warrior(baseHP, wp) : new DeathEater(new Complex(300, 200));
	}
}
