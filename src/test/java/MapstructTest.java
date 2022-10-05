import car.Car;
import car.CarDto;
import car.CarMapper;
import document.Document;
import document.DocumentDTO;
import document.DocumentMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

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

	@Test
	void givenDocumentEntityToDocument_whenMaps_thenCorrect(){
		Document entity = new Document();
		entity.setId(1);
		entity.setText("text");
		entity.setTitle("title");
		entity.setModificationTime(new Date());

		DocumentDTO documentDTO = DocumentMapper.INSTANCE.documentToDocumentDTO(entity);
	}
}
