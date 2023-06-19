package br.edu.ifms.gerentshow.show;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 07041626105
 */
@Mapper(
        config = BaseObjectMapper.class
)
public interface ShowMapper extends ISimpleMapper<Show, ShowDto, ShowForm> {

    public static final ShowMapper INSTANCE = Mappers.getMapper(ShowMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Show formToEntity(ShowForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Show update(ShowForm dto, @MappingTarget Show entity);

    
}
