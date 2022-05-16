namespace OpenAPI

open System.Collections.Generic
open System

module MoveApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MoveListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type MoveListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveListResult = MoveListDefaultStatusCode of MoveListDefaultStatusCodeResponse

    type MoveListArgs = {
      queryParams:Result<MoveListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveReadPathParams = {
      id : int ;
    }
    //#endregion


    type MoveReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveReadResult = MoveReadDefaultStatusCode of MoveReadDefaultStatusCodeResponse

    type MoveReadArgs = {
      pathParams:MoveReadPathParams;
    }
