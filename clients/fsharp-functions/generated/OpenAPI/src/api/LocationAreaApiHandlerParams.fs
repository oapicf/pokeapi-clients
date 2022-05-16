namespace OpenAPI

open System.Collections.Generic
open System

module LocationAreaApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type LocationAreaListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type LocationAreaListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type LocationAreaListResult = LocationAreaListDefaultStatusCode of LocationAreaListDefaultStatusCodeResponse

    type LocationAreaListArgs = {
      queryParams:Result<LocationAreaListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type LocationAreaReadPathParams = {
      id : int ;
    }
    //#endregion


    type LocationAreaReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type LocationAreaReadResult = LocationAreaReadDefaultStatusCode of LocationAreaReadDefaultStatusCodeResponse

    type LocationAreaReadArgs = {
      pathParams:LocationAreaReadPathParams;
    }
