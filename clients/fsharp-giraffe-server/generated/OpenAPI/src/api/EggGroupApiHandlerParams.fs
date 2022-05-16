namespace OpenAPI

open System.Collections.Generic
open System

module EggGroupApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type EggGroupListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type EggGroupListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EggGroupListResult = EggGroupListDefaultStatusCode of EggGroupListDefaultStatusCodeResponse

    type EggGroupListArgs = {
      queryParams:Result<EggGroupListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EggGroupReadPathParams = {
      id : int ;
    }
    //#endregion


    type EggGroupReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EggGroupReadResult = EggGroupReadDefaultStatusCode of EggGroupReadDefaultStatusCodeResponse

    type EggGroupReadArgs = {
      pathParams:EggGroupReadPathParams;
    }
