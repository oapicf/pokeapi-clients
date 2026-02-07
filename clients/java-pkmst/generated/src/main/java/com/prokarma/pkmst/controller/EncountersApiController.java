package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.EncounterConditionDetail;
import com.prokarma.pkmst.model.EncounterConditionValueDetail;
import com.prokarma.pkmst.model.EncounterMethodDetail;
import com.prokarma.pkmst.model.PaginatedEncounterConditionSummaryList;
import com.prokarma.pkmst.model.PaginatedEncounterConditionValueSummaryList;
import com.prokarma.pkmst.model.PaginatedEncounterMethodSummaryList;

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
public class EncountersApiController implements EncountersApi {
    private final ObjectMapper objectMapper;
@Autowired
    public EncountersApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PaginatedEncounterConditionSummaryList> encounterConditionList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedEncounterConditionSummaryList>(objectMapper.readValue("", PaginatedEncounterConditionSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedEncounterConditionSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<EncounterConditionDetail> encounterConditionRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EncounterConditionDetail>(objectMapper.readValue("", EncounterConditionDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<EncounterConditionDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedEncounterConditionValueSummaryList> encounterConditionValueList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedEncounterConditionValueSummaryList>(objectMapper.readValue("", PaginatedEncounterConditionValueSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedEncounterConditionValueSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<EncounterConditionValueDetail> encounterConditionValueRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EncounterConditionValueDetail>(objectMapper.readValue("", EncounterConditionValueDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<EncounterConditionValueDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedEncounterMethodSummaryList> encounterMethodList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedEncounterMethodSummaryList>(objectMapper.readValue("", PaginatedEncounterMethodSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedEncounterMethodSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<EncounterMethodDetail> encounterMethodRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EncounterMethodDetail>(objectMapper.readValue("", EncounterMethodDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<EncounterMethodDetail>(HttpStatus.OK);
    }

}
