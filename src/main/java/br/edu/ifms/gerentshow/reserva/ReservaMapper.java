package br.edu.ifms.gerentshow.reserva;
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
public interface ReservaMapper extends ISimpleMapper<Reserva, ReservaDto, ReservaForm> {

    public static final ReservaMapper INSTANCE = Mappers.getMapper(ReservaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Reserva formToEntity(ReservaForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Reserva update(ReservaForm dto, @MappingTarget Reserva entity);

    
}
