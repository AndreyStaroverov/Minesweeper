package minesweaper.back.controllers;

import minesweaper.back.models.GameInfoResponse;
import minesweaper.back.models.GameTurnRequest;
import minesweaper.back.models.NewGameRequest;
import minesweaper.back.services.MinesweaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api")
@Validated
public class MinesweaperController {

    private final MinesweaperService minesweaperService;

    public MinesweaperController(@Autowired MinesweaperService minesweaperService) {
        this.minesweaperService = minesweaperService;
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public GameInfoResponse postNewGame(@Valid @RequestBody NewGameRequest newGameRequest) {
        return minesweaperService.postNewGame(newGameRequest);
    }

    @PostMapping("/turn")
    @ResponseStatus(HttpStatus.OK)
    public GameInfoResponse postUserTurn(@Valid @RequestBody GameTurnRequest gameTurnRequest) {
        return minesweaperService.postUserTurn(gameTurnRequest);
    }
}
