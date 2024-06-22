package Tuan6.NguyenDuyDat.repositories;

import Tuan6.NguyenDuyDat.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IBookRepository extends JpaRepository<Book,Long> {



}
