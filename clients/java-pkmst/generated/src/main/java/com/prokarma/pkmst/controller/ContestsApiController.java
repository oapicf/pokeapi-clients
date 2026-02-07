package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ContestEffectDetail;
import com.prokarma.pkmst.model.ContestTypeDetail;
import com.prokarma.pkmst.model.PaginatedContestEffectSummaryList;
import com.prokarma.pkmst.model.PaginatedContestTypeSummaryList;
import com.prokarma.pkmst.model.PaginatedSuperContestEffectSummaryList;
import com.prokarma.pkmst.model.SuperContestEffectDetail;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
public class ContestsApiController implements ContestsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ContestsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PaginatedContestEffectSummaryList> contestEffectList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedContestEffectSummaryList>(objectMapper.readValue("", PaginatedContestEffectSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedContestEffectSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<ContestEffectDetail> contestEffectRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ContestEffectDetail>(objectMapper.readValue("", ContestEffectDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<ContestEffectDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedContestTypeSummaryList> contestTypeList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedContestTypeSummaryList>(objectMapper.readValue("", PaginatedContestTypeSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedContestTypeSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<ContestTypeDetail> contestTypeRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ContestTypeDetail>(objectMapper.readValue("", ContestTypeDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<ContestTypeDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedSuperContestEffectSummaryList> superContestEffectList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedSuperContestEffectSummaryList>(objectMapper.readValue("", PaginatedSuperContestEffectSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedSuperContestEffectSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<SuperContestEffectDetail> superContestEffectRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SuperContestEffectDetail>(objectMapper.readValue("", SuperContestEffectDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<SuperContestEffectDetail>(HttpStatus.OK);
    }

}
