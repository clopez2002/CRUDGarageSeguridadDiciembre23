package com.garage.Repository;

import com.garage.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DAO {

/***************************************************************************************/

    public List<Client> getClientList ();

/***************************************************************************************/

    void saveNewClientToDDBB(Client newClient);

/***************************************************************************************/

    Client getoneClientById(int id);

/***************************************************************************************/

    void deleteClientById(int id);




/***************************************************************************************/

/***************************************************************************************/

/***************************************************************************************/

/***************************************************************************************/
}
