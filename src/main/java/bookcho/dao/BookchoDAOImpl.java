package bookcho.dao;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class BookchoDAOImpl implements  BookchoDAO{

    private EntityManager entityManager;

}
