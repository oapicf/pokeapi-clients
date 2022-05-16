namespace OpenAPI

open System.Collections.Generic
open System

module MoveBattleStyleApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MoveBattleStyleListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type MoveBattleStyleListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveBattleStyleListResult = MoveBattleStyleListDefaultStatusCode of MoveBattleStyleListDefaultStatusCodeResponse

    type MoveBattleStyleListArgs = {
      queryParams:Result<MoveBattleStyleListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveBattleStyleReadPathParams = {
      id : int ;
    }
    //#endregion


    type MoveBattleStyleReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveBattleStyleReadResult = MoveBattleStyleReadDefaultStatusCode of MoveBattleStyleReadDefaultStatusCodeResponse

    type MoveBattleStyleReadArgs = {
      pathParams:MoveBattleStyleReadPathParams;
    }
