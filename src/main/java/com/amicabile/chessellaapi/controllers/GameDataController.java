package com.amicabile.chessellaapi.controllers;

import com.amicabile.chessellaapi.model.GameDataObj;
import com.amicabile.chessellaapi.service.GameDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(path="/chessella-api")
public class GameDataController {
    private static final Logger LOGGER = Logger.getLogger(GameDataController.class.getName());



    private GameDataService gameDataService;

    @Autowired
    public GameDataController(GameDataService gameDataService){
        this.gameDataService = gameDataService;

    }

    //For getting all the transactions
    @RequestMapping(value = "/gamedataobjs", method= RequestMethod.GET)
    public ResponseEntity<List<GameDataObj>> getAll(){
        System.out.println(gameDataService.getAll().size());
        return new ResponseEntity<List<GameDataObj>>(gameDataService.getAll(), HttpStatus.OK);

    }

    //For getting whether the transaction with a given id is rejected or accepted
    @RequestMapping(value = "/gamedataobjs/{gamedataobjid}", method = RequestMethod.GET)
    public ResponseEntity<GameDataObj> screenTransaction(@PathVariable long gamedataobjid)  {
        GameDataObj  gameDataObj = gameDataService.get(gamedataobjid);
        LOGGER.info(gameDataObj.toString());
        return new ResponseEntity<GameDataObj>(gameDataObj , HttpStatus.OK);
    }
}
