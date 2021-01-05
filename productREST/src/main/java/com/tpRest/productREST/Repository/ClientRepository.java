package com.tpRest.productREST.Repository;

import com.tpRest.productREST.Entity.Client;

import java.util.Optional;

public interface ClientRepository {
    Optional<Client> findByUsername(String username);
    Boolean existsByUsername(String username);
}
