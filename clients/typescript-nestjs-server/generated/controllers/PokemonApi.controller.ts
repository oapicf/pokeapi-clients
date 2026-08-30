import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { PokemonApi } from '../api';
import { AbilityDetail, CharacteristicDetail, EggGroupDetail, GenderDetail, GrowthRateDetail, MoveDamageClassDetail, NatureDetail, PaginatedAbilitySummaryList, PaginatedCharacteristicSummaryList, PaginatedEggGroupSummaryList, PaginatedGenderSummaryList, PaginatedGrowthRateSummaryList, PaginatedMoveDamageClassSummaryList, PaginatedNatureSummaryList, PaginatedPokeathlonStatSummaryList, PaginatedPokemonColorSummaryList, PaginatedPokemonFormSummaryList, PaginatedPokemonHabitatSummaryList, PaginatedPokemonShapeSummaryList, PaginatedPokemonSpeciesSummaryList, PaginatedPokemonSummaryList, PaginatedStatSummaryList, PaginatedTypeSummaryList, PokeathlonStatDetail, PokemonColorDetail, PokemonDetail, PokemonFormDetail, PokemonHabitatDetail, PokemonShapeDetail, PokemonSpeciesDetail, StatDetail, TypeDetail,  } from '../models';

@Controller()
export class PokemonApiController {
  constructor(private readonly pokemonApi: PokemonApi) {}

  @Get('/api/v2/ability/')
  abilityList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedAbilitySummaryList | Promise<PaginatedAbilitySummaryList> | Observable<PaginatedAbilitySummaryList> {
    return this.pokemonApi.abilityList(limit, offset, q, request);
  }

  @Get('/api/v2/ability/:id/')
  abilityRetrieve(@Param('id') id: string, @Req() request: Request): AbilityDetail | Promise<AbilityDetail> | Observable<AbilityDetail> {
    return this.pokemonApi.abilityRetrieve(id, request);
  }

  @Get('/api/v2/characteristic/')
  characteristicList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedCharacteristicSummaryList | Promise<PaginatedCharacteristicSummaryList> | Observable<PaginatedCharacteristicSummaryList> {
    return this.pokemonApi.characteristicList(limit, offset, q, request);
  }

  @Get('/api/v2/characteristic/:id/')
  characteristicRetrieve(@Param('id') id: string, @Req() request: Request): CharacteristicDetail | Promise<CharacteristicDetail> | Observable<CharacteristicDetail> {
    return this.pokemonApi.characteristicRetrieve(id, request);
  }

  @Get('/api/v2/egg-group/')
  eggGroupList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedEggGroupSummaryList | Promise<PaginatedEggGroupSummaryList> | Observable<PaginatedEggGroupSummaryList> {
    return this.pokemonApi.eggGroupList(limit, offset, q, request);
  }

  @Get('/api/v2/egg-group/:id/')
  eggGroupRetrieve(@Param('id') id: string, @Req() request: Request): EggGroupDetail | Promise<EggGroupDetail> | Observable<EggGroupDetail> {
    return this.pokemonApi.eggGroupRetrieve(id, request);
  }

  @Get('/api/v2/gender/')
  genderList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedGenderSummaryList | Promise<PaginatedGenderSummaryList> | Observable<PaginatedGenderSummaryList> {
    return this.pokemonApi.genderList(limit, offset, q, request);
  }

  @Get('/api/v2/gender/:id/')
  genderRetrieve(@Param('id') id: string, @Req() request: Request): GenderDetail | Promise<GenderDetail> | Observable<GenderDetail> {
    return this.pokemonApi.genderRetrieve(id, request);
  }

  @Get('/api/v2/growth-rate/')
  growthRateList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedGrowthRateSummaryList | Promise<PaginatedGrowthRateSummaryList> | Observable<PaginatedGrowthRateSummaryList> {
    return this.pokemonApi.growthRateList(limit, offset, q, request);
  }

  @Get('/api/v2/growth-rate/:id/')
  growthRateRetrieve(@Param('id') id: string, @Req() request: Request): GrowthRateDetail | Promise<GrowthRateDetail> | Observable<GrowthRateDetail> {
    return this.pokemonApi.growthRateRetrieve(id, request);
  }

  @Get('/api/v2/move-damage-class/')
  moveDamageClassList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedMoveDamageClassSummaryList | Promise<PaginatedMoveDamageClassSummaryList> | Observable<PaginatedMoveDamageClassSummaryList> {
    return this.pokemonApi.moveDamageClassList(limit, offset, q, request);
  }

  @Get('/api/v2/move-damage-class/:id/')
  moveDamageClassRetrieve(@Param('id') id: string, @Req() request: Request): MoveDamageClassDetail | Promise<MoveDamageClassDetail> | Observable<MoveDamageClassDetail> {
    return this.pokemonApi.moveDamageClassRetrieve(id, request);
  }

  @Get('/api/v2/nature/')
  natureList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedNatureSummaryList | Promise<PaginatedNatureSummaryList> | Observable<PaginatedNatureSummaryList> {
    return this.pokemonApi.natureList(limit, offset, q, request);
  }

  @Get('/api/v2/nature/:id/')
  natureRetrieve(@Param('id') id: string, @Req() request: Request): NatureDetail | Promise<NatureDetail> | Observable<NatureDetail> {
    return this.pokemonApi.natureRetrieve(id, request);
  }

