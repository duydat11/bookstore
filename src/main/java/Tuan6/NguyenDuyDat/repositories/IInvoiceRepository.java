package Tuan6.NguyenDuyDat.repositories;
import Tuan6.NguyenDuyDat.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IInvoiceRepository extends JpaRepository<Invoice,
        Long>{
}