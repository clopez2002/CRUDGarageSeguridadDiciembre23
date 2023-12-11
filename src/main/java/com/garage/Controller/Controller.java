package com.garage.Controller;

import com.garage.Model.Client;
import com.garage.Repository.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/garageHomeURL")
public class Controller {

/***************************************************************************************/

    @Autowired
    private DAO dao;

/***************************************************************************************/

    @RequestMapping("/home")
    public String garageHome(Model theModel){

        // obtener los clientes desde el DAO

        List<Client> clientList = dao.getClientList();

        // agregar clientes al modelo

        theModel.addAttribute("clientsAttributes", clientList);



        return "garageHomeFile";
    }

/***************************************************************************************/

/***************************************************************************************/

/***************************************************************************************/

/***************************************************************************************/

/***************************************************************************************/

/***************************************************************************************/

/***************************************************************************************/

/***************************************************************************************/

}
