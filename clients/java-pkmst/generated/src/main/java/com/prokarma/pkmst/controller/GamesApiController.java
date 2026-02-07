package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.GenerationDetail;
import com.prokarma.pkmst.model.PaginatedGenerationSummaryList;
import com.prokarma.pkmst.model.PaginatedPokedexSummaryList;
import com.prokarma.pkmst.model.PaginatedVersionGroupSummaryList;
import com.prokarma.pkmst.model.PaginatedVersionSummaryList;
import com.prokarma.pkmst.model.PokedexDetail;
import com.prokarma.pkmst.model.VersionDetail;
import com.prokarma.pkmst.model.VersionGroupDetail;

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
public class GamesApiController implements GamesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public GamesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PaginatedGenerationSummaryList> generationList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedGenerationSummaryList>(objectMapper.readValue("", PaginatedGenerationSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedGenerationSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<GenerationDetail> generationRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenerationDetail>(objectMapper.readValue("", GenerationDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenerationDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedPokedexSummaryList> pokedexList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedPokedexSummaryList>(objectMapper.readValue("", PaginatedPokedexSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedPokedexSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<PokedexDetail> pokedexRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PokedexDetail>(objectMapper.readValue("", PokedexDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<PokedexDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedVersionGroupSummaryList> versionGroupList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedVersionGroupSummaryList>(objectMapper.readValue("", PaginatedVersionGroupSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedVersionGroupSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<VersionGroupDetail> versionGroupRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VersionGroupDetail>(objectMapper.readValue("", VersionGroupDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<VersionGroupDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedVersionSummaryList> versionList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedVersionSummaryList>(objectMapper.readValue("", PaginatedVersionSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedVersionSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<VersionDetail> versionRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VersionDetail>(objectMapper.readValue("", VersionDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<VersionDetail>(HttpStatus.OK);
    }

}
