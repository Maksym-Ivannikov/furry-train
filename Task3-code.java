/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a = 100; // Начальное значение диапазона - "от"
      int b = 899; // Конечное значение диапазона - "до"
      
      int random_number1 = a + (int) (Math.random() * b); // Генерация числа
      System.out.println("Случайное число: " + random_number1);
      
      int first = random_number1 / 100; // откидываем 2 числа справа и получаем первое
      
int secondBegin = random_number1 / 10; // откидываем одно число справа
      
int second = secondBegin % 10; // берем остаток от деления после откидывания и получаем второе
      
int third = random_number1 % 10; // остаток от деления на 10 это третее число
      
if (first > second && first > third) {
          System.out.println (first);
      } else if (second > first && second > third) {
        System.out.println (second);
      } else {
        System.out.println (third);
      }
	}
}