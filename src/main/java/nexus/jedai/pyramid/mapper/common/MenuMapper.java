package nexus.jedai.pyramid.mapper.common;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import nexus.jedai.pyramid.DTO.common.MenuAgentDTO;

@Mapper
public interface MenuMapper {

    public List<MenuAgentDTO> getList();

}
