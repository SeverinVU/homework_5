package com.severin.homework_5;

public class Main {
    public static void main(String[] args)  {
        Employee[] employees = new Employee[5];{
            employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "+892312312", 30000, 30);
            employees[1] = new Employee("Bob Jhonson", "sLAVE", "slave@slave.ru", "+54321", 0, 74);
            employees[2] = new Employee("Karl IV", "King", "karl@king.cz", "+777777777", 99999999, 62);
            employees[3] = new Employee("Verka Serduchka", "Singer", "verka@mail.ua", "+380503535353", 100000, 25);
            employees[4] = new Employee("Аляксандр Рыгоравіч Лукашэнка", "batka", "batka@mail.by", "+1234567", 1, 100);

            for(int b = 0; b < 5; b++)
                if(employees[b].age > 40)employees[b].print();
        }
    }
}
