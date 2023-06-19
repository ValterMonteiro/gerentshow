package br.edu.ifms.gerentshow.musica;

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
public interface MusicaMapper extends ISimpleMapper<Musica, MusicaDto, MusicaForm> {

    public static final MusicaMapper INSTANCE = Mappers.getMapper(MusicaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Musica formToEntity(MusicaForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Musica update(MusicaForm dto, @MappingTarget Musica entity);

    
}

