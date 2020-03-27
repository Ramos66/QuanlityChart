package com.aac.ep.qualitycharts.controller;

import com.aac.ep.qualitycharts.model.Procedure;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


@RestController
public class ProcedureController {

    @CrossOrigin
    @GetMapping("/getProcedureList")
    @RequestMapping("/getProcedureList")
    public Object getProcedureList(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("111");
        List<Procedure> list = new LinkedList<>();
        for (int i = 1; i < 50; i++) {
            Procedure procedure = new Procedure();
            procedure.setProcedureName("Procedure" + String.valueOf(i));
            Set<String> items = new LinkedHashSet<>();
            for (int j = 1; j < 1000; j++) {
                items.add("item" + String.valueOf(j));
            }
            procedure.setItemList(items);
            list.add(procedure);
        }
        System.out.println("list长度："+list.size());
        return list;
    }

}
