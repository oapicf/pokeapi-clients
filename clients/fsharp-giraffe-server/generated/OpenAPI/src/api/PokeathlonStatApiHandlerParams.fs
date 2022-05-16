namespace OpenAPI

open System.Collections.Generic
open System

module PokeathlonStatApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type PokeathlonStatListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type PokeathlonStatListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokeathlonStatListResult = PokeathlonStatListDefaultStatusCode of PokeathlonStatListDefaultStatusCodeResponse

    type PokeathlonStatListArgs = {
      queryParams:Result<PokeathlonStatListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokeathlonStatReadPathParams = {
      id : int ;
    }
    //#endregion


    type PokeathlonStatReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokeathlonStatReadResult = PokeathlonStatReadDefaultStatusCode of PokeathlonStatReadDefaultStatusCodeResponse

    type PokeathlonStatReadArgs = {
      pathParams:PokeathlonStatReadPathParams;
    }
