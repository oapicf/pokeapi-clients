namespace OpenAPI

open System.Collections.Generic
open System

module PokemonFormApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type PokemonFormListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type PokemonFormListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonFormListResult = PokemonFormListDefaultStatusCode of PokemonFormListDefaultStatusCodeResponse

    type PokemonFormListArgs = {
      queryParams:Result<PokemonFormListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonFormReadPathParams = {
      id : int ;
    }
    //#endregion


    type PokemonFormReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonFormReadResult = PokemonFormReadDefaultStatusCode of PokemonFormReadDefaultStatusCodeResponse

    type PokemonFormReadArgs = {
      pathParams:PokemonFormReadPathParams;
    }
