namespace OpenAPI

open System.Collections.Generic
open System

module SuperContestEffectApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type SuperContestEffectListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type SuperContestEffectListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type SuperContestEffectListResult = SuperContestEffectListDefaultStatusCode of SuperContestEffectListDefaultStatusCodeResponse

    type SuperContestEffectListArgs = {
      queryParams:Result<SuperContestEffectListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SuperContestEffectReadPathParams = {
      id : int ;
    }
    //#endregion


    type SuperContestEffectReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type SuperContestEffectReadResult = SuperContestEffectReadDefaultStatusCode of SuperContestEffectReadDefaultStatusCodeResponse

    type SuperContestEffectReadArgs = {
      pathParams:SuperContestEffectReadPathParams;
    }
