package com.amicabile.chessellaapi.service;

import com.amicabile.chessellaapi.model.GameDataObj;

import java.util.List;

public interface GameDataService {

    public GameDataObj get(long id) ;

    public List<GameDataObj> getAll() ;


}
