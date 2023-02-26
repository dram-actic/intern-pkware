package com.SpringProject.SpringBootDemo.services;

import java.util.List;
import com.SpringProject.SpringBootDemo.entities.Anime;

public interface AnimeService {

	public List<Anime> getAnime();
	public Anime getAnime(Long animeId);
	public Anime addAnime(Anime anime);
	public Anime updateAnime(Anime anime);
	public void deleteAnime(Long animeId);
}
