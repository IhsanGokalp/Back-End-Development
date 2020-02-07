package kg.db.jpademo.jdbc;

import kg.db.jpademo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll(){
        return jdbcTemplate.query("select * from Person",
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findById(int id){
        return jdbcTemplate.queryForObject(
                "select * from Person where id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class));
    }

    public int deleteById(int id){
        return jdbcTemplate.update(
                "delete from Person where id=?", new Object[]{id});
    }
}
