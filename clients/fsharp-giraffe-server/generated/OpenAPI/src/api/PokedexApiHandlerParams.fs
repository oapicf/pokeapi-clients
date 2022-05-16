namespace OpenAPI

open System.Collections.Generic
open System

module PokedexApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type PokedexListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type PokedexListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokedexListResult = PokedexListDefaultStatusCode of PokedexListDefaultStatusCodeResponse

    type PokedexListArgs = {
      queryParams:Result<PokedexListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokedexReadPathParams = {
      id : int ;
    }
    //#endregion


    type PokedexReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokedexReadResult = PokedexReadDefaultStatusCode of PokedexReadDefaultStatusCodeResponse

    type PokedexReadArgs = {
      pathParams:PokedexReadPathParams;
    }
