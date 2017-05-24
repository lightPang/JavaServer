package web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;


@RestController
@RequestMapping(value="/noAuth")
public class NoAuthController {

    private UserService userSrv;

    @Autowired
    public NoAuthController(UserService userSrv) {
        this.userSrv = userSrv;
    }

    @RequestMapping(value="/test/{id}")
    public @ResponseBody String test(@PathVariable("id") Integer id) {
        return userSrv.getUserAccountById(id);
    }
}
