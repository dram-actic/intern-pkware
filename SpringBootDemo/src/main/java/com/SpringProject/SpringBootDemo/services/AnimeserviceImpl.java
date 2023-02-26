package com.SpringProject.SpringBootDemo.services;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.SpringProject.SpringBootDemo.dao.AnimeDao;
import com.SpringProject.SpringBootDemo.entities.Anime;

@Service
public class AnimeserviceImpl implements AnimeService {

//	List<Anime> list;
	@Autowired
	private AnimeDao animeDao;
	
	public AnimeserviceImpl() {
		
		/*list = new ArrayList<>();
		list.add(new Anime(101, "Dragon Ball", "Dragon Ball tells the tale of a young warrior by the name of Son Goku, a young peculiar boy with a tail who embarks on a quest to become stronger and learns of the Dragon Balls, when, once all 7 are gathered, grant any wish of choice."));
		list.add(new Anime(102, "Naruto", "Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village."));
		list.add(new Anime(103, "Attack on Titan", "It is set in a world where humanity is forced to live in cities surrounded by three enormous walls that protect them from gigantic man-eating humanoids referred to as Titans."));
		 */
		
	}
	@Override
	public List<Anime> getAnime() {
//		return list;
		return animeDao.findAll();
	}
	@Override
	public Anime getAnime(Long animeId) {

		/*for(Anime tmp:list) {
			if(tmp.getId() == animeId)
				return tmp;
		}
		return null;*/
		Optional<Anime> entity = animeDao.findById(animeId);
		if(entity.isPresent())
			return entity.get();
		else
			return null;
	}
	@Override
	public Anime addAnime(Anime anime) {
		/*list.add(anime);
		return anime;*/
		Optional<Anime> entity = animeDao.findById(anime.getId());
		if(entity.isPresent())
			return null;
		else {
			animeDao.save(anime);
			return anime;
		}
	}
	@Override
	public Anime updateAnime(Anime anime) {
		/*list.forEach(e -> {
		if(e.getId()==anime.getId()) {
			e.setName(anime.getName());
			e.setDescription(anime.getDescription());
		}
	});
		return anime;*/
		Optional<Anime> entity = animeDao.findById(anime.getId());
		if(entity.isPresent()) {
			animeDao.save(anime);
			return anime;
		}
		else {
			return null;
		}
	}
	@Override
	public void deleteAnime(Long animeId) {
		/*list.forEach(e -> {
			if(e.getId()==animeId) {
				list.remove(e);
			}
		});*/
		
		Optional<Anime> entity = animeDao.findById(animeId);
		if(entity.isPresent())
			animeDao.deleteById(animeId);
	}
}

