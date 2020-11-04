package com.company;

public class Cont {
    private OneElem head = null;
    private int count = 0;

    /**
     * Функция добавления элемента по заданному номеру и значению
     * @param val значение элемента
     * @param num номер места, куда нужно поставить элемент (не должен быть больше чем количество+1)
     */
    public void add_Elem(String val, int num) {
        OneElem elem1 = new OneElem();
        OneElem elem2 = new OneElem();
        if (num == 1) {
            elem1.set_Next(head);
            elem1.set_Value(val);
            head = elem1;
            count++;
        } else if (num == 2) {
            head.set_Next(elem1);
            elem1.set_Next(head.get_Next());
            elem1.set_Value(val);
            count++;
        } else if (num > 2) {
            if (num <= count + 1) {
                elem1 = head;
                for (int i = 1; i < num - 1; i++) {
                    elem1 = elem1.get_Next();
                }
                elem1.set_Next(elem2);
                elem2.set_Next(elem1.get_Next());
                elem2.set_Value(val);
                count++;
            } else
                System.out.println("Нельзя поставить элемент на место, номер которого превышает число элементов больше чем на 1.");
        }
    }

    /**
     * Функция извлечения элемента по его порядковому номеру
     * @param num номер элемента, который нужно извлечь
     * @return значение искомого элемента, если нашли его. Если нет, выводится сообщение о ненаходе
     */
    public String get_Elem(int num)
    {
        OneElem elem = new OneElem();
        elem = head;
        if(num <= count)
        {
            for (int i = 1; i < num; i++) {
                elem = elem.get_Next();
            }
            return elem.get_Value();
        }
        else return "Номер элемента превышает количество элементов.";
    }

    /**
     * Функция удаления элемента по его порядковому номеру
     * @param num номер элемента, который нужно удалить
     */
    public void delete_Elem(int num) {
        OneElem elem1 = new OneElem();
        OneElem elem2 = new OneElem();
        if (head==null) {
            head = elem1;
            System.out.println("Контейнер пуст, удалять нечего.");
        } else {
            if (num == 1) {
                elem1 = head;
                head = head.get_Next();
                elem1 = null;
                count--;
            } else if (num == 2) {
                elem2 = head.get_Next();
                head.set_Next(elem2.get_Next());
                elem2 = null;
                count--;
            } else if (num > 2) {
                if(num <= count)
                {
                    elem1 = head;
                    for (int i = 1; i < num - 1; i++) {
                        elem1 = elem1.get_Next();
                    }
                    elem2 = elem1.get_Next();
                    elem1.set_Next(elem2.get_Next());
                    elem2 = null;
                    elem1 = null;
                    count--;
                }
                else System.out.println("Элемента с таким номером нет, удалять нечего.");
            }
        }
    }

    /**Функция вывода всех элементов на экран*/
    public void print_All_Elems()
    {
        OneElem elem = new OneElem();
        elem = head;
        if (head==null)
        {
            System.out.println("Контейнер пуст, выводить на экран нечего.");
        }
        else {
            for(int i = 0; i < count; i++)
            {
                System.out.println(elem.get_Value());
                elem = elem.get_Next();
            }
        }
        elem = null;
    }
}