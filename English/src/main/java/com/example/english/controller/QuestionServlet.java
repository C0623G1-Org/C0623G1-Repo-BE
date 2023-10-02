package com.example.english.controller;

import com.example.english.model.Question;
import com.example.english.service.IQuestionService;
import com.example.english.service.QuestionService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QuestionServlet", value = "/question-servlet")
public class QuestionServlet extends HttpServlet {
    private final IQuestionService questionService = new QuestionService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        action = action == null ? "" : action;
        switch (action) {
            case "creat_practice_list" :
                createPracticeList(request,response);
                break;
            default:
                showQuestionList(request,response);
                break;
        }
    }

    private void showQuestionList(HttpServletRequest request, HttpServletResponse response) {
        List<Question> questionList = questionService.findAllQuestion();
        request.setAttribute("questionList",questionList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list-question.jsp");

        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createPracticeList(HttpServletRequest request, HttpServletResponse response) {
        List<Question> questionList = questionService.createPracticeList();
        request.setAttribute("questionList",questionList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("practice-list.jsp");

        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
