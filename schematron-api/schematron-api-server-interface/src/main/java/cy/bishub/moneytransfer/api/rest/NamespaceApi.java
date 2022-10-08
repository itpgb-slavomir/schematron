/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package cy.bishub.moneytransfer.api.rest;

import cy.bishub.moneytransfer.api.model.Namespace;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-08T10:41:40.820500+02:00[Europe/Paris]")
@Validated
@Tag(name = "Namespace", description = "Namespace operations")
@RequestMapping("${openapi.Schematron - API - Server - Interface.base-path:/v1}")
public interface NamespaceApi {

    default NamespaceApiDelegate getDelegate() {
        return new NamespaceApiDelegate() {};
    }

    /**
     * DELETE /namespace/{NamespaceId}
     * Delete Namespace
     *
     * @param namespaceId Namespace Id (required)
     * @return Namespace Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "deleteNamespace",
        tags = { "Namespace" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Namespace Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Namespace.class))
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
        value = "/namespace/{NamespaceId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Namespace> deleteNamespace(
        @NotNull @Parameter(name = "NamespaceId", description = "Namespace Id", required = true) @Valid @RequestParam(value = "NamespaceId", required = true) Long namespaceId
    ) {
        return getDelegate().deleteNamespace(namespaceId);
    }


    /**
     * GET /namespace/{NamespaceId}
     * Get Namespace
     *
     * @param namespaceId Namespace Id (required)
     * @return Namespace Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "getNamespace",
        tags = { "Namespace" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Namespace Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Namespace.class))
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
        value = "/namespace/{NamespaceId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Namespace> getNamespace(
        @NotNull @Parameter(name = "NamespaceId", description = "Namespace Id", required = true) @Valid @RequestParam(value = "NamespaceId", required = true) Long namespaceId
    ) {
        return getDelegate().getNamespace(namespaceId);
    }


    /**
     * PATCH /namespace/{NamespaceId}
     * Update Namespace
     *
     * @param namespaceId Namespace Id (required)
     * @param namespace Namespace Request Body (required)
     * @return Namespace Response (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 403)
     *         or Not found. (status code 404)
     *         or Unexpected Error (status code 500)
     *         or Not Implemented Response (status code 501)
     */
    @Operation(
        operationId = "updateNamespace",
        tags = { "Namespace" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Namespace Response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Namespace.class))
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
        value = "/namespace/{NamespaceId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Namespace> updateNamespace(
        @NotNull @Parameter(name = "NamespaceId", description = "Namespace Id", required = true) @Valid @RequestParam(value = "NamespaceId", required = true) Long namespaceId,
        @Parameter(name = "Namespace", description = "Namespace Request Body", required = true) @Valid @RequestBody Namespace namespace
    ) {
        return getDelegate().updateNamespace(namespaceId, namespace);
    }

}
