package cy.bishub.schematron.api.rest;

import cy.bishub.schematron.api.model.Attribute;
import cy.bishub.schematron.api.model.AttributeList;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-15T15:13:55.822+02:00[Europe/Paris]")
@Controller
public class AttributeApiController implements AttributeApi {

    private final AttributeApiDelegate delegate;

    public AttributeApiController(@Autowired(required = false) AttributeApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new AttributeApiDelegate() {});
    }

    @Override
    public AttributeApiDelegate getDelegate() {
        return delegate;
    }

}
