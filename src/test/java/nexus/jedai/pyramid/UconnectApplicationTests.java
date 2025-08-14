package nexus.jedai.pyramid;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;
import nexus.jedai.pyramid.DTO.common.MenuAgentDTO;
import nexus.jedai.pyramid.service.common.MenuService;

@SpringBootTest
@Log4j2
class UconnectApplicationTests {

	@Autowired
	private MenuService service;
	@Test
	void contextLoads() {
		List<MenuAgentDTO> menus = service.getList();
		log.info(menus.size());
	}

}
