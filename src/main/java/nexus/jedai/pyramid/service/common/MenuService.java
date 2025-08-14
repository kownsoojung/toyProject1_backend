package nexus.jedai.pyramid.service.common;

import java.util.List;

import jakarta.transaction.Transactional;
import nexus.jedai.pyramid.DTO.common.MenuAgentDTO;
import nexus.jedai.pyramid.entity.common.MenuAgent;

@Transactional
public interface MenuService {

    List<MenuAgentDTO> getList();
    
    default MenuAgentDTO entityToDTO(MenuAgent entity) {
        return MenuAgentDTO.builder()
                    .id(entity.getId())
                    .centerId(entity.getCenterId())
                    .depth(entity.getDepth())
                    .path(entity.getDescription())
                    .name(entity.getName())
                    .build();
    }

    default MenuAgent dtoToEntity(MenuAgentDTO dto) {
        return MenuAgent.builder()
                    .id(dto.getId())
                    .centerId(dto.getCenterId())
                    .depth(dto.getDepth())
                    .description(dto.getPath())
                    .name(dto.getName())
                    .build();
    }
}
