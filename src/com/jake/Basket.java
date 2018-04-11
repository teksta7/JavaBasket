package com.jake;

import java.util.ArrayList;

public class Basket {

    private static Basket basket = new Basket();

    float total;
    float subtotal;
    boolean offer;
    ArrayList<Item> basketList = new ArrayList<Item>();
    int basketPosition = 0;

    //Private Constructor
    private Basket()
    {
        total = 0;
        subtotal = 0;
        offer = false;
        //asketList = new ArrayList<Item>();
        //basketPosition = 0;
    }

    //Get single instance of basket
    public static Basket getInstance()
    {
        return basket;
    }

    //Add item to basket
    protected void addToBasket(Item item)
    {
        basketList.add(basketPosition, item);
        basketPosition = basketPosition + 1;

    }

    protected void showBasket()
    {
        System.out.println("Your basket at the moment contains");
        for(int i = 0; i <= basketPosition; i++)
            if(basketPosition == 0)
            {
                System.out.println("No Items");
            }
            else
            if(basketList.size() != i )
                {
                    System.out.println(basketList.get(i));
                }
    }

    /*protected static float calculateBeforeOffer()
    {

    } */
}
