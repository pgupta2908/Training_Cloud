package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.Supplier;

/*
 * methods to implement supplier service logic
 */
public interface ISupplierRepository extends JpaRepository<Supplier, Integer> {

}