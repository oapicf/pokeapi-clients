namespace OpenAPI

open OpenAPI.Model.GenerationDetail
open OpenAPI.Model.PaginatedGenerationSummaryList
open OpenAPI.Model.PaginatedPokedexSummaryList
open OpenAPI.Model.PaginatedVersionGroupSummaryList
open OpenAPI.Model.PaginatedVersionSummaryList
open OpenAPI.Model.PokedexDetail
open OpenAPI.Model.VersionDetail
open OpenAPI.Model.VersionGroupDetail
open System.Collections.Generic
open System

module GamesApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type GenerationListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type GenerationListStatusCode200Response = {
      content:PaginatedGenerationSummaryList;
      
    }
    type GenerationListResult = GenerationListStatusCode200 of GenerationListStatusCode200Response

    type GenerationListArgs = {
      queryParams:Result<GenerationListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GenerationRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type GenerationRetrieveStatusCode200Response = {
      content:GenerationDetail;
      
    }
    type GenerationRetrieveResult = GenerationRetrieveStatusCode200 of GenerationRetrieveStatusCode200Response

    type GenerationRetrieveArgs = {
      pathParams:GenerationRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PokedexListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type PokedexListStatusCode200Response = {
      content:PaginatedPokedexSummaryList;
      
    }
    type PokedexListResult = PokedexListStatusCode200 of PokedexListStatusCode200Response

    type PokedexListArgs = {
      queryParams:Result<PokedexListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokedexRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type PokedexRetrieveStatusCode200Response = {
      content:PokedexDetail;
      
    }
    type PokedexRetrieveResult = PokedexRetrieveStatusCode200 of PokedexRetrieveStatusCode200Response

    type PokedexRetrieveArgs = {
      pathParams:PokedexRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type VersionGroupListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type VersionGroupListStatusCode200Response = {
      content:PaginatedVersionGroupSummaryList;
      
    }
    type VersionGroupListResult = VersionGroupListStatusCode200 of VersionGroupListStatusCode200Response

    type VersionGroupListArgs = {
      queryParams:Result<VersionGroupListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type VersionGroupRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type VersionGroupRetrieveStatusCode200Response = {
      content:VersionGroupDetail;
      
    }
    type VersionGroupRetrieveResult = VersionGroupRetrieveStatusCode200 of VersionGroupRetrieveStatusCode200Response

    type VersionGroupRetrieveArgs = {
      pathParams:VersionGroupRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type VersionListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type VersionListStatusCode200Response = {
      content:PaginatedVersionSummaryList;
      
    }
    type VersionListResult = VersionListStatusCode200 of VersionListStatusCode200Response

    type VersionListArgs = {
      queryParams:Result<VersionListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type VersionRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type VersionRetrieveStatusCode200Response = {
      content:VersionDetail;
      
    }
    type VersionRetrieveResult = VersionRetrieveStatusCode200 of VersionRetrieveStatusCode200Response

    type VersionRetrieveArgs = {
      pathParams:VersionRetrievePathParams;
    }
