package com.amicabile.chessellaapi.dao;

import com.amicabile.chessellaapi.model.GameDataObj;

import java.util.List;


public interface GameDataObjDao {

    public GameDataObj get(long id);

    public List<GameDataObj> getAll();

}