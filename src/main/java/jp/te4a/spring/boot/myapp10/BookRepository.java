package jp.te4a.spring.boot.myapp10;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookRepository extends JpaRepository<BookBean, Integer>{
}