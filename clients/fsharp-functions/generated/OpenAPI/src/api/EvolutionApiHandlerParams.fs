namespace OpenAPI

open OpenAPI.Model.EvolutionChainDetail
open OpenAPI.Model.EvolutionTriggerDetail
open OpenAPI.Model.PaginatedEvolutionChainSummaryList
open OpenAPI.Model.PaginatedEvolutionTriggerSummaryList
open System.Collections.Generic
open System

module EvolutionApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type EvolutionChainListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type EvolutionChainListStatusCode200Response = {
      content:PaginatedEvolutionChainSummaryList;
      
    }
    type EvolutionChainListResult = EvolutionChainListStatusCode200 of EvolutionChainListStatusCode200Response

    type EvolutionChainListArgs = {
      queryParams:Result<EvolutionChainListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EvolutionChainRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type EvolutionChainRetrieveStatusCode200Response = {
      content:EvolutionChainDetail;
      
    }
    type EvolutionChainRetrieveResult = EvolutionChainRetrieveStatusCode200 of EvolutionChainRetrieveStatusCode200Response

    type EvolutionChainRetrieveArgs = {
      pathParams:EvolutionChainRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type EvolutionTriggerListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type EvolutionTriggerListStatusCode200Response = {
      content:PaginatedEvolutionTriggerSummaryList;
      
    }
    type EvolutionTriggerListResult = EvolutionTriggerListStatusCode200 of EvolutionTriggerListStatusCode200Response

    type EvolutionTriggerListArgs = {
      queryParams:Result<EvolutionTriggerListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EvolutionTriggerRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type EvolutionTriggerRetrieveStatusCode200Response = {
      content:EvolutionTriggerDetail;
      
    }
    type EvolutionTriggerRetrieveResult = EvolutionTriggerRetrieveStatusCode200 of EvolutionTriggerRetrieveStatusCode200Response

    type EvolutionTriggerRetrieveArgs = {
      pathParams:EvolutionTriggerRetrievePathParams;
    }
