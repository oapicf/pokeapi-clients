package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.MoveBattleStyleDetail;
import com.prokarma.pkmst.model.MoveDetail;
import com.prokarma.pkmst.model.MoveLearnMethodDetail;
import com.prokarma.pkmst.model.MoveMetaAilmentDetail;
import com.prokarma.pkmst.model.MoveMetaCategoryDetail;
import com.prokarma.pkmst.model.MoveTargetDetail;
import com.prokarma.pkmst.model.PaginatedMoveBattleStyleSummaryList;
import com.prokarma.pkmst.model.PaginatedMoveLearnMethodSummaryList;
import com.prokarma.pkmst.model.PaginatedMoveMetaAilmentSummaryList;
import com.prokarma.pkmst.model.PaginatedMoveMetaCategorySummaryList;
import com.prokarma.pkmst.model.PaginatedMoveSummaryList;
import com.prokarma.pkmst.model.PaginatedMoveTargetSummaryList;

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
public class MovesApiController implements MovesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public MovesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PaginatedMoveMetaAilmentSummaryList> moveAilmentList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedMoveMetaAilmentSummaryList>(objectMapper.readValue("", PaginatedMoveMetaAilmentSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedMoveMetaAilmentSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<MoveMetaAilmentDetail> moveAilmentRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MoveMetaAilmentDetail>(objectMapper.readValue("", MoveMetaAilmentDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<MoveMetaAilmentDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedMoveBattleStyleSummaryList> moveBattleStyleList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedMoveBattleStyleSummaryList>(objectMapper.readValue("", PaginatedMoveBattleStyleSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedMoveBattleStyleSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<MoveBattleStyleDetail> moveBattleStyleRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MoveBattleStyleDetail>(objectMapper.readValue("", MoveBattleStyleDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<MoveBattleStyleDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedMoveMetaCategorySummaryList> moveCategoryList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedMoveMetaCategorySummaryList>(objectMapper.readValue("", PaginatedMoveMetaCategorySummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedMoveMetaCategorySummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<MoveMetaCategoryDetail> moveCategoryRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MoveMetaCategoryDetail>(objectMapper.readValue("", MoveMetaCategoryDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<MoveMetaCategoryDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedMoveLearnMethodSummaryList> moveLearnMethodList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedMoveLearnMethodSummaryList>(objectMapper.readValue("", PaginatedMoveLearnMethodSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedMoveLearnMethodSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<MoveLearnMethodDetail> moveLearnMethodRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MoveLearnMethodDetail>(objectMapper.readValue("", MoveLearnMethodDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<MoveLearnMethodDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedMoveSummaryList> moveList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedMoveSummaryList>(objectMapper.readValue("", PaginatedMoveSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedMoveSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<MoveDetail> moveRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MoveDetail>(objectMapper.readValue("", MoveDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<MoveDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedMoveTargetSummaryList> moveTargetList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedMoveTargetSummaryList>(objectMapper.readValue("", PaginatedMoveTargetSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedMoveTargetSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<MoveTargetDetail> moveTargetRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MoveTargetDetail>(objectMapper.readValue("", MoveTargetDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<MoveTargetDetail>(HttpStatus.OK);
    }

}
