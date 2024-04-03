package controller;

import model.myExceptions.MyArraySizeException;

public class UserController {
    public void arraySizeIsCorrect(String[] arr) {
        if(arr.length != 6) throw new MyArraySizeException();
    }
}
