package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.BerryDetail;
import com.prokarma.pkmst.model.BerryFirmnessDetail;
import com.prokarma.pkmst.model.BerryFlavorDetail;
import com.prokarma.pkmst.model.PaginatedBerryFirmnessSummaryList;
import com.prokarma.pkmst.model.PaginatedBerryFlavorSummaryList;
import com.prokarma.pkmst.model.PaginatedBerrySummaryList;

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
public class BerriesApiController implements BerriesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BerriesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PaginatedBerryFirmnessSummaryList> berryFirmnessList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedBerryFirmnessSummaryList>(objectMapper.readValue("", PaginatedBerryFirmnessSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedBerryFirmnessSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<BerryFirmnessDetail> berryFirmnessRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BerryFirmnessDetail>(objectMapper.readValue("", BerryFirmnessDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<BerryFirmnessDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedBerryFlavorSummaryList> berryFlavorList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedBerryFlavorSummaryList>(objectMapper.readValue("", PaginatedBerryFlavorSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedBerryFlavorSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<BerryFlavorDetail> berryFlavorRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BerryFlavorDetail>(objectMapper.readValue("", BerryFlavorDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<BerryFlavorDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedBerrySummaryList> berryList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedBerrySummaryList>(objectMapper.readValue("", PaginatedBerrySummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedBerrySummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<BerryDetail> berryRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BerryDetail>(objectMapper.readValue("", BerryDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<BerryDetail>(HttpStatus.OK);
    }

}
