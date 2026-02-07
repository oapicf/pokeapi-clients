namespace OpenAPI

open OpenAPI.Model.ContestEffectDetail
open OpenAPI.Model.ContestTypeDetail
open OpenAPI.Model.PaginatedContestEffectSummaryList
open OpenAPI.Model.PaginatedContestTypeSummaryList
open OpenAPI.Model.PaginatedSuperContestEffectSummaryList
open OpenAPI.Model.SuperContestEffectDetail
open System.Collections.Generic
open System

module ContestsApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ContestEffectListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type ContestEffectListStatusCode200Response = {
      content:PaginatedContestEffectSummaryList;
      
    }
    type ContestEffectListResult = ContestEffectListStatusCode200 of ContestEffectListStatusCode200Response

    type ContestEffectListArgs = {
      queryParams:Result<ContestEffectListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ContestEffectRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type ContestEffectRetrieveStatusCode200Response = {
      content:ContestEffectDetail;
      
    }
    type ContestEffectRetrieveResult = ContestEffectRetrieveStatusCode200 of ContestEffectRetrieveStatusCode200Response

    type ContestEffectRetrieveArgs = {
      pathParams:ContestEffectRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ContestTypeListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type ContestTypeListStatusCode200Response = {
      content:PaginatedContestTypeSummaryList;
      
    }
    type ContestTypeListResult = ContestTypeListStatusCode200 of ContestTypeListStatusCode200Response

    type ContestTypeListArgs = {
      queryParams:Result<ContestTypeListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ContestTypeRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type ContestTypeRetrieveStatusCode200Response = {
      content:ContestTypeDetail;
      
    }
    type ContestTypeRetrieveResult = ContestTypeRetrieveStatusCode200 of ContestTypeRetrieveStatusCode200Response

    type ContestTypeRetrieveArgs = {
      pathParams:ContestTypeRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type SuperContestEffectListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type SuperContestEffectListStatusCode200Response = {
      content:PaginatedSuperContestEffectSummaryList;
      
    }
    type SuperContestEffectListResult = SuperContestEffectListStatusCode200 of SuperContestEffectListStatusCode200Response

    type SuperContestEffectListArgs = {
      queryParams:Result<SuperContestEffectListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SuperContestEffectRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type SuperContestEffectRetrieveStatusCode200Response = {
      content:SuperContestEffectDetail;
      
    }
    type SuperContestEffectRetrieveResult = SuperContestEffectRetrieveStatusCode200 of SuperContestEffectRetrieveStatusCode200Response

    type SuperContestEffectRetrieveArgs = {
      pathParams:SuperContestEffectRetrievePathParams;
    }
