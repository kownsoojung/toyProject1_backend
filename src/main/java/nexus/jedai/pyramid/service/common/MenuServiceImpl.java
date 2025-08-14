package nexus.jedai.pyramid.service.common;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import nexus.jedai.pyramid.DTO.common.MenuAgentDTO;
import nexus.jedai.pyramid.mapper.common.MenuMapper;

@Service
@Log4j2
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{
    
    private final MenuMapper mapper;
    @Override
    public List<MenuAgentDTO> getList() {
        return mapper.getList();
    }

}
