namespace OpenAPI

open System.Collections.Generic
open System

module MoveTargetApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MoveTargetListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type MoveTargetListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveTargetListResult = MoveTargetListDefaultStatusCode of MoveTargetListDefaultStatusCodeResponse

    type MoveTargetListArgs = {
      queryParams:Result<MoveTargetListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveTargetReadPathParams = {
      id : int ;
    }
    //#endregion


    type MoveTargetReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveTargetReadResult = MoveTargetReadDefaultStatusCode of MoveTargetReadDefaultStatusCodeResponse

    type MoveTargetReadArgs = {
      pathParams:MoveTargetReadPathParams;
    }
