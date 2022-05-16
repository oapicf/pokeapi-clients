namespace OpenAPI

open System.Collections.Generic
open System

module PalParkAreaApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type PalParkAreaListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type PalParkAreaListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PalParkAreaListResult = PalParkAreaListDefaultStatusCode of PalParkAreaListDefaultStatusCodeResponse

    type PalParkAreaListArgs = {
      queryParams:Result<PalParkAreaListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PalParkAreaReadPathParams = {
      id : int ;
    }
    //#endregion


    type PalParkAreaReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PalParkAreaReadResult = PalParkAreaReadDefaultStatusCode of PalParkAreaReadDefaultStatusCodeResponse

    type PalParkAreaReadArgs = {
      pathParams:PalParkAreaReadPathParams;
    }
