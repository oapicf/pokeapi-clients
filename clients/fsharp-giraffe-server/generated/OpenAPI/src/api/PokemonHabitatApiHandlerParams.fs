namespace OpenAPI

open System.Collections.Generic
open System

module PokemonHabitatApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type PokemonHabitatListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type PokemonHabitatListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonHabitatListResult = PokemonHabitatListDefaultStatusCode of PokemonHabitatListDefaultStatusCodeResponse

    type PokemonHabitatListArgs = {
      queryParams:Result<PokemonHabitatListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonHabitatReadPathParams = {
      id : int ;
    }
    //#endregion


    type PokemonHabitatReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonHabitatReadResult = PokemonHabitatReadDefaultStatusCode of PokemonHabitatReadDefaultStatusCodeResponse

    type PokemonHabitatReadArgs = {
      pathParams:PokemonHabitatReadPathParams;
    }
