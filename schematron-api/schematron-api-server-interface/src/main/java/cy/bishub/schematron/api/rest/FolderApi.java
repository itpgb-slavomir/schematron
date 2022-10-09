/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package cy.bishub.schematron.api.rest;

import cy.bishub.schematron.api.model.Folder;
import cy.bishub.schematron.api.model.FolderList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-09T00:27:57.669+02:00[Europe/Paris]")
@Validated
@Tag(name = "Folder", description = "the Folder API")
@RequestMapping("${openapi.Schematron - API - Server - Interface.base-path:}")
public interface FolderApi {

    default FolderApiDelegate getDelegate() {
        return new FolderApiDelegate() {};
    }

    /**
     * PUT /folder/{FolderName}
     * Create Folder
     *
     * @param folder Folder Request Body (required)
     * @return Folder Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "createFolder",
        tags = { "Folder" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Folder Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Folder.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authorization information is missing or invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "501", description = "Not Implemented Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/folder/{FolderName}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Folder> createFolder(
        @Parameter(name = "Folder", description = "Folder Request Body", required = true) @Valid @RequestBody Folder folder
    ) {
        return getDelegate().createFolder(folder);
    }


    /**
     * DELETE /folder
     * Delete Folder
     *
     * @param folderName Folder Name (required)
     * @return Folder Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "deleteFolder",
        tags = { "Folder" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Folder Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Folder.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authorization information is missing or invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "501", description = "Not Implemented Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/folder",
        produces = { "application/json" }
    )
    default ResponseEntity<Folder> deleteFolder(
        @NotNull @Parameter(name = "FolderName", description = "Folder Name", required = true) @Valid @RequestParam(value = "FolderName", required = true) String folderName
    ) {
        return getDelegate().deleteFolder(folderName);
    }


    /**
     * GET /folder
     * Get Folder
     *
     * @param folderName Folder Name (required)
     * @return Folder Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "getFolder",
        tags = { "Folder" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Folder Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Folder.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authorization information is missing or invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "501", description = "Not Implemented Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/folder",
        produces = { "application/json" }
    )
    default ResponseEntity<Folder> getFolder(
        @NotNull @Parameter(name = "FolderName", description = "Folder Name", required = true) @Valid @RequestParam(value = "FolderName", required = true) String folderName
    ) {
        return getDelegate().getFolder(folderName);
    }


    /**
     * GET /folder/{FolderName}
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
     */
    @Operation(
        operationId = "getFolderList",
        tags = { "Folder" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Folder List Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = FolderList.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authorization information is missing or invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "501", description = "Not Implemented Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/folder/{FolderName}",
        produces = { "application/json" }
    )
    default ResponseEntity<FolderList> getFolderList(
        @Parameter(name = "Page", description = "Page") @Valid @RequestParam(value = "Page", required = false, defaultValue = "1") Long page,
        @Parameter(name = "PageSize", description = "Page Size") @Valid @RequestParam(value = "PageSize", required = false, defaultValue = "20") Long pageSize,
        @Parameter(name = "SortBy", description = "Sort By parameter") @Valid @RequestParam(value = "SortBy", required = false) List<String> sortBy,
        @Parameter(name = "SortOrder", description = "Sort Order parameter") @Valid @RequestParam(value = "SortOrder", required = false) List<String> sortOrder
    ) {
        return getDelegate().getFolderList(page, pageSize, sortBy, sortOrder);
    }


    /**
     * PATCH /folder
     * Update Folder
     *
     * @param folderName Folder Name (required)
     * @param folder Folder Request Body (required)
     * @return Folder Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "updateFolder",
        tags = { "Folder" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Folder Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Folder.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authorization information is missing or invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "501", description = "Not Implemented Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/folder",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Folder> updateFolder(
        @NotNull @Parameter(name = "FolderName", description = "Folder Name", required = true) @Valid @RequestParam(value = "FolderName", required = true) String folderName,
        @Parameter(name = "Folder", description = "Folder Request Body", required = true) @Valid @RequestBody Folder folder
    ) {
        return getDelegate().updateFolder(folderName, folder);
    }

}
