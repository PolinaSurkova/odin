package com.company;

public class Main {

    public static void main(String[] args)
    {
        Cont Element = new Cont();
        Element.add_Elem("первый элемент", 1); //добавление
        Element.print_All_Elems();
        System.out.println(Element.get_Elem(3));
        System.out.println(Element.get_Elem(1));
        Element.add_Elem("vtoroy",2);
        Element.add_Elem("third",3);
        Element.add_Elem("fifth",5);
        Element.print_All_Elems();
        System.out.println("ТРЕТИЙ ЭЛЕМЕНТ = "+Element.get_Elem(3));
        Element.delete_Elem(2);
        System.out.println("После удаления: ");
        Element.print_All_Elems();
        Element.delete_Elem(5);

    }
}