package com.garage.Repository;

import com.garage.Model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DAOClient implements DAO{

/***************************************************************************************/

    @Autowired
    private SessionFactory sessionFactory;

/***************************************************************************************/

    @Override
    @Transactional
    public List<Client> getClientList() {

        // obtener la sesion

        Session mySession = sessionFactory.getCurrentSession();

        // crear la consulta

        Query myQuery = mySession.createQuery("from Client", Client.class);

        // obtener los clientes y devolverlos

        List<Client> clientList = myQuery.getResultList();

        return clientList;
    }

/***************************************************************************************/

    @Override
    @Transactional
    public void saveNewClientToDDBB(Client newClient) {

        // obtener session

        Session mySession = sessionFactory.getCurrentSession();

        // guardar cliente

        // mySession.save(newClient);

        mySession.saveOrUpdate(newClient);

    }

/***************************************************************************************/

    @Override
    @Transactional
    public Client getoneClientById(int id) {

        // obtener session

        Session mySession = sessionFactory.getCurrentSession();

        Client client = mySession.get(Client.class, id);

        return client;
    }

/***************************************************************************************/

    @Override
    @Transactional
    public void deleteClientById(int id) {

        // obtener session

        Session mySession = sessionFactory.getCurrentSession();

        Query myQuery = mySession.createQuery("delete from Client where id =: IDdelCliente");

        myQuery.setParameter("IDdelCliente", id);

        myQuery.executeUpdate();

    }




/***************************************************************************************/

/***************************************************************************************/
}
