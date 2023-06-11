package controller;

import model.loginModel;
import view.peserta;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

public class listController {

    private peserta view;
    private loginModel model;
    public  listController(loginModel model, peserta view){
        this.view = view;
        this.model = model;

    }

    public ResultSet list(){
       return model.dataPeserta();

    }

}
