package cy.bishub.schematron.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import cy.bishub.schematron.api.model.Folder;
import cy.bishub.schematron.api.model.FolderList;
import cy.bishub.schematron.api.model.Namespace;
import cy.bishub.schematron.api.model.NamespaceList;
import cy.bishub.schematron.api.repository.FolderRepository;
import cy.bishub.schematron.api.rest.FolderApiDelegate;
import cy.bishub.schematron.api.utils.PageableUtil;

@Service
public class FolderController implements FolderApiDelegate {

	@Autowired
	private FolderRepository repository;

	@Override
	public ResponseEntity<FolderList> getFolderList(Long page, Long pageSize, List<String> sortBy,
			List<String> sortOrder) {

		FolderList list = new FolderList();
		list.setItemsTotalCount(repository.count());
		list.setItems(Lists
				.newArrayList(repository.findAll(PageableUtil.createPageRequest(page, pageSize, sortBy, sortOrder))));

		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Folder> deleteFolder(Long folderId) {
		Optional<Folder> item = repository.findById(folderId);

		if (item.isPresent()) {
			repository.deleteById(folderId);
			return new ResponseEntity<>(item.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public ResponseEntity<Folder> getFolder(Long folderId) {
		Optional<Folder> item = repository.findById(folderId);

		if (item.isPresent()) {
			return new ResponseEntity<>(item.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public ResponseEntity<Folder> updateFolder(Long folderId, Folder folder) {
		// TODO Auto-generated method stub
		return FolderApiDelegate.super.updateFolder(folderId, folder);
	}

	@Override
	public ResponseEntity<Folder> createFolder(Folder folder) {
		return new ResponseEntity<>(repository.save(folder), HttpStatus.OK);
	}

}
