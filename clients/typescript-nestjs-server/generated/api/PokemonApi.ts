import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AbilityDetail, CharacteristicDetail, EggGroupDetail, GenderDetail, GrowthRateDetail, MoveDamageClassDetail, NatureDetail, PaginatedAbilitySummaryList, PaginatedCharacteristicSummaryList, PaginatedEggGroupSummaryList, PaginatedGenderSummaryList, PaginatedGrowthRateSummaryList, PaginatedMoveDamageClassSummaryList, PaginatedNatureSummaryList, PaginatedPokeathlonStatSummaryList, PaginatedPokemonColorSummaryList, PaginatedPokemonFormSummaryList, PaginatedPokemonHabitatSummaryList, PaginatedPokemonShapeSummaryList, PaginatedPokemonSpeciesSummaryList, PaginatedPokemonSummaryList, PaginatedStatSummaryList, PaginatedTypeSummaryList, PokeathlonStatDetail, PokemonColorDetail, PokemonDetail, PokemonFormDetail, PokemonHabitatDetail, PokemonShapeDetail, PokemonSpeciesDetail, StatDetail, TypeDetail,  } from '../models';


@Injectable()
export abstract class PokemonApi {

  abstract abilityList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedAbilitySummaryList | Promise<PaginatedAbilitySummaryList> | Observable<PaginatedAbilitySummaryList>;


  abstract abilityRetrieve(id: string,  request: Request): AbilityDetail | Promise<AbilityDetail> | Observable<AbilityDetail>;


  abstract characteristicList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedCharacteristicSummaryList | Promise<PaginatedCharacteristicSummaryList> | Observable<PaginatedCharacteristicSummaryList>;


  abstract characteristicRetrieve(id: string,  request: Request): CharacteristicDetail | Promise<CharacteristicDetail> | Observable<CharacteristicDetail>;


  abstract eggGroupList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedEggGroupSummaryList | Promise<PaginatedEggGroupSummaryList> | Observable<PaginatedEggGroupSummaryList>;


  abstract eggGroupRetrieve(id: string,  request: Request): EggGroupDetail | Promise<EggGroupDetail> | Observable<EggGroupDetail>;


  abstract genderList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedGenderSummaryList | Promise<PaginatedGenderSummaryList> | Observable<PaginatedGenderSummaryList>;


  abstract genderRetrieve(id: string,  request: Request): GenderDetail | Promise<GenderDetail> | Observable<GenderDetail>;


  abstract growthRateList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedGrowthRateSummaryList | Promise<PaginatedGrowthRateSummaryList> | Observable<PaginatedGrowthRateSummaryList>;


  abstract growthRateRetrieve(id: string,  request: Request): GrowthRateDetail | Promise<GrowthRateDetail> | Observable<GrowthRateDetail>;


  abstract moveDamageClassList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedMoveDamageClassSummaryList | Promise<PaginatedMoveDamageClassSummaryList> | Observable<PaginatedMoveDamageClassSummaryList>;


  abstract moveDamageClassRetrieve(id: string,  request: Request): MoveDamageClassDetail | Promise<MoveDamageClassDetail> | Observable<MoveDamageClassDetail>;


  abstract natureList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedNatureSummaryList | Promise<PaginatedNatureSummaryList> | Observable<PaginatedNatureSummaryList>;


  abstract natureRetrieve(id: string,  request: Request): NatureDetail | Promise<NatureDetail> | Observable<NatureDetail>;


  abstract pokeathlonStatList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedPokeathlonStatSummaryList | Promise<PaginatedPokeathlonStatSummaryList> | Observable<PaginatedPokeathlonStatSummaryList>;


  abstract pokeathlonStatRetrieve(id: string,  request: Request): PokeathlonStatDetail | Promise<PokeathlonStatDetail> | Observable<PokeathlonStatDetail>;


  abstract pokemonColorList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedPokemonColorSummaryList | Promise<PaginatedPokemonColorSummaryList> | Observable<PaginatedPokemonColorSummaryList>;


  abstract pokemonColorRetrieve(id: string,  request: Request): PokemonColorDetail | Promise<PokemonColorDetail> | Observable<PokemonColorDetail>;


  abstract pokemonFormList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedPokemonFormSummaryList | Promise<PaginatedPokemonFormSummaryList> | Observable<PaginatedPokemonFormSummaryList>;


  abstract pokemonFormRetrieve(id: string,  request: Request): PokemonFormDetail | Promise<PokemonFormDetail> | Observable<PokemonFormDetail>;


  abstract pokemonHabitatList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedPokemonHabitatSummaryList | Promise<PaginatedPokemonHabitatSummaryList> | Observable<PaginatedPokemonHabitatSummaryList>;


  abstract pokemonHabitatRetrieve(id: string,  request: Request): PokemonHabitatDetail | Promise<PokemonHabitatDetail> | Observable<PokemonHabitatDetail>;


  abstract pokemonList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedPokemonSummaryList | Promise<PaginatedPokemonSummaryList> | Observable<PaginatedPokemonSummaryList>;


  abstract pokemonRetrieve(id: string,  request: Request): PokemonDetail | Promise<PokemonDetail> | Observable<PokemonDetail>;


  abstract pokemonShapeList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedPokemonShapeSummaryList | Promise<PaginatedPokemonShapeSummaryList> | Observable<PaginatedPokemonShapeSummaryList>;


  abstract pokemonShapeRetrieve(id: string,  request: Request): PokemonShapeDetail | Promise<PokemonShapeDetail> | Observable<PokemonShapeDetail>;


  abstract pokemonSpeciesList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedPokemonSpeciesSummaryList | Promise<PaginatedPokemonSpeciesSummaryList> | Observable<PaginatedPokemonSpeciesSummaryList>;


  abstract pokemonSpeciesRetrieve(id: string,  request: Request): PokemonSpeciesDetail | Promise<PokemonSpeciesDetail> | Observable<PokemonSpeciesDetail>;


  abstract statList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedStatSummaryList | Promise<PaginatedStatSummaryList> | Observable<PaginatedStatSummaryList>;


  abstract statRetrieve(id: string,  request: Request): StatDetail | Promise<StatDetail> | Observable<StatDetail>;


  abstract typeList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedTypeSummaryList | Promise<PaginatedTypeSummaryList> | Observable<PaginatedTypeSummaryList>;


  abstract typeRetrieve(id: string,  request: Request): TypeDetail | Promise<TypeDetail> | Observable<TypeDetail>;

} 