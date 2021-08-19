package hotelone;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaymentHistoryRepository extends PagingAndSortingRepository<PaymentHistory, Long>{
	PaymentHistory findByOrderId(Long orderId);
}