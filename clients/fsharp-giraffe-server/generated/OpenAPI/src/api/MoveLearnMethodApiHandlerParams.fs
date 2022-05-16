namespace OpenAPI

open System.Collections.Generic
open System

module MoveLearnMethodApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MoveLearnMethodListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type MoveLearnMethodListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveLearnMethodListResult = MoveLearnMethodListDefaultStatusCode of MoveLearnMethodListDefaultStatusCodeResponse

    type MoveLearnMethodListArgs = {
      queryParams:Result<MoveLearnMethodListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveLearnMethodReadPathParams = {
      id : int ;
    }
    //#endregion


    type MoveLearnMethodReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveLearnMethodReadResult = MoveLearnMethodReadDefaultStatusCode of MoveLearnMethodReadDefaultStatusCodeResponse

    type MoveLearnMethodReadArgs = {
      pathParams:MoveLearnMethodReadPathParams;
    }
