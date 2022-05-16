namespace OpenAPI

open System.Collections.Generic
open System

module NatureApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type NatureListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type NatureListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type NatureListResult = NatureListDefaultStatusCode of NatureListDefaultStatusCodeResponse

    type NatureListArgs = {
      queryParams:Result<NatureListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type NatureReadPathParams = {
      id : int ;
    }
    //#endregion


    type NatureReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type NatureReadResult = NatureReadDefaultStatusCode of NatureReadDefaultStatusCodeResponse

    type NatureReadArgs = {
      pathParams:NatureReadPathParams;
    }
