namespace OpenAPI

open System.Collections.Generic
open System

module PokemonApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type PokemonListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type PokemonListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonListResult = PokemonListDefaultStatusCode of PokemonListDefaultStatusCodeResponse

    type PokemonListArgs = {
      queryParams:Result<PokemonListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonReadPathParams = {
      id : int ;
    }
    //#endregion


    type PokemonReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonReadResult = PokemonReadDefaultStatusCode of PokemonReadDefaultStatusCodeResponse

    type PokemonReadArgs = {
      pathParams:PokemonReadPathParams;
    }
