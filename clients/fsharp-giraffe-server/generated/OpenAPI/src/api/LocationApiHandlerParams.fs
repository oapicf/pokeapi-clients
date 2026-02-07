namespace OpenAPI

open OpenAPI.Model.LocationAreaDetail
open OpenAPI.Model.LocationDetail
open OpenAPI.Model.PaginatedLocationAreaSummaryList
open OpenAPI.Model.PaginatedLocationSummaryList
open OpenAPI.Model.PaginatedPalParkAreaSummaryList
open OpenAPI.Model.PaginatedRegionSummaryList
open OpenAPI.Model.PalParkAreaDetail
open OpenAPI.Model.RegionDetail
open System.Collections.Generic
open System

module LocationApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type LocationAreaListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type LocationAreaListStatusCode200Response = {
      content:PaginatedLocationAreaSummaryList;
      
    }
    type LocationAreaListResult = LocationAreaListStatusCode200 of LocationAreaListStatusCode200Response

    type LocationAreaListArgs = {
      queryParams:Result<LocationAreaListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type LocationAreaRetrievePathParams = {
      id : int ;
    }
    //#endregion


    type LocationAreaRetrieveStatusCode200Response = {
      content:LocationAreaDetail;
      
    }
    type LocationAreaRetrieveResult = LocationAreaRetrieveStatusCode200 of LocationAreaRetrieveStatusCode200Response

    type LocationAreaRetrieveArgs = {
      pathParams:LocationAreaRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type LocationListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type LocationListStatusCode200Response = {
      content:PaginatedLocationSummaryList;
      
    }
    type LocationListResult = LocationListStatusCode200 of LocationListStatusCode200Response

    type LocationListArgs = {
      queryParams:Result<LocationListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type LocationRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type LocationRetrieveStatusCode200Response = {
      content:LocationDetail;
      
    }
    type LocationRetrieveResult = LocationRetrieveStatusCode200 of LocationRetrieveStatusCode200Response

    type LocationRetrieveArgs = {
      pathParams:LocationRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PalParkAreaListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type PalParkAreaListStatusCode200Response = {
      content:PaginatedPalParkAreaSummaryList;
      
    }
    type PalParkAreaListResult = PalParkAreaListStatusCode200 of PalParkAreaListStatusCode200Response

    type PalParkAreaListArgs = {
      queryParams:Result<PalParkAreaListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PalParkAreaRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type PalParkAreaRetrieveStatusCode200Response = {
      content:PalParkAreaDetail;
      
    }
    type PalParkAreaRetrieveResult = PalParkAreaRetrieveStatusCode200 of PalParkAreaRetrieveStatusCode200Response

    type PalParkAreaRetrieveArgs = {
      pathParams:PalParkAreaRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type RegionListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type RegionListStatusCode200Response = {
      content:PaginatedRegionSummaryList;
      
    }
    type RegionListResult = RegionListStatusCode200 of RegionListStatusCode200Response

    type RegionListArgs = {
      queryParams:Result<RegionListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RegionRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type RegionRetrieveStatusCode200Response = {
      content:RegionDetail;
      
    }
    type RegionRetrieveResult = RegionRetrieveStatusCode200 of RegionRetrieveStatusCode200Response

    type RegionRetrieveArgs = {
      pathParams:RegionRetrievePathParams;
    }
