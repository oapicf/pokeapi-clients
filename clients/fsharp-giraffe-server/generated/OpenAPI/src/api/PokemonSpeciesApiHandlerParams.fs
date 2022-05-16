namespace OpenAPI

open System.Collections.Generic
open System

module PokemonSpeciesApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type PokemonSpeciesListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type PokemonSpeciesListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonSpeciesListResult = PokemonSpeciesListDefaultStatusCode of PokemonSpeciesListDefaultStatusCodeResponse

    type PokemonSpeciesListArgs = {
      queryParams:Result<PokemonSpeciesListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonSpeciesReadPathParams = {
      id : int ;
    }
    //#endregion


    type PokemonSpeciesReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonSpeciesReadResult = PokemonSpeciesReadDefaultStatusCode of PokemonSpeciesReadDefaultStatusCodeResponse

    type PokemonSpeciesReadArgs = {
      pathParams:PokemonSpeciesReadPathParams;
    }
