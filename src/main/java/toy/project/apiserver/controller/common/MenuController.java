package toy.project.apiserver.controller.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import toy.project.apiserver.DTO.common.MenuAgentDTO;
import toy.project.apiserver.repository.common.MenuRepository;
import toy.project.apiserver.service.common.MenuService;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    MenuService service;

    @Autowired
    MenuRepository repository;
    
    @GetMapping("/getList")
    public List<MenuAgentDTO> getList() {
        
        List<MenuAgentDTO> result = service.getList();

        return result;
    }
}
