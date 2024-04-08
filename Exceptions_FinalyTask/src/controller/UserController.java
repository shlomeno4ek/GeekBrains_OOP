package controller;

import model.Person;
import model.myExceptions.BirthdayCorrectedException;
import model.myExceptions.MaleIsCorrectedException;
import model.myExceptions.MyArraySizeException;
import model.myExceptions.NumberPhoneCorrectedException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class UserController {
    public void arraySizeIsCorrect(String[] arr) {
        if(arr.length != 6) throw new MyArraySizeException();
    }

    public void maleIsCorrected(String gender) {
        if(!gender.equals("m") && !gender.equals("f")) throw new MaleIsCorrectedException();
    }

    public void birthdayIsCorrected(String birthday) {
        String [] arr = birthday.split("\\.");
        if(!(arr[0].length() == 2 && arr[1].length() == 2 && arr[2].length() == 4)) {
            throw new BirthdayCorrectedException();
        }
    }

    public void numberPhoneIsCorrected(String number) {
        try {
            Integer.parseInt(number);
        } catch (Exception e) {
            throw new NumberPhoneCorrectedException();
        }
    }


    public void savePerson(Person person) {
        String fn = person.getSurname() + ".txt";
        try(FileWriter fr = new FileWriter(fn, true)) {
            fr.write(String.format("<%s><%s><%s><%s><%d><%c>%n",
                    person.getSurname(), person.getName(), person.getSecondname(),
                    person.getBirthday(), person.getTelNumber(), person.getMale()));
            fr.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
