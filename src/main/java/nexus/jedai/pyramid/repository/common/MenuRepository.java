package nexus.jedai.pyramid.repository.common;

import org.springframework.data.jpa.repository.JpaRepository;

import nexus.jedai.pyramid.entity.common.MenuAgent;
import nexus.jedai.pyramid.service.common.MenuService;

public interface MenuRepository extends JpaRepository<MenuAgent, Integer> {

}
