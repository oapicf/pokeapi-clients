namespace OpenAPI

open System.Collections.Generic
open System

module ContestEffectApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ContestEffectListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type ContestEffectListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ContestEffectListResult = ContestEffectListDefaultStatusCode of ContestEffectListDefaultStatusCodeResponse

    type ContestEffectListArgs = {
      queryParams:Result<ContestEffectListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ContestEffectReadPathParams = {
      id : int ;
    }
    //#endregion


    type ContestEffectReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ContestEffectReadResult = ContestEffectReadDefaultStatusCode of ContestEffectReadDefaultStatusCodeResponse

    type ContestEffectReadArgs = {
      pathParams:ContestEffectReadPathParams;
    }
