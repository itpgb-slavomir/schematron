package cy.bishub.schematron.api.utils;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

public class PageableUtil {

	public static Pageable createPageRequest(Long page, Long pageSize, List<String> sortBy,
			List<String> sortOrder) {

		Sort sort = Sort.by(new Order[0]);

		if (sortBy != null) {

			for (int i = 0; i < sortBy.size(); i++) {
				sort.and(Sort.by(sortBy.get(i)));
				if (sortOrder.get(i) == "ASC") {
					sort.ascending();
				} else if (sortOrder.get(i) == "DESC") {
					sort.descending();
				}
			}
		}

		Pageable pageRequest = PageRequest.of(1, 1000, sort);
		return pageRequest;
	}
}
