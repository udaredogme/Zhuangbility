package com.sprhib.service;


import com.sprhib.dao.ScoreDAO;
import com.sprhib.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ScoreServiceImpl implements ScoreService
{
    @Autowired
    private ScoreDAO scoreDAO;

    public void addScore(Score score)
    {
        scoreDAO.addScore(score);
    }

    public void updateScore(Score score) {
        scoreDAO.updateScore(score);
    }

    public Score getScore(int id) {
        return scoreDAO.getScore(id);
    }

    public void deleteScore(int id) {
        scoreDAO.deleteScore(id);
    }

    public List<Score> getScores() {
        return scoreDAO.getScores();
    }
}
