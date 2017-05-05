/**
*Объявление пакета, в котором находится класс
*/
package test;
/**
*Добавление библиотек для проверки результата теста 
*/
import static org.junit.Assert.*;
/**
*Добавление библиотек для тестирования 
*/
import org.junit.*;
/**
*Добавление класса Проверки пароля 
*/
import main.PasswordClassic;
/**
*Создание класса для тестирования проверки пароля
*/
public class PasswordTest {
	/**
	*Объявление переменной для тестирования 
	*/
	private PasswordClassic test;
	/**
	*Объявление методов, которые будут вызваны до исполнения теста
	*/
	@Before
	/**
	*Создание нового теста
	*/
	public void init() { test = new PasswordClassic(); } 
	/**
	*Объявление методов, которые будут вызваны после исполнения теста
	*/
	@After
	/**
	*Обнуление результатов теста
	*/
	public void tearDown() { test = null; }
	/**
	*Создание тестовых методов
	*/
	@Test
	/**
	* Начало теста проверки пароля
	*/
	public void test() {
		/**
		* Объявление класса Проверки пароля для тестирования
		*/
		test = new PasswordClassic();
		/**
		* Задание параметров:
		* Задание выходного значения "1", получаемого при введении правильного пароля
		* Задание правильного пароля "123"
		*/
		assertEquals(1,test.getP(123));
		/**
		* Окончание теста проверки пароля
		*/
	}
	/**
	* Окончание создание класса для тестирования проверки пароля
	*/
}
