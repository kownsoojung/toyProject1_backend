package toy.project.apiserver.repository.common;

import org.springframework.data.jpa.repository.JpaRepository;

import toy.project.apiserver.entity.common.MenuAgent;
import toy.project.apiserver.service.common.MenuService;

public interface MenuRepository extends JpaRepository<MenuAgent, Integer> {

}
