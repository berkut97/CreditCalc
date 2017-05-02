/**
*Объявление пакета, в котором находится класс
*/
package method;
/**
*Добавление библиотеки для графического интерфейса
*/
import java.awt.*;
/**
*Добавление библиотеки для создания графического интерфейса
*/
import javax.swing.*;
/**
*Создание класса Метод
*/
public class Method {
	/**
	*Создание метода Текстовое поле
	*/
	public static void TextField(JTextField a,String attribute,int x,int y,int width,int height,int Columns) {
		/**
		*Задание значения текстовому полю
		*/
		a.setText(attribute);
		/**
		*Задание местоположения текстового поля
		*/
		a.setBounds(x,y,width,height);
		/**
		*Задание размера шрифта в текстовом поле
		*/
		a.setColumns(Columns);
		/**
		*Окончание создания метода Текстовое поле
		*/
	}
	/**
	*Создание метода Выпадающий список
	*/
	public static void ComboBox(JComboBox b,boolean attribute,int x,int y,int width,int height) {
		/**
		*Задание местоположения выпадающего списка
		*/
		b.setBounds(x,y,width,height);
		/**
		*Задание параметра изменияемости значений в выпадающем списке
		*/
		b.setEditable(attribute);
	/**
	*Окончание создания метода Выпадающий список
	*/
	}
	/**
	*Создание метода Кнопка
	*/
	public static void Button(JButton c,int x,int y,int width,int height,int Columns) {
		/**
		*Задание местоположения кнопки 
		*/
		c.setBounds(x, y, width, height);
		/**
		*Задание параметров кнопки
		*/
		c.setFont(new Font("Tahoma", Font.PLAIN, Columns));
	/**
	*Окончание создание метода Кнопка
	*/	
	}
/**
*Окончание создания класса Метод
*/	
}
