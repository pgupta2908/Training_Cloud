package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.Goods;

/*
 * interface to implements retailer service logic
 */
public interface IRetailerRepository extends JpaRepository<Goods, Integer> {

}