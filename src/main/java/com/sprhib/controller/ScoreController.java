package com.sprhib.controller;

import com.sprhib.model.Score;
import com.sprhib.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/score")
public class ScoreController
{
    @Autowired
    private ScoreService scoreService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public ModelAndView addScorePage()
    {
        ModelAndView modelAndView = new ModelAndView("add-score-form");
        modelAndView.addObject("score",new Score());
        return modelAndView;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ModelAndView addingScore(@ModelAttribute Score score)
    {
        ModelAndView modelAndView = new ModelAndView("overview");
        scoreService.addScore(score);

        String message = "Score was successfully added.";
        modelAndView.addObject("message",message);
        return modelAndView;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listOfScores()
    {
        ModelAndView modelAndView = new ModelAndView("list-of-students");
        List<Score> scores = scoreService.getScores();
        modelAndView.addObject("scores",scores);

        return modelAndView;
    }
}
