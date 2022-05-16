namespace OpenAPI

open System.Collections.Generic
open System

module PokemonColorApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type PokemonColorListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type PokemonColorListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonColorListResult = PokemonColorListDefaultStatusCode of PokemonColorListDefaultStatusCodeResponse

    type PokemonColorListArgs = {
      queryParams:Result<PokemonColorListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonColorReadPathParams = {
      id : int ;
    }
    //#endregion


    type PokemonColorReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonColorReadResult = PokemonColorReadDefaultStatusCode of PokemonColorReadDefaultStatusCodeResponse

    type PokemonColorReadArgs = {
      pathParams:PokemonColorReadPathParams;
    }
