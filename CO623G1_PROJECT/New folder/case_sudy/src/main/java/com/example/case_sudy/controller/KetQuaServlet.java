package com.example.case_sudy.controller;

import com.example.case_sudy.model.KetQua;
import com.example.case_sudy.repository.IKetQuaRepository;
import com.example.case_sudy.service.IKetQuaService;
import com.example.case_sudy.service.KetQuaService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ketQuaServlet", value = "/ket-qua")
public class KetQuaServlet extends HttpServlet {
    private IKetQuaService ketQuaService = new KetQuaService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dsKetQua(request,response);
    }
    private void dsKetQua(HttpServletRequest request, HttpServletResponse response) {
        List<KetQua> dsKetQua = ketQuaService.getAll();
        request.setAttribute("tongDiem",ketQuaService.score());
        request.setAttribute("ketQua",dsKetQua);
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("/ket-qua.jsp");
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
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "ketqua":
                ketQuaDe(request,response);
            default:

        }
    }

    private void ketQuaDe(HttpServletRequest request, HttpServletResponse response) {
        String tenCauHoi = request.getParameter("tenCauHoi");
        String dapAnChon = request.getParameter("tenCauHoi");
        String dapAnDung = request.getParameter("tenCauHoi");
        int diem = Integer.parseInt(request.getParameter("diem"));
        KetQua ketQua = new KetQua(tenCauHoi,dapAnChon,dapAnDung,diem);
        ketQuaService.create(ketQua);
    }

}
