package car;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CarMapper {

	@Mapping(target =  "manufacturer", source = "make")
	@Mapping(target = "seatCount", source = "numberOfSeats")
	CarDto carToCarDto(Car car);
}
