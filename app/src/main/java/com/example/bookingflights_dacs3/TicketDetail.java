package com.example.bookingflights_dacs3;

public class TicketDetail {

    private int row;
    private String column;

    boolean isbooked;


    public TicketDetail(int row, String column, boolean isbooked) {
        this.row = row;
        this.column = column;
        this.isbooked = isbooked;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public boolean isIsbooked() {
        return isbooked;
    }

    public void setIsbooked(boolean isbooked) {
        this.isbooked = isbooked;
    }
}
