package com.SpringProject.SpringBootDemo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


import com.SpringProject.SpringBootDemo.entities.Anime;
import com.SpringProject.SpringBootDemo.services.AnimeService;

@RestController
public class Projectcontroller {
	
	@Autowired
	private AnimeService animeService;
	
	@GetMapping("/home")
	public String home() {
		return "This is Anime World!!!!";
	}
	
//	Get the Anime List
	@GetMapping("/anime")
	public List<Anime> getAnime(){
		
		return this.animeService.getAnime();
	}
	
//	Getting single Name through id
	@GetMapping("/anime/{animeId}")
	public Anime getAnime(@PathVariable Long animeId) {
		return this.animeService.getAnime(animeId);
	}
	
//	adding data
	@PostMapping("/anime")
	public ResponseEntity<HttpStatus> addAnime(@RequestBody Anime anime) {
		this.animeService.addAnime(anime);
		return  new ResponseEntity<>(HttpStatus.CREATED);
	}
	
//	Updating data
	@PutMapping("/anime")
	public ResponseEntity<HttpStatus> updateAnime(@RequestBody Anime anime) {
		this.animeService.addAnime(anime);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
//	delete an anime
	@DeleteMapping("anime/{animeId}")  //{} ->placeHolder
	public ResponseEntity<HttpStatus> deleteAnime(@PathVariable Long animeId) {
		try{
			this.animeService.deleteAnime(animeId);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	public static void main(String[] args) {

	}

}
