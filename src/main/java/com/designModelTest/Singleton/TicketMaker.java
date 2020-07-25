package com.designModelTest.Singleton;

/**
 * @Author YongQiang
 * @Date 2020/3/18 9:42
 * @Version 1.0
 */
public class TicketMaker {
    private static TicketMaker ticketMaker=new TicketMaker();
    private int ticket =1000;

    private TicketMaker() {
    }

    public static TicketMaker getTicketMaker() {
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
