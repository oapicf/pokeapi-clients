package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ItemAttributeDetail;
import com.prokarma.pkmst.model.ItemCategoryDetail;
import com.prokarma.pkmst.model.ItemDetail;
import com.prokarma.pkmst.model.ItemFlingEffectDetail;
import com.prokarma.pkmst.model.ItemPocketDetail;
import com.prokarma.pkmst.model.PaginatedItemAttributeSummaryList;
import com.prokarma.pkmst.model.PaginatedItemCategorySummaryList;
import com.prokarma.pkmst.model.PaginatedItemFlingEffectSummaryList;
import com.prokarma.pkmst.model.PaginatedItemPocketSummaryList;
import com.prokarma.pkmst.model.PaginatedItemSummaryList;

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
public class ItemsApiController implements ItemsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ItemsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PaginatedItemAttributeSummaryList> itemAttributeList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedItemAttributeSummaryList>(objectMapper.readValue("", PaginatedItemAttributeSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedItemAttributeSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<ItemAttributeDetail> itemAttributeRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemAttributeDetail>(objectMapper.readValue("", ItemAttributeDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<ItemAttributeDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedItemCategorySummaryList> itemCategoryList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedItemCategorySummaryList>(objectMapper.readValue("", PaginatedItemCategorySummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedItemCategorySummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<ItemCategoryDetail> itemCategoryRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemCategoryDetail>(objectMapper.readValue("", ItemCategoryDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<ItemCategoryDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedItemFlingEffectSummaryList> itemFlingEffectList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedItemFlingEffectSummaryList>(objectMapper.readValue("", PaginatedItemFlingEffectSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedItemFlingEffectSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<ItemFlingEffectDetail> itemFlingEffectRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemFlingEffectDetail>(objectMapper.readValue("", ItemFlingEffectDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<ItemFlingEffectDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedItemSummaryList> itemList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedItemSummaryList>(objectMapper.readValue("", PaginatedItemSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedItemSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedItemPocketSummaryList> itemPocketList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedItemPocketSummaryList>(objectMapper.readValue("", PaginatedItemPocketSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedItemPocketSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<ItemPocketDetail> itemPocketRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemPocketDetail>(objectMapper.readValue("", ItemPocketDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<ItemPocketDetail>(HttpStatus.OK);
    }

    public ResponseEntity<ItemDetail> itemRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemDetail>(objectMapper.readValue("", ItemDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<ItemDetail>(HttpStatus.OK);
    }

}
