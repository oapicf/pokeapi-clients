namespace OpenAPI

open System.Collections.Generic
open System

module BerryFirmnessApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type BerryFirmnessListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type BerryFirmnessListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type BerryFirmnessListResult = BerryFirmnessListDefaultStatusCode of BerryFirmnessListDefaultStatusCodeResponse

    type BerryFirmnessListArgs = {
      queryParams:Result<BerryFirmnessListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BerryFirmnessReadPathParams = {
      id : int ;
    }
    //#endregion


    type BerryFirmnessReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type BerryFirmnessReadResult = BerryFirmnessReadDefaultStatusCode of BerryFirmnessReadDefaultStatusCodeResponse

    type BerryFirmnessReadArgs = {
      pathParams:BerryFirmnessReadPathParams;
    }
