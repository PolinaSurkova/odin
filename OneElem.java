package com.company;

public class OneElem {
    /** Поле next, указывающее на следующий по счёту элемент */
    private OneElem next = null;
    /** Поле value, показывающее значение, которое принимает элемент  */
    private String value = null;

    /**
     * Свойство поля, возвращающее ссылку на следующий элемент
     * @return next ссылка на следующий элемента
     */

    public OneElem get_Next()
    {
        return next;
    }

    /**
     * Присваивание ссылки на следующий элемент нексту данного элемента
     * @param nod1 ссылка на следующий элемент
     */
    public void set_Next(OneElem nod1)
    {
        next = nod1;
    }

    /**
     * Свойство поля, возвращающее значение элемента
     * @return value значение элемента
     */
    public String get_Value()
    {
        return value;
    }

    /**
     * Присваивание значения элемента
     * @param val значение, которое нужно вписать в элемент
     */
    public void set_Value(String val)
    {
        value = val;
    }
}