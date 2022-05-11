package builderDesignPattern;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//@Builder lombok ile geliyor ve buraya ekliyoruz.
public class ProductLombok {
	private Long id;
	private String name;
	private LocalDateTime date;
	private Boolean inStock;
	private String description;
	private BigDecimal price;
}

//lombok bize bunu arka planda generate edip bizim için otomatik oluşturuyor.
// lombok ile yapılmış hali.
//lomboku dependency olarak ekleniyor.