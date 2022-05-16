namespace OpenAPI

open System.Collections.Generic
open System

module BerryFlavorApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type BerryFlavorListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type BerryFlavorListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type BerryFlavorListResult = BerryFlavorListDefaultStatusCode of BerryFlavorListDefaultStatusCodeResponse

    type BerryFlavorListArgs = {
      queryParams:Result<BerryFlavorListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BerryFlavorReadPathParams = {
      id : int ;
    }
    //#endregion


    type BerryFlavorReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type BerryFlavorReadResult = BerryFlavorReadDefaultStatusCode of BerryFlavorReadDefaultStatusCodeResponse

    type BerryFlavorReadArgs = {
      pathParams:BerryFlavorReadPathParams;
    }
