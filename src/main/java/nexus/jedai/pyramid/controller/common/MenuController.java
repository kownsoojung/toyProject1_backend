package nexus.jedai.pyramid.controller.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nexus.jedai.pyramid.DTO.common.MenuAgentDTO;
import nexus.jedai.pyramid.repository.common.MenuRepository;
import nexus.jedai.pyramid.service.common.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService service;

    @Autowired
    MenuRepository repository;
    @GetMapping
    public List<MenuAgentDTO> getList() {
        
        List<MenuAgentDTO> result = service.getList();

        return result;
    }
}
