package com.shenchao.controller.admin;

import com.github.pagehelper.PageInfo;
import com.shenchao.entity.BbsProduct;
import com.shenchao.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by shenchao on 2017/2/12.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/product/list.do")
    public String list(BbsProduct product, @RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "6") Integer pageSize, Model model){
        PageInfo<BbsProduct> pageInfo = productService.findProducts(pageNo, pageSize, product);
        model.addAttribute("pageInfo", pageInfo);
        return "back_page/product/list";
    }
}
