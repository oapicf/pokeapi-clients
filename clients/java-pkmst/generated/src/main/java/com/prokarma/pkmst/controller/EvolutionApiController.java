package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.EvolutionChainDetail;
import com.prokarma.pkmst.model.EvolutionTriggerDetail;
import com.prokarma.pkmst.model.PaginatedEvolutionChainSummaryList;
import com.prokarma.pkmst.model.PaginatedEvolutionTriggerSummaryList;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T15:23:15.032724200Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
public class EvolutionApiController implements EvolutionApi {
    private final ObjectMapper objectMapper;
@Autowired
    public EvolutionApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PaginatedEvolutionChainSummaryList> evolutionChainList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedEvolutionChainSummaryList>(objectMapper.readValue("", PaginatedEvolutionChainSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedEvolutionChainSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<EvolutionChainDetail> evolutionChainRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EvolutionChainDetail>(objectMapper.readValue("", EvolutionChainDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<EvolutionChainDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedEvolutionTriggerSummaryList> evolutionTriggerList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedEvolutionTriggerSummaryList>(objectMapper.readValue("", PaginatedEvolutionTriggerSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedEvolutionTriggerSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<EvolutionTriggerDetail> evolutionTriggerRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EvolutionTriggerDetail>(objectMapper.readValue("", EvolutionTriggerDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<EvolutionTriggerDetail>(HttpStatus.OK);
    }

}
