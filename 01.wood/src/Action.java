/**
 * Результаты хода персонажа
 */
public enum Action {
	// В результате хода персонаж умирает;
	Dead,
	// Персонажу не удалось совершить ход.
	// Вероятно, по направлению хода была стена или другой персонаж.
	Fail,
	// Успешный ход персонажа
	Ok,
	// Успешный ход персонажа, после которого у персонажа добавляется еще одна жизнь
	Life
}