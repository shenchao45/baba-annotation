package com.shenchao.controller.admin;

import com.github.pagehelper.PageInfo;
import com.shenchao.entity.Brand;
import com.shenchao.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shenchao on 2017/2/11.
 */
@Controller
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping("/brand/list.do")
    public String list(Brand brand, @RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "6") Integer pageSize, Model model){
        PageInfo<Brand> pageInfo = brandService.getBrandListWithPage(pageNo, pageSize, brand);
        model.addAttribute("pageInfo", pageInfo);
        return "back_page/brand/list";
    }

    @RequestMapping("/brand/toAdd.do")
    public String toAdd(){
        return "back_page/brand/add";
    }
    @RequestMapping("/brand/toEdit.do")
    public String toEdit(Integer id,Model model){
        Brand brand = brandService.findById(id);
        model.addAttribute("brand", brand);
        return "back_page/brand/edit";
    }

    @PostMapping("/brand/add.do")
    public String add(Brand brand){
        brandService.save(brand);
        return "redirect:/brand/list.do";
    }

    @RequestMapping("/brand/delete.do")
    public String delete(Integer id) {
        brandService.delete(id);
        return "redirect:/brand/list.do";
    }
    @RequestMapping("/brand/deletes.do")
    public String deletes(Integer[] ids) {
        brandService.deleteByIds(new ArrayList<Integer>(Arrays.asList(ids)));
        return "redirect:/brand/list.do";
    }
    @RequestMapping("/brand/edit.do")
    public String edit(Brand brand) {
        brandService.update(brand);
        return "redirect:/brand/list.do";
    }

}
