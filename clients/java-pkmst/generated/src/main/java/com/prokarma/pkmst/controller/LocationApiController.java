package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.LocationAreaDetail;
import com.prokarma.pkmst.model.LocationDetail;
import com.prokarma.pkmst.model.PaginatedLocationAreaSummaryList;
import com.prokarma.pkmst.model.PaginatedLocationSummaryList;
import com.prokarma.pkmst.model.PaginatedPalParkAreaSummaryList;
import com.prokarma.pkmst.model.PaginatedRegionSummaryList;
import com.prokarma.pkmst.model.PalParkAreaDetail;
import com.prokarma.pkmst.model.RegionDetail;

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
public class LocationApiController implements LocationApi {
    private final ObjectMapper objectMapper;
@Autowired
    public LocationApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PaginatedLocationAreaSummaryList> locationAreaList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedLocationAreaSummaryList>(objectMapper.readValue("", PaginatedLocationAreaSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedLocationAreaSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<LocationAreaDetail> locationAreaRetrieve(@ApiParam(value = "A unique integer value identifying this location area.",required=true ) @PathVariable("id") Integer id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LocationAreaDetail>(objectMapper.readValue("", LocationAreaDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<LocationAreaDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedLocationSummaryList> locationList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedLocationSummaryList>(objectMapper.readValue("", PaginatedLocationSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedLocationSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<LocationDetail> locationRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LocationDetail>(objectMapper.readValue("", LocationDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<LocationDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedPalParkAreaSummaryList> palParkAreaList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedPalParkAreaSummaryList>(objectMapper.readValue("", PaginatedPalParkAreaSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedPalParkAreaSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<PalParkAreaDetail> palParkAreaRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PalParkAreaDetail>(objectMapper.readValue("", PalParkAreaDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<PalParkAreaDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedRegionSummaryList> regionList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedRegionSummaryList>(objectMapper.readValue("", PaginatedRegionSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedRegionSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<RegionDetail> regionRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RegionDetail>(objectMapper.readValue("", RegionDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<RegionDetail>(HttpStatus.OK);
    }

}
