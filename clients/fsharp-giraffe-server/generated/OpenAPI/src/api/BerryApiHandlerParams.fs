namespace OpenAPI

open System.Collections.Generic
open System

module BerryApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type BerryListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type BerryListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type BerryListResult = BerryListDefaultStatusCode of BerryListDefaultStatusCodeResponse

    type BerryListArgs = {
      queryParams:Result<BerryListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BerryReadPathParams = {
      id : int ;
    }
    //#endregion


    type BerryReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type BerryReadResult = BerryReadDefaultStatusCode of BerryReadDefaultStatusCodeResponse

    type BerryReadArgs = {
      pathParams:BerryReadPathParams;
    }
