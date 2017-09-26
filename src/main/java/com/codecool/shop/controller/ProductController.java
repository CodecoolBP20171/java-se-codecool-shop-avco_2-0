package com.codecool.shop.controller;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.dao.implementation.ProductCategoryDaoMem;
import com.codecool.shop.dao.implementation.ProductDaoMem;

import spark.Request;
import spark.Response;
import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductController {

    public static String renderProducts(Request req, Response res) {
        ProductDao productDataStore = ProductDaoMem.getInstance();
        ProductCategoryDao productCategoryDataStore = ProductCategoryDaoMem.getInstance();

        Map<String, Object> params = new HashMap<>();
        params.put("categories", productCategoryDataStore.getAll());
        if (req.params("categoryID") != null) {
            int categoryID = Integer.parseInt(req.params("categoryID"));
            params.put("category", productCategoryDataStore.find(categoryID));
            params.put("products", productDataStore.getBy(productCategoryDataStore.find(categoryID)));

        } else {
            params.put("category", productCategoryDataStore.find(1));
            params.put("products", productDataStore.getBy(productCategoryDataStore.find(1)));
        }
        return renderTemplate(params, "product/index");
    }

    private static String renderTemplate(Map model, String template) {
        return new ThymeleafTemplateEngine().render(new ModelAndView(model, template));
    }

}