  @Get('/api/v2/pokeathlon-stat/')
  pokeathlonStatList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedPokeathlonStatSummaryList | Promise<PaginatedPokeathlonStatSummaryList> | Observable<PaginatedPokeathlonStatSummaryList> {
    return this.pokemonApi.pokeathlonStatList(limit, offset, q, request);
  }

  @Get('/api/v2/pokeathlon-stat/:id/')
  pokeathlonStatRetrieve(@Param('id') id: string, @Req() request: Request): PokeathlonStatDetail | Promise<PokeathlonStatDetail> | Observable<PokeathlonStatDetail> {
    return this.pokemonApi.pokeathlonStatRetrieve(id, request);
  }

  @Get('/api/v2/pokemon-color/')
  pokemonColorList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedPokemonColorSummaryList | Promise<PaginatedPokemonColorSummaryList> | Observable<PaginatedPokemonColorSummaryList> {
    return this.pokemonApi.pokemonColorList(limit, offset, q, request);
  }

  @Get('/api/v2/pokemon-color/:id/')
  pokemonColorRetrieve(@Param('id') id: string, @Req() request: Request): PokemonColorDetail | Promise<PokemonColorDetail> | Observable<PokemonColorDetail> {
    return this.pokemonApi.pokemonColorRetrieve(id, request);
  }

  @Get('/api/v2/pokemon-form/')
  pokemonFormList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedPokemonFormSummaryList | Promise<PaginatedPokemonFormSummaryList> | Observable<PaginatedPokemonFormSummaryList> {
    return this.pokemonApi.pokemonFormList(limit, offset, q, request);
  }

  @Get('/api/v2/pokemon-form/:id/')
  pokemonFormRetrieve(@Param('id') id: string, @Req() request: Request): PokemonFormDetail | Promise<PokemonFormDetail> | Observable<PokemonFormDetail> {
    return this.pokemonApi.pokemonFormRetrieve(id, request);
  }

  @Get('/api/v2/pokemon-habitat/')
  pokemonHabitatList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedPokemonHabitatSummaryList | Promise<PaginatedPokemonHabitatSummaryList> | Observable<PaginatedPokemonHabitatSummaryList> {
    return this.pokemonApi.pokemonHabitatList(limit, offset, q, request);
  }

  @Get('/api/v2/pokemon-habitat/:id/')
  pokemonHabitatRetrieve(@Param('id') id: string, @Req() request: Request): PokemonHabitatDetail | Promise<PokemonHabitatDetail> | Observable<PokemonHabitatDetail> {
    return this.pokemonApi.pokemonHabitatRetrieve(id, request);
  }

  @Get('/api/v2/pokemon/')
  pokemonList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedPokemonSummaryList | Promise<PaginatedPokemonSummaryList> | Observable<PaginatedPokemonSummaryList> {
    return this.pokemonApi.pokemonList(limit, offset, q, request);
  }

  @Get('/api/v2/pokemon/:id/')
  pokemonRetrieve(@Param('id') id: string, @Req() request: Request): PokemonDetail | Promise<PokemonDetail> | Observable<PokemonDetail> {
    return this.pokemonApi.pokemonRetrieve(id, request);
  }

  @Get('/api/v2/pokemon-shape/')
  pokemonShapeList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedPokemonShapeSummaryList | Promise<PaginatedPokemonShapeSummaryList> | Observable<PaginatedPokemonShapeSummaryList> {
    return this.pokemonApi.pokemonShapeList(limit, offset, q, request);
  }

  @Get('/api/v2/pokemon-shape/:id/')
  pokemonShapeRetrieve(@Param('id') id: string, @Req() request: Request): PokemonShapeDetail | Promise<PokemonShapeDetail> | Observable<PokemonShapeDetail> {
    return this.pokemonApi.pokemonShapeRetrieve(id, request);
  }

  @Get('/api/v2/pokemon-species/')
  pokemonSpeciesList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedPokemonSpeciesSummaryList | Promise<PaginatedPokemonSpeciesSummaryList> | Observable<PaginatedPokemonSpeciesSummaryList> {
    return this.pokemonApi.pokemonSpeciesList(limit, offset, q, request);
  }

  @Get('/api/v2/pokemon-species/:id/')
  pokemonSpeciesRetrieve(@Param('id') id: string, @Req() request: Request): PokemonSpeciesDetail | Promise<PokemonSpeciesDetail> | Observable<PokemonSpeciesDetail> {
    return this.pokemonApi.pokemonSpeciesRetrieve(id, request);
  }

  @Get('/api/v2/stat/')
  statList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedStatSummaryList | Promise<PaginatedStatSummaryList> | Observable<PaginatedStatSummaryList> {
    return this.pokemonApi.statList(limit, offset, q, request);
  }

  @Get('/api/v2/stat/:id/')
  statRetrieve(@Param('id') id: string, @Req() request: Request): StatDetail | Promise<StatDetail> | Observable<StatDetail> {
    return this.pokemonApi.statRetrieve(id, request);
  }

  @Get('/api/v2/type/')
  typeList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedTypeSummaryList | Promise<PaginatedTypeSummaryList> | Observable<PaginatedTypeSummaryList> {
    return this.pokemonApi.typeList(limit, offset, q, request);
  }

  @Get('/api/v2/type/:id/')
  typeRetrieve(@Param('id') id: string, @Req() request: Request): TypeDetail | Promise<TypeDetail> | Observable<TypeDetail> {
    return this.pokemonApi.typeRetrieve(id, request);
  }

} 