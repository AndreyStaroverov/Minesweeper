package minesweaper.back.services;

import minesweaper.back.models.GameInfoResponse;
import minesweaper.back.models.GameTurnRequest;
import minesweaper.back.models.NewGameRequest;
import minesweaper.back.repository.MinesweaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MinesweaperService {

    private final MinesweaperRepository minesweaperRepository;

    public MinesweaperService(@Autowired MinesweaperRepository minesweaperRepository) {
        this.minesweaperRepository = minesweaperRepository;
    }

    public GameInfoResponse postNewGame(NewGameRequest newGameRequest) {
    }

    public GameInfoResponse postUserTurn(GameTurnRequest gameTurnRequest) {
    }
}
