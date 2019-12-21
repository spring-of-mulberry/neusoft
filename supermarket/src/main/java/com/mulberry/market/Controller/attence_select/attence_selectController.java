package com.mulberry.market.Controller.attence_select;

import com.mulberry.market.Entity.attenceinfo;
import com.mulberry.market.Service.attence_select.attence_selectService;
import com.mulberry.market.Service.attence_select.attence_selectServiceImpl;

import java.util.List;

public class attence_selectController {
    private attence_selectService attence_selectService = new attence_selectServiceImpl();
    public List<attenceinfo> attence_selece(){
        return attence_selectService.attence_select();
    }
}
