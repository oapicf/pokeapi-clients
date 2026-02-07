namespace OpenAPI

open OpenAPI.Model.BerryDetail
open OpenAPI.Model.BerryFirmnessDetail
open OpenAPI.Model.BerryFlavorDetail
open OpenAPI.Model.PaginatedBerryFirmnessSummaryList
open OpenAPI.Model.PaginatedBerryFlavorSummaryList
open OpenAPI.Model.PaginatedBerrySummaryList
open System.Collections.Generic
open System

module BerriesApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type BerryFirmnessListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type BerryFirmnessListStatusCode200Response = {
      content:PaginatedBerryFirmnessSummaryList;
      
    }
    type BerryFirmnessListResult = BerryFirmnessListStatusCode200 of BerryFirmnessListStatusCode200Response

    type BerryFirmnessListArgs = {
      queryParams:Result<BerryFirmnessListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BerryFirmnessRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type BerryFirmnessRetrieveStatusCode200Response = {
      content:BerryFirmnessDetail;
      
    }
    type BerryFirmnessRetrieveResult = BerryFirmnessRetrieveStatusCode200 of BerryFirmnessRetrieveStatusCode200Response

    type BerryFirmnessRetrieveArgs = {
      pathParams:BerryFirmnessRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type BerryFlavorListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type BerryFlavorListStatusCode200Response = {
      content:PaginatedBerryFlavorSummaryList;
      
    }
    type BerryFlavorListResult = BerryFlavorListStatusCode200 of BerryFlavorListStatusCode200Response

    type BerryFlavorListArgs = {
      queryParams:Result<BerryFlavorListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BerryFlavorRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type BerryFlavorRetrieveStatusCode200Response = {
      content:BerryFlavorDetail;
      
    }
    type BerryFlavorRetrieveResult = BerryFlavorRetrieveStatusCode200 of BerryFlavorRetrieveStatusCode200Response

    type BerryFlavorRetrieveArgs = {
      pathParams:BerryFlavorRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type BerryListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type BerryListStatusCode200Response = {
      content:PaginatedBerrySummaryList;
      
    }
    type BerryListResult = BerryListStatusCode200 of BerryListStatusCode200Response

    type BerryListArgs = {
      queryParams:Result<BerryListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BerryRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type BerryRetrieveStatusCode200Response = {
      content:BerryDetail;
      
    }
    type BerryRetrieveResult = BerryRetrieveStatusCode200 of BerryRetrieveStatusCode200Response

    type BerryRetrieveArgs = {
      pathParams:BerryRetrievePathParams;
    }
