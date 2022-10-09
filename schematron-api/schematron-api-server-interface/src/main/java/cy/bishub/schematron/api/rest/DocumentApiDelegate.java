package cy.bishub.schematron.api.rest;

import cy.bishub.schematron.api.model.Document;
import cy.bishub.schematron.api.model.DocumentList;
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
 * A delegate to be called by the {@link DocumentApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-09T00:27:57.669+02:00[Europe/Paris]")
public interface DocumentApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /document
     * Create Document
     *
     * @param document Document Request Body (required)
     * @return Document Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see DocumentApi#createDocument
     */
    default ResponseEntity<Document> createDocument(Document document) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"modifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"content\" : \"content\", \"createDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /document/{DocumentId}
     * Delete Document
     *
     * @param documentId Document Id (required)
     * @return Document Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see DocumentApi#deleteDocument
     */
    default ResponseEntity<Document> deleteDocument(Long documentId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"modifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"content\" : \"content\", \"createDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /document/{DocumentId}
     * Get Document
     *
     * @param documentId Document Id (required)
     * @return Document Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see DocumentApi#getDocument
     */
    default ResponseEntity<Document> getDocument(Long documentId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"modifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"content\" : \"content\", \"createDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /document
     * Get Document List
     *
     * @param page Page (optional, default to 1)
     * @param pageSize Page Size (optional, default to 20)
     * @param sortBy Sort By parameter (optional)
     * @param sortOrder Sort Order parameter (optional)
     * @return Document List Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see DocumentApi#getDocumentList
     */
    default ResponseEntity<DocumentList> getDocumentList(Long page,
        Long pageSize,
        List<String> sortBy,
        List<String> sortOrder) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"items\" : [ { \"name\" : \"name\", \"modifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"content\" : \"content\", \"createDate\" : \"2000-01-23T04:56:07.000+00:00\" }, { \"name\" : \"name\", \"modifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"content\" : \"content\", \"createDate\" : \"2000-01-23T04:56:07.000+00:00\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /document/{DocumentId}
     * Update Document
     *
     * @param documentId Document Id (required)
     * @param document Document Request Body (required)
     * @return Document Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     * @see DocumentApi#updateDocument
     */
    default ResponseEntity<Document> updateDocument(Long documentId,
        Document document) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"modifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"content\" : \"content\", \"createDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
