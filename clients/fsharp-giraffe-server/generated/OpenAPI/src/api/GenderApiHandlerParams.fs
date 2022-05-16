namespace OpenAPI

open System.Collections.Generic
open System

module GenderApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type GenderListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type GenderListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GenderListResult = GenderListDefaultStatusCode of GenderListDefaultStatusCodeResponse

    type GenderListArgs = {
      queryParams:Result<GenderListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GenderReadPathParams = {
      id : int ;
    }
    //#endregion


    type GenderReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GenderReadResult = GenderReadDefaultStatusCode of GenderReadDefaultStatusCodeResponse

    type GenderReadArgs = {
      pathParams:GenderReadPathParams;
    }
