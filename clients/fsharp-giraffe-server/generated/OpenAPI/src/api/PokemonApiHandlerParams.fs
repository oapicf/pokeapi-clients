namespace OpenAPI

open OpenAPI.Model.AbilityDetail
open OpenAPI.Model.CharacteristicDetail
open OpenAPI.Model.EggGroupDetail
open OpenAPI.Model.GenderDetail
open OpenAPI.Model.GrowthRateDetail
open OpenAPI.Model.MoveDamageClassDetail
open OpenAPI.Model.NatureDetail
open OpenAPI.Model.PaginatedAbilitySummaryList
open OpenAPI.Model.PaginatedCharacteristicSummaryList
open OpenAPI.Model.PaginatedEggGroupSummaryList
open OpenAPI.Model.PaginatedGenderSummaryList
open OpenAPI.Model.PaginatedGrowthRateSummaryList
open OpenAPI.Model.PaginatedMoveDamageClassSummaryList
open OpenAPI.Model.PaginatedNatureSummaryList
open OpenAPI.Model.PaginatedPokeathlonStatSummaryList
open OpenAPI.Model.PaginatedPokemonColorSummaryList
open OpenAPI.Model.PaginatedPokemonFormSummaryList
open OpenAPI.Model.PaginatedPokemonHabitatSummaryList
open OpenAPI.Model.PaginatedPokemonShapeSummaryList
open OpenAPI.Model.PaginatedPokemonSpeciesSummaryList
open OpenAPI.Model.PaginatedPokemonSummaryList
open OpenAPI.Model.PaginatedStatSummaryList
open OpenAPI.Model.PaginatedTypeSummaryList
open OpenAPI.Model.PokeathlonStatDetail
open OpenAPI.Model.PokemonColorDetail
open OpenAPI.Model.PokemonDetail
open OpenAPI.Model.PokemonFormDetail
open OpenAPI.Model.PokemonHabitatDetail
open OpenAPI.Model.PokemonShapeDetail
open OpenAPI.Model.PokemonSpeciesDetail
open OpenAPI.Model.StatDetail
open OpenAPI.Model.TypeDetail
open System.Collections.Generic
open System

module PokemonApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type AbilityListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type AbilityListStatusCode200Response = {
      content:PaginatedAbilitySummaryList;
      
    }
    type AbilityListResult = AbilityListStatusCode200 of AbilityListStatusCode200Response

    type AbilityListArgs = {
      queryParams:Result<AbilityListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AbilityRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type AbilityRetrieveStatusCode200Response = {
      content:AbilityDetail;
      
    }
    type AbilityRetrieveResult = AbilityRetrieveStatusCode200 of AbilityRetrieveStatusCode200Response

    type AbilityRetrieveArgs = {
      pathParams:AbilityRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CharacteristicListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type CharacteristicListStatusCode200Response = {
      content:PaginatedCharacteristicSummaryList;
      
    }
    type CharacteristicListResult = CharacteristicListStatusCode200 of CharacteristicListStatusCode200Response

    type CharacteristicListArgs = {
      queryParams:Result<CharacteristicListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CharacteristicRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type CharacteristicRetrieveStatusCode200Response = {
      content:CharacteristicDetail;
      
    }
    type CharacteristicRetrieveResult = CharacteristicRetrieveStatusCode200 of CharacteristicRetrieveStatusCode200Response

    type CharacteristicRetrieveArgs = {
      pathParams:CharacteristicRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type EggGroupListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type EggGroupListStatusCode200Response = {
      content:PaginatedEggGroupSummaryList;
      
    }
    type EggGroupListResult = EggGroupListStatusCode200 of EggGroupListStatusCode200Response

    type EggGroupListArgs = {
      queryParams:Result<EggGroupListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EggGroupRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type EggGroupRetrieveStatusCode200Response = {
      content:EggGroupDetail;
      
    }
    type EggGroupRetrieveResult = EggGroupRetrieveStatusCode200 of EggGroupRetrieveStatusCode200Response

    type EggGroupRetrieveArgs = {
      pathParams:EggGroupRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenderListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type GenderListStatusCode200Response = {
      content:PaginatedGenderSummaryList;
      
    }
    type GenderListResult = GenderListStatusCode200 of GenderListStatusCode200Response

    type GenderListArgs = {
      queryParams:Result<GenderListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GenderRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type GenderRetrieveStatusCode200Response = {
      content:GenderDetail;
      
    }
    type GenderRetrieveResult = GenderRetrieveStatusCode200 of GenderRetrieveStatusCode200Response

    type GenderRetrieveArgs = {
      pathParams:GenderRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GrowthRateListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type GrowthRateListStatusCode200Response = {
      content:PaginatedGrowthRateSummaryList;
      
    }
    type GrowthRateListResult = GrowthRateListStatusCode200 of GrowthRateListStatusCode200Response

    type GrowthRateListArgs = {
      queryParams:Result<GrowthRateListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GrowthRateRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type GrowthRateRetrieveStatusCode200Response = {
      content:GrowthRateDetail;
      
    }
    type GrowthRateRetrieveResult = GrowthRateRetrieveStatusCode200 of GrowthRateRetrieveStatusCode200Response

    type GrowthRateRetrieveArgs = {
      pathParams:GrowthRateRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type MoveDamageClassListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type MoveDamageClassListStatusCode200Response = {
      content:PaginatedMoveDamageClassSummaryList;
      
    }
    type MoveDamageClassListResult = MoveDamageClassListStatusCode200 of MoveDamageClassListStatusCode200Response

    type MoveDamageClassListArgs = {
      queryParams:Result<MoveDamageClassListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveDamageClassRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type MoveDamageClassRetrieveStatusCode200Response = {
      content:MoveDamageClassDetail;
      
    }
    type MoveDamageClassRetrieveResult = MoveDamageClassRetrieveStatusCode200 of MoveDamageClassRetrieveStatusCode200Response

    type MoveDamageClassRetrieveArgs = {
      pathParams:MoveDamageClassRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type NatureListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type NatureListStatusCode200Response = {
      content:PaginatedNatureSummaryList;
      
    }
    type NatureListResult = NatureListStatusCode200 of NatureListStatusCode200Response

    type NatureListArgs = {
      queryParams:Result<NatureListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type NatureRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type NatureRetrieveStatusCode200Response = {
      content:NatureDetail;
      
    }
    type NatureRetrieveResult = NatureRetrieveStatusCode200 of NatureRetrieveStatusCode200Response

    type NatureRetrieveArgs = {
      pathParams:NatureRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PokeathlonStatListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type PokeathlonStatListStatusCode200Response = {
      content:PaginatedPokeathlonStatSummaryList;
      
    }
    type PokeathlonStatListResult = PokeathlonStatListStatusCode200 of PokeathlonStatListStatusCode200Response

    type PokeathlonStatListArgs = {
      queryParams:Result<PokeathlonStatListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokeathlonStatRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type PokeathlonStatRetrieveStatusCode200Response = {
      content:PokeathlonStatDetail;
      
    }
    type PokeathlonStatRetrieveResult = PokeathlonStatRetrieveStatusCode200 of PokeathlonStatRetrieveStatusCode200Response

    type PokeathlonStatRetrieveArgs = {
      pathParams:PokeathlonStatRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PokemonColorListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type PokemonColorListStatusCode200Response = {
      content:PaginatedPokemonColorSummaryList;
      
    }
    type PokemonColorListResult = PokemonColorListStatusCode200 of PokemonColorListStatusCode200Response

    type PokemonColorListArgs = {
      queryParams:Result<PokemonColorListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonColorRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type PokemonColorRetrieveStatusCode200Response = {
      content:PokemonColorDetail;
      
    }
    type PokemonColorRetrieveResult = PokemonColorRetrieveStatusCode200 of PokemonColorRetrieveStatusCode200Response

    type PokemonColorRetrieveArgs = {
      pathParams:PokemonColorRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PokemonFormListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type PokemonFormListStatusCode200Response = {
      content:PaginatedPokemonFormSummaryList;
      
    }
    type PokemonFormListResult = PokemonFormListStatusCode200 of PokemonFormListStatusCode200Response

    type PokemonFormListArgs = {
      queryParams:Result<PokemonFormListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonFormRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type PokemonFormRetrieveStatusCode200Response = {
      content:PokemonFormDetail;
      
    }
    type PokemonFormRetrieveResult = PokemonFormRetrieveStatusCode200 of PokemonFormRetrieveStatusCode200Response

    type PokemonFormRetrieveArgs = {
      pathParams:PokemonFormRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PokemonHabitatListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type PokemonHabitatListStatusCode200Response = {
      content:PaginatedPokemonHabitatSummaryList;
      
    }
    type PokemonHabitatListResult = PokemonHabitatListStatusCode200 of PokemonHabitatListStatusCode200Response

    type PokemonHabitatListArgs = {
      queryParams:Result<PokemonHabitatListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonHabitatRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type PokemonHabitatRetrieveStatusCode200Response = {
      content:PokemonHabitatDetail;
      
    }
    type PokemonHabitatRetrieveResult = PokemonHabitatRetrieveStatusCode200 of PokemonHabitatRetrieveStatusCode200Response

    type PokemonHabitatRetrieveArgs = {
      pathParams:PokemonHabitatRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PokemonListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type PokemonListStatusCode200Response = {
      content:PaginatedPokemonSummaryList;
      
    }
    type PokemonListResult = PokemonListStatusCode200 of PokemonListStatusCode200Response

    type PokemonListArgs = {
      queryParams:Result<PokemonListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type PokemonRetrieveStatusCode200Response = {
      content:PokemonDetail;
      
    }
    type PokemonRetrieveResult = PokemonRetrieveStatusCode200 of PokemonRetrieveStatusCode200Response

    type PokemonRetrieveArgs = {
      pathParams:PokemonRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PokemonShapeListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type PokemonShapeListStatusCode200Response = {
      content:PaginatedPokemonShapeSummaryList;
      
    }
    type PokemonShapeListResult = PokemonShapeListStatusCode200 of PokemonShapeListStatusCode200Response

    type PokemonShapeListArgs = {
      queryParams:Result<PokemonShapeListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonShapeRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type PokemonShapeRetrieveStatusCode200Response = {
      content:PokemonShapeDetail;
      
    }
    type PokemonShapeRetrieveResult = PokemonShapeRetrieveStatusCode200 of PokemonShapeRetrieveStatusCode200Response

    type PokemonShapeRetrieveArgs = {
      pathParams:PokemonShapeRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PokemonSpeciesListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type PokemonSpeciesListStatusCode200Response = {
      content:PaginatedPokemonSpeciesSummaryList;
      
    }
    type PokemonSpeciesListResult = PokemonSpeciesListStatusCode200 of PokemonSpeciesListStatusCode200Response

    type PokemonSpeciesListArgs = {
      queryParams:Result<PokemonSpeciesListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonSpeciesRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type PokemonSpeciesRetrieveStatusCode200Response = {
      content:PokemonSpeciesDetail;
      
    }
    type PokemonSpeciesRetrieveResult = PokemonSpeciesRetrieveStatusCode200 of PokemonSpeciesRetrieveStatusCode200Response

    type PokemonSpeciesRetrieveArgs = {
      pathParams:PokemonSpeciesRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type StatListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type StatListStatusCode200Response = {
      content:PaginatedStatSummaryList;
      
    }
    type StatListResult = StatListStatusCode200 of StatListStatusCode200Response

    type StatListArgs = {
      queryParams:Result<StatListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type StatRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type StatRetrieveStatusCode200Response = {
      content:StatDetail;
      
    }
    type StatRetrieveResult = StatRetrieveStatusCode200 of StatRetrieveStatusCode200Response

    type StatRetrieveArgs = {
      pathParams:StatRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type TypeListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type TypeListStatusCode200Response = {
      content:PaginatedTypeSummaryList;
      
    }
    type TypeListResult = TypeListStatusCode200 of TypeListStatusCode200Response

    type TypeListArgs = {
      queryParams:Result<TypeListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type TypeRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type TypeRetrieveStatusCode200Response = {
      content:TypeDetail;
      
    }
    type TypeRetrieveResult = TypeRetrieveStatusCode200 of TypeRetrieveStatusCode200Response

    type TypeRetrieveArgs = {
      pathParams:TypeRetrievePathParams;
    }
