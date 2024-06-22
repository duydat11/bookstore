package Tuan6.NguyenDuyDat.repositories;


import Tuan6.NguyenDuyDat.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
