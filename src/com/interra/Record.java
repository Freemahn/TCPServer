package com.interra;

/**
 * Created by pgordon on 23.06.2017.
 */
public class Record {
    private static int uid = 1;
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String position;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean commit(){
        this.id = uid++;
        Storage.put(this);
        return true;
    }


}
