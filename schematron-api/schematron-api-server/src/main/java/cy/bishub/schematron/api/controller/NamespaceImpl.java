package cy.bishub.schematron.api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.google.common.collect.Lists;
import cy.bishub.schematron.api.model.Namespace;
import cy.bishub.schematron.api.model.NamespaceList;
import cy.bishub.schematron.api.repository.NamespaceRepository;
import cy.bishub.schematron.api.rest.NamespaceApiDelegate;
import cy.bishub.schematron.api.utils.PageableUtil;

@Service
public class NamespaceImpl implements NamespaceApiDelegate {

	private NamespaceRepository repository;

	@Override
	public ResponseEntity<Namespace> createNamespace(Namespace namespace) {

		return new ResponseEntity<Namespace>(repository.save(namespace), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Namespace> deleteNamespace(Long namespaceId) {

		Optional<Namespace> item = repository.findById(namespaceId);

		if (item.isPresent()) {
			repository.deleteById(namespaceId);
			return new ResponseEntity<>(item.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public ResponseEntity<Namespace> getNamespace(Long namespaceId) {
		Optional<Namespace> item = repository.findById(namespaceId);

		if (item.isPresent()) {
			return new ResponseEntity<>(item.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public ResponseEntity<NamespaceList> getNamespaceList(Long page, Long pageSize, List<String> sortBy,
			List<String> sortOrder) {
		NamespaceList list = new NamespaceList();

		list.setItemsTotalCount(this.repository.count());
		list.setItems(Lists.newArrayList(
				this.repository.findAll(PageableUtil.createPageRequest(page, pageSize, sortBy, sortOrder))));

		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Namespace> updateNamespace(Long namespaceId, Namespace namespace) {
		return new ResponseEntity<>(repository.save(namespace), HttpStatus.OK);
	}

}
