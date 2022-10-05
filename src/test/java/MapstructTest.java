import car.Car;
import car.CarDto;
import car.CarMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MapstructTest {

	@Test
	void givenCarEntitytoCar_whenMaps_thenCorrect() {
		Car entity = new Car();
		entity.setId(1);
		entity.setName("MyCar");

		CarDto carDto = CarMapper.INSTANCE.carToCarDto(entity);

		Assertions.assertEquals(entity.getId(), carDto.getId());
		Assertions.assertEquals(entity.getName(), carDto.getName());
	}
}
