package cy.bishub.schematron.api.rest;

import cy.bishub.schematron.api.model.Folder;
import cy.bishub.schematron.api.model.FolderList;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link FolderApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-15T14:14:52.033+02:00[Europe/Paris]")
public interface FolderApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /folder
     * Create Folder
     *
     * @param folder Folder Request Body (required)
     * @return Folder Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see FolderApi#createFolder
     */
    default ResponseEntity<Folder> createFolder(Folder folder) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"id\" : 0, \"updated\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /folder/{FolderId}
     * Delete Folder
     *
     * @param folderId Folder Id (required)
     * @return Folder Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see FolderApi#deleteFolder
     */
    default ResponseEntity<Folder> deleteFolder(Long folderId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"id\" : 0, \"updated\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /folder/{FolderId}
     * Get Folder
     *
     * @param folderId Folder Id (required)
     * @return Folder Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see FolderApi#getFolder
     */
    default ResponseEntity<Folder> getFolder(Long folderId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"id\" : 0, \"updated\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /folder
     * Get Folder List
     *
     * @param page Page (optional, default to 1)
     * @param pageSize Page Size (optional, default to 20)
     * @param sortBy Sort By parameter (optional)
     * @param sortOrder Sort Order parameter (optional)
     * @return Folder List Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see FolderApi#getFolderList
     */
    default ResponseEntity<FolderList> getFolderList(Long page,
        Long pageSize,
        List<String> sortBy,
        List<String> sortOrder) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"items\" : [ { \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"id\" : 0, \"updated\" : \"2000-01-23T04:56:07.000+00:00\" }, { \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"id\" : 0, \"updated\" : \"2000-01-23T04:56:07.000+00:00\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /folder/{FolderId}
     * Update Folder
     *
     * @param folderId Folder Id (required)
     * @param folder Folder Request Body (required)
     * @return Folder Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see FolderApi#updateFolder
     */
    default ResponseEntity<Folder> updateFolder(Long folderId,
        Folder folder) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"created\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"id\" : 0, \"updated\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
