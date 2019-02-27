package com.tosan.restservice;

import com.tosan.entity.Bank;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Singleton
@Path("bank")
public class BankApi {
    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bank> getAll() {
        TypedQuery<Bank> query = entityManager.createQuery("select e from Bank e", Bank.class);
        return query.getResultList();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Bank insert(Bank bank) {
        entityManager.persist(bank);
        return bank;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Bank update(Bank bank) {
        Bank updatedBank = entityManager.merge(bank);
        return updatedBank;
    }


}
