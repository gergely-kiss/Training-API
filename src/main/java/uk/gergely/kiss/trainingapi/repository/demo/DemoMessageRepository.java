package uk.gergely.kiss.trainingapi.repository.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uk.gergely.kiss.trainingapi.model.demo.DemoMessageVO;

@Repository
public class DemoMessageRepository {

    private final JdbcTemplate jdbcTemplate;

    private final String SELECT_ALL_DEMOMESSAGE_QUERY = "SELECT * FROM demo_message";

    private final Logger LOGGER = Logger.getLogger(DemoMessageRepository.class+"");
    @Autowired
    public DemoMessageRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<DemoMessageVO> getDemoMessageVOList() {

        List<DemoMessageVO> demoMessageVOList = new ArrayList<>();

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(SELECT_ALL_DEMOMESSAGE_QUERY);
        LOGGER.info(rows.toString());
        for (Map<String, Object> row : rows) {
            DemoMessageVO demoMessageVO = new DemoMessageVO();
            demoMessageVO.setId((int) (row.get("id")));
            demoMessageVO.setDemoMessage((String) row.get("message"));
            demoMessageVOList.add(demoMessageVO);
        }
        return demoMessageVOList;
    }
}
