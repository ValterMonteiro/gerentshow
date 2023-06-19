package br.edu.ifms.gerentshow.instrumento;

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
public interface InstrumentoMapper extends ISimpleMapper<Instrumento, InstrumentoDto, InstrumentoForm> {

    public static final InstrumentoMapper INSTANCE = Mappers.getMapper(InstrumentoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Instrumento formToEntity(InstrumentoForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Instrumento update(InstrumentoForm dto, @MappingTarget Instrumento entity);

    
}
