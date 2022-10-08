package cy.bishub.moneytransfer.api.rest;

import cy.bishub.moneytransfer.api.model.Document;
import cy.bishub.moneytransfer.api.model.DocumentList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-08T10:41:40.820500+02:00[Europe/Paris]")
@Controller
public class DocumentApiController implements DocumentApi {

    private final DocumentApiDelegate delegate;

    public DocumentApiController(@Autowired(required = false) DocumentApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new DocumentApiDelegate() {});
    }

    @Override
    public DocumentApiDelegate getDelegate() {
        return delegate;
    }

}
