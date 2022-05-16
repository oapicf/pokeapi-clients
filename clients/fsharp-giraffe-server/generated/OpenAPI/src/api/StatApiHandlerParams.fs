namespace OpenAPI

open System.Collections.Generic
open System

module StatApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type StatListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type StatListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type StatListResult = StatListDefaultStatusCode of StatListDefaultStatusCodeResponse

    type StatListArgs = {
      queryParams:Result<StatListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type StatReadPathParams = {
      id : int ;
    }
    //#endregion


    type StatReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type StatReadResult = StatReadDefaultStatusCode of StatReadDefaultStatusCodeResponse

    type StatReadArgs = {
      pathParams:StatReadPathParams;
    }
