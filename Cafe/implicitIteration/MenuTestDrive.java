package Cafe.implicitIteration;

public class MenuTestDrive {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.print();
    }
}

//Паттерн Итератор предоставляет механизм последовательного перебора
//элементов коллекции без раскрытия ее внутреннего представления.



