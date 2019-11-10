package com.amicabile.chessellaapi.dao;

import com.amicabile.chessellaapi.model.GameDataObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class GameDataObjDaoImpl implements GameDataObjDao {

    private EntityManager entityManager;

    @Autowired
    public GameDataObjDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;

    }

    // standard constructors

    @Override
    public GameDataObj get(long id) {
        GameDataObj gameDataObj = entityManager.find(GameDataObj.class,id);
        return gameDataObj;
    }

    @Override
    public List<GameDataObj> getAll() {
        Query theQuery= (Query) entityManager.createQuery("from GameDataObj");
        List<GameDataObj> gameDataObjs = theQuery.getResultList();

        return gameDataObjs ;
    }


}
