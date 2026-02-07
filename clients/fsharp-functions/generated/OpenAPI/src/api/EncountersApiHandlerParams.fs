namespace OpenAPI

open OpenAPI.Model.EncounterConditionDetail
open OpenAPI.Model.EncounterConditionValueDetail
open OpenAPI.Model.EncounterMethodDetail
open OpenAPI.Model.PaginatedEncounterConditionSummaryList
open OpenAPI.Model.PaginatedEncounterConditionValueSummaryList
open OpenAPI.Model.PaginatedEncounterMethodSummaryList
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInner
open System.Collections.Generic
open System

module EncountersApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type EncounterConditionListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type EncounterConditionListStatusCode200Response = {
      content:PaginatedEncounterConditionSummaryList;
      
    }
    type EncounterConditionListResult = EncounterConditionListStatusCode200 of EncounterConditionListStatusCode200Response

    type EncounterConditionListArgs = {
      queryParams:Result<EncounterConditionListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EncounterConditionRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type EncounterConditionRetrieveStatusCode200Response = {
      content:EncounterConditionDetail;
      
    }
    type EncounterConditionRetrieveResult = EncounterConditionRetrieveStatusCode200 of EncounterConditionRetrieveStatusCode200Response

    type EncounterConditionRetrieveArgs = {
      pathParams:EncounterConditionRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type EncounterConditionValueListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type EncounterConditionValueListStatusCode200Response = {
      content:PaginatedEncounterConditionValueSummaryList;
      
    }
    type EncounterConditionValueListResult = EncounterConditionValueListStatusCode200 of EncounterConditionValueListStatusCode200Response

    type EncounterConditionValueListArgs = {
      queryParams:Result<EncounterConditionValueListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EncounterConditionValueRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type EncounterConditionValueRetrieveStatusCode200Response = {
      content:EncounterConditionValueDetail;
      
    }
    type EncounterConditionValueRetrieveResult = EncounterConditionValueRetrieveStatusCode200 of EncounterConditionValueRetrieveStatusCode200Response

    type EncounterConditionValueRetrieveArgs = {
      pathParams:EncounterConditionValueRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type EncounterMethodListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type EncounterMethodListStatusCode200Response = {
      content:PaginatedEncounterMethodSummaryList;
      
    }
    type EncounterMethodListResult = EncounterMethodListStatusCode200 of EncounterMethodListStatusCode200Response

    type EncounterMethodListArgs = {
      queryParams:Result<EncounterMethodListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EncounterMethodRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type EncounterMethodRetrieveStatusCode200Response = {
      content:EncounterMethodDetail;
      
    }
    type EncounterMethodRetrieveResult = EncounterMethodRetrieveStatusCode200 of EncounterMethodRetrieveStatusCode200Response

    type EncounterMethodRetrieveArgs = {
      pathParams:EncounterMethodRetrievePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonEncountersRetrievePathParams = {
      pokemonId : string ;
    }
    //#endregion


    type PokemonEncountersRetrieveStatusCode200Response = {
      content:PokemonEncountersRetrieve200ResponseInner[];
      
    }
    type PokemonEncountersRetrieveResult = PokemonEncountersRetrieveStatusCode200 of PokemonEncountersRetrieveStatusCode200Response

    type PokemonEncountersRetrieveArgs = {
      pathParams:PokemonEncountersRetrievePathParams;
    }
