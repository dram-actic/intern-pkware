package com.SpringProject.SpringBootDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringProject.SpringBootDemo.entities.Anime;

public interface AnimeDao extends JpaRepository<Anime, Long>{

}
