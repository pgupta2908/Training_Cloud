package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.Goods;

/*
 * interface to implements goods services logic
 */
public interface IGoodsRepository extends JpaRepository<Goods, Integer> {

}