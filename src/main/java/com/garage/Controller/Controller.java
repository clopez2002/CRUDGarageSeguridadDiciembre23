package com.garage.Controller;

import com.garage.Model.Client;
import com.garage.Repository.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/addClientURL")
    public String addClientMethod (Model theModel){

        // bind de datos de clientes

        Client oneClient = new Client();

        theModel.addAttribute("oneClientAttribute", oneClient);

        return "addClientFile";
    }

/***************************************************************************************/

    @PostMapping("saveclientOnDDBBURL")
    public String saveClientOnDDBBMethod (@ModelAttribute("oneClientAttribute") Client newClient){

        // insertamos el cliente en la BBDD

        dao.saveNewClientToDDBB(newClient);

        return "redirect:/garageHomeURL/home";
    }

/***************************************************************************************/

    @RequestMapping("/updateClientURL")
    public String updateClientMethod (@RequestParam("clienId") int Id, Model theModel){

        // Obtener el cliete

        Client client = dao.getoneClientById(Id);

        // Establecer el cliente como atributo del modelo

        theModel.addAttribute("runnerAttributeToUpdate", client);

        // Enviar el formualio

        return "updateClientFile";
    }

/***************************************************************************************/

    @PostMapping("/saveClientUpdatedURL")
    public String saveClientUpdateMethod (@ModelAttribute("runnerAttributeToUpdate") Client newClient){

        dao.saveNewClientToDDBB(newClient);

        return "redirect:/garageHomeURL/home";
    }

/***************************************************************************************/

/***************************************************************************************/

/***************************************************************************************/

/***************************************************************************************/

}
