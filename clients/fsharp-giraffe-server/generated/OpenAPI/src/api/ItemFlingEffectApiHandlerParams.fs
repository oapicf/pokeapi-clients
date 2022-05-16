namespace OpenAPI

open System.Collections.Generic
open System

module ItemFlingEffectApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ItemFlingEffectListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type ItemFlingEffectListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ItemFlingEffectListResult = ItemFlingEffectListDefaultStatusCode of ItemFlingEffectListDefaultStatusCodeResponse

    type ItemFlingEffectListArgs = {
      queryParams:Result<ItemFlingEffectListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemFlingEffectReadPathParams = {
      id : int ;
    }
    //#endregion


    type ItemFlingEffectReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ItemFlingEffectReadResult = ItemFlingEffectReadDefaultStatusCode of ItemFlingEffectReadDefaultStatusCodeResponse

    type ItemFlingEffectReadArgs = {
      pathParams:ItemFlingEffectReadPathParams;
    }
