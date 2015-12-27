package com.sprhib.dao;

import com.sprhib.model.Score;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScoreDAOImpl implements ScoreDAO
{
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }

    public void addScore(Score score)
    {
        getCurrentSession().save(score);
    }

    public void updateScore(Score score)
    {
        Score scoreToUpdate = getScore(score.getId());
        scoreToUpdate.setStudent(score.getStudent());
        scoreToUpdate.setTeacher(score.getTeacher());
        scoreToUpdate.setCourse(score.getCourse());
        scoreToUpdate.setValue(score.getValue());
    }

    public Score getScore(int id) {
        Score score = (Score) getCurrentSession().get(Score.class,id);
        return score;
    }

    public void deleteScore(int id) {
        Score score = getScore(id);
        if(score != null)
        {
            getCurrentSession().delete(score);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Score> getScores()
    {
        return getCurrentSession().createQuery("from Score").list();
    }
}
