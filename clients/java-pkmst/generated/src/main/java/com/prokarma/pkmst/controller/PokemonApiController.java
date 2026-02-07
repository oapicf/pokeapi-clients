package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AbilityDetail;
import com.prokarma.pkmst.model.CharacteristicDetail;
import com.prokarma.pkmst.model.EggGroupDetail;
import com.prokarma.pkmst.model.GenderDetail;
import com.prokarma.pkmst.model.GrowthRateDetail;
import com.prokarma.pkmst.model.MoveDamageClassDetail;
import com.prokarma.pkmst.model.NatureDetail;
import com.prokarma.pkmst.model.PaginatedAbilitySummaryList;
import com.prokarma.pkmst.model.PaginatedCharacteristicSummaryList;
import com.prokarma.pkmst.model.PaginatedEggGroupSummaryList;
import com.prokarma.pkmst.model.PaginatedGenderSummaryList;
import com.prokarma.pkmst.model.PaginatedGrowthRateSummaryList;
import com.prokarma.pkmst.model.PaginatedMoveDamageClassSummaryList;
import com.prokarma.pkmst.model.PaginatedNatureSummaryList;
import com.prokarma.pkmst.model.PaginatedPokeathlonStatSummaryList;
import com.prokarma.pkmst.model.PaginatedPokemonColorSummaryList;
import com.prokarma.pkmst.model.PaginatedPokemonFormSummaryList;
import com.prokarma.pkmst.model.PaginatedPokemonHabitatSummaryList;
import com.prokarma.pkmst.model.PaginatedPokemonShapeSummaryList;
import com.prokarma.pkmst.model.PaginatedPokemonSpeciesSummaryList;
import com.prokarma.pkmst.model.PaginatedPokemonSummaryList;
import com.prokarma.pkmst.model.PaginatedStatSummaryList;
import com.prokarma.pkmst.model.PaginatedTypeSummaryList;
import com.prokarma.pkmst.model.PokeathlonStatDetail;
import com.prokarma.pkmst.model.PokemonColorDetail;
import com.prokarma.pkmst.model.PokemonDetail;
import com.prokarma.pkmst.model.PokemonFormDetail;
import com.prokarma.pkmst.model.PokemonHabitatDetail;
import com.prokarma.pkmst.model.PokemonShapeDetail;
import com.prokarma.pkmst.model.PokemonSpeciesDetail;
import com.prokarma.pkmst.model.StatDetail;
import com.prokarma.pkmst.model.TypeDetail;

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
public class PokemonApiController implements PokemonApi {
    private final ObjectMapper objectMapper;
@Autowired
    public PokemonApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PaginatedAbilitySummaryList> abilityList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedAbilitySummaryList>(objectMapper.readValue("", PaginatedAbilitySummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedAbilitySummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<AbilityDetail> abilityRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AbilityDetail>(objectMapper.readValue("", AbilityDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<AbilityDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedCharacteristicSummaryList> characteristicList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedCharacteristicSummaryList>(objectMapper.readValue("", PaginatedCharacteristicSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedCharacteristicSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<CharacteristicDetail> characteristicRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CharacteristicDetail>(objectMapper.readValue("", CharacteristicDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<CharacteristicDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedEggGroupSummaryList> eggGroupList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedEggGroupSummaryList>(objectMapper.readValue("", PaginatedEggGroupSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedEggGroupSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<EggGroupDetail> eggGroupRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EggGroupDetail>(objectMapper.readValue("", EggGroupDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<EggGroupDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedGenderSummaryList> genderList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedGenderSummaryList>(objectMapper.readValue("", PaginatedGenderSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedGenderSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<GenderDetail> genderRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GenderDetail>(objectMapper.readValue("", GenderDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<GenderDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedGrowthRateSummaryList> growthRateList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedGrowthRateSummaryList>(objectMapper.readValue("", PaginatedGrowthRateSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedGrowthRateSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<GrowthRateDetail> growthRateRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GrowthRateDetail>(objectMapper.readValue("", GrowthRateDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<GrowthRateDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedMoveDamageClassSummaryList> moveDamageClassList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedMoveDamageClassSummaryList>(objectMapper.readValue("", PaginatedMoveDamageClassSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedMoveDamageClassSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<MoveDamageClassDetail> moveDamageClassRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MoveDamageClassDetail>(objectMapper.readValue("", MoveDamageClassDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<MoveDamageClassDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedNatureSummaryList> natureList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedNatureSummaryList>(objectMapper.readValue("", PaginatedNatureSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedNatureSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<NatureDetail> natureRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<NatureDetail>(objectMapper.readValue("", NatureDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<NatureDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedPokeathlonStatSummaryList> pokeathlonStatList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedPokeathlonStatSummaryList>(objectMapper.readValue("", PaginatedPokeathlonStatSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedPokeathlonStatSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<PokeathlonStatDetail> pokeathlonStatRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PokeathlonStatDetail>(objectMapper.readValue("", PokeathlonStatDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<PokeathlonStatDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedPokemonColorSummaryList> pokemonColorList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedPokemonColorSummaryList>(objectMapper.readValue("", PaginatedPokemonColorSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedPokemonColorSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<PokemonColorDetail> pokemonColorRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PokemonColorDetail>(objectMapper.readValue("", PokemonColorDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<PokemonColorDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedPokemonFormSummaryList> pokemonFormList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedPokemonFormSummaryList>(objectMapper.readValue("", PaginatedPokemonFormSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedPokemonFormSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<PokemonFormDetail> pokemonFormRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PokemonFormDetail>(objectMapper.readValue("", PokemonFormDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<PokemonFormDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedPokemonHabitatSummaryList> pokemonHabitatList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedPokemonHabitatSummaryList>(objectMapper.readValue("", PaginatedPokemonHabitatSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedPokemonHabitatSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<PokemonHabitatDetail> pokemonHabitatRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PokemonHabitatDetail>(objectMapper.readValue("", PokemonHabitatDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<PokemonHabitatDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedPokemonSummaryList> pokemonList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedPokemonSummaryList>(objectMapper.readValue("", PaginatedPokemonSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedPokemonSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<PokemonDetail> pokemonRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PokemonDetail>(objectMapper.readValue("", PokemonDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<PokemonDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedPokemonShapeSummaryList> pokemonShapeList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedPokemonShapeSummaryList>(objectMapper.readValue("", PaginatedPokemonShapeSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedPokemonShapeSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<PokemonShapeDetail> pokemonShapeRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PokemonShapeDetail>(objectMapper.readValue("", PokemonShapeDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<PokemonShapeDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedPokemonSpeciesSummaryList> pokemonSpeciesList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedPokemonSpeciesSummaryList>(objectMapper.readValue("", PaginatedPokemonSpeciesSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedPokemonSpeciesSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<PokemonSpeciesDetail> pokemonSpeciesRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PokemonSpeciesDetail>(objectMapper.readValue("", PokemonSpeciesDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<PokemonSpeciesDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedStatSummaryList> statList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedStatSummaryList>(objectMapper.readValue("", PaginatedStatSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedStatSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<StatDetail> statRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<StatDetail>(objectMapper.readValue("", StatDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<StatDetail>(HttpStatus.OK);
    }

    public ResponseEntity<PaginatedTypeSummaryList> typeList(@ApiParam(value = "Number of results to return per page.")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "The initial index from which to return the results.")  @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")  @RequestParam(value = "q", required = false) String q,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaginatedTypeSummaryList>(objectMapper.readValue("", PaginatedTypeSummaryList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaginatedTypeSummaryList>(HttpStatus.OK);
    }

    public ResponseEntity<TypeDetail> typeRetrieve(@ApiParam(value = "This parameter can be a string or an integer.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TypeDetail>(objectMapper.readValue("", TypeDetail.class), HttpStatus.OK);
        }

        return new ResponseEntity<TypeDetail>(HttpStatus.OK);
    }

}
