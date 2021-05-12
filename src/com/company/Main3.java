package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int maxSalary, minSalary, difference, salaryFirst, salarySecond, salaryThird;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите зарплату первого сотрудника: ");
        salaryFirst = input.nextInt();
        System.out.print("Введите зарплату второго сотрудника: ");
        salarySecond = input.nextInt();
        System.out.print("Введите зарплату треьего сотрудника: ");
        salaryThird = input.nextInt();

        //todo maxSalary

        if (salaryFirst > salarySecond && salaryFirst > salaryThird) {
            maxSalary = salaryFirst;
            System.out.println("Наибольшая зарплата у первого и равна " + salaryFirst);
        }
        else if (salarySecond > salaryThird) {
            maxSalary = salarySecond;
            System.out.println("Наибольшая зарплата у второго и равна " + salarySecond);
        }
        else {
            maxSalary = salaryThird;
            System.out.println("Наибольшая зарплата у третьего и равна " + salaryThird);
        }

        //todo minSalary

        if (salaryFirst < salarySecond && salaryFirst < salaryThird) {
            minSalary = salaryFirst;
            System.out.println("Наименьшая зарплата у первого и равна " + salaryFirst);
        }
        else if (salarySecond < salaryThird) {
            minSalary = salarySecond;
            System.out.println("Наименьшая зарплата у второго и равна " + salarySecond);
        }
        else {
            minSalary = salaryThird;
            System.out.println("Наименьшая зарплата у третьего и равна " + salaryThird);
        }

        difference = maxSalary - minSalary;
        System.out.println("Разница между максимальной и минимальной зарплатой равна " + difference);
    }
}
