package toy.project.apiserver.mapper.common;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import toy.project.apiserver.DTO.common.MenuAgentDTO;

@Mapper
public interface MenuMapper {

    public List<MenuAgentDTO> getList();

}
