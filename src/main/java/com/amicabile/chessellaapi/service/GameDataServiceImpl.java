package com.amicabile.chessellaapi.service;

import com.amicabile.chessellaapi.model.GameDataObj;
import com.amicabile.chessellaapi.dao.GameDataObjDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GameDataServiceImpl implements GameDataService {

    GameDataObjDao gameDataObjDao;

    @Autowired
    public GameDataServiceImpl(GameDataObjDao theGameDataObjDao){
        gameDataObjDao = theGameDataObjDao;
    }

    @Override
    @Transactional
    public List<GameDataObj> getAll() {
        return gameDataObjDao.getAll();
    }


    @Override
    @Transactional
    public GameDataObj get(long theId) {
        return gameDataObjDao.get(theId);
    }


}
