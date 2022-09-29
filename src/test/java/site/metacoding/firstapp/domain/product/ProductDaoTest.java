package site.metacoding.firstapp.domain.product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductDaoTest {

    @Autowired
    private ProductDao productDao;

    // 단위 테스트 때 new되면 빈 생성자를 넣기 때문에 생성자 주입X
    @Test
    public void findById_test() {

        // given : 받아야 할 것
        Integer productId = 1;

        // when : 테스트 (영속화 - DB에서 가져옴)
        Product productPS = productDao.findById(productId);

        assertEquals("바나나", productPS.getProductName());
    }

}
