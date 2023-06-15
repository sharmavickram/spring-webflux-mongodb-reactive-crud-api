package com.example.springwebfluxmongodbreactivecrudapi.repository;

import com.example.springwebfluxmongodbreactivecrudapi.model.Invoice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface InvoiceRepository extends ReactiveMongoRepository<Invoice, Integer> {

}