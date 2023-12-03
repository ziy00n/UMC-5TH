package umc.spring.service.StoreService;

import umc.spring.domain.Review;
import umc.spring.web.dto.StoreRequestDTO;

public interface StoreCommandService {
    Review createReview(Long storeId, Long memberId, StoreRequestDTO.ReviewDTO request);
}
