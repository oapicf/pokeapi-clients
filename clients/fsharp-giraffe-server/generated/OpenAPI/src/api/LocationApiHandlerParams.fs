namespace OpenAPI

open System.Collections.Generic
open System

module LocationApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type LocationListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type LocationListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type LocationListResult = LocationListDefaultStatusCode of LocationListDefaultStatusCodeResponse

    type LocationListArgs = {
      queryParams:Result<LocationListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type LocationReadPathParams = {
      id : int ;
    }
    //#endregion


    type LocationReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type LocationReadResult = LocationReadDefaultStatusCode of LocationReadDefaultStatusCodeResponse

    type LocationReadArgs = {
      pathParams:LocationReadPathParams;
    }
