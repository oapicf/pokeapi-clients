namespace OpenAPI

open System.Collections.Generic
open System

module AbilityApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type AbilityListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type AbilityListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type AbilityListResult = AbilityListDefaultStatusCode of AbilityListDefaultStatusCodeResponse

    type AbilityListArgs = {
      queryParams:Result<AbilityListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AbilityReadPathParams = {
      id : int ;
    }
    //#endregion


    type AbilityReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type AbilityReadResult = AbilityReadDefaultStatusCode of AbilityReadDefaultStatusCodeResponse

    type AbilityReadArgs = {
      pathParams:AbilityReadPathParams;
    }
