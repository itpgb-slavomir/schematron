package cy.bishub.schematron.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import cy.bishub.schematron.api.model.Folder;
import cy.bishub.schematron.api.model.FolderList;
import cy.bishub.schematron.api.repository.FolderRepository;
import cy.bishub.schematron.api.rest.FolderApiDelegate;

public class FolderController implements FolderApiDelegate {

	private FolderRepository repository;

	@Override
	public ResponseEntity<Folder> createFolder(Folder folder) {
		return new ResponseEntity<Folder>(repository.save(folder), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Folder> deleteFolder(String folderName) {
		// TODO Auto-generated method stub
		return FolderApiDelegate.super.deleteFolder(folderName);
	}

	@Override
	public ResponseEntity<Folder> getFolder(String folderName) {
		// TODO Auto-generated method stub
		return FolderApiDelegate.super.getFolder(folderName);
	}

	@Override
	public ResponseEntity<FolderList> getFolderList(Long page, Long pageSize, List<String> sortBy,
			List<String> sortOrder) {
		// TODO Auto-generated method stub
		return FolderApiDelegate.super.getFolderList(page, pageSize, sortBy, sortOrder);
	}

	@Override
	public ResponseEntity<Folder> updateFolder(String folderName, Folder folder) {
		// TODO Auto-generated method stub
		return FolderApiDelegate.super.updateFolder(folderName, folder);
	}

}
