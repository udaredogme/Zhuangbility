package com.sprhib.dao;


import com.sprhib.model.Score;

import java.util.List;

public interface ScoreDAO
{
    public void addScore(Score score);
    public void updateScore(Score score);
    public Score getScore(int id);
    public void deleteScore(int id);
    public List<Score> getScores();
}
