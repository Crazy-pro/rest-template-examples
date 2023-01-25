package alex.klimchuk.rest.template.examples.api.controllers;

import alex.klimchuk.rest.template.examples.api.services.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Slf4j
@Controller
public class UserController {

    private ApiService apiService;

    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"", "/", "/index"})
    public String index() {
        return "/index";
    }

    @PostMapping("/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange) {

//        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();
//
//        Integer limit = new Integer(map.get("limit").get(0));
//
//        log.debug("Received Limit value: " + limit);
//        default
//        if null or zero
//        if (limit == null || limit == 0) {
//            log.debug("Setting limit to default of 10");
//            limit = 10;
//        }
//
//        model.addAttribute("users", apiService.getUsers(limit));

        model.addAttribute("users",
                apiService.getUsers(serverWebExchange.getFormData()
                        .map(data -> Integer.valueOf(data.getFirst("limit")))));

        return "/userList";
    }
    
}
