import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Special;
import com.scs.soft.zhihu.api.mapper.SpecialMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes= ZhihuApiApplication.class)
@RunWith(SpringRunner.class)
public class SpecialMapperTest {
    @Resource
    private SpecialMapper specialMapper;

    @Test
    void selectAll(){
        List<Map> specials =specialMapper.selectAll();
        specials.forEach(System.out::println);
    }
    @Test
    void selectRecent(){
        List<Special> specials=specialMapper.selectRecent();
        specials.forEach(System.out::println);
    }

}
