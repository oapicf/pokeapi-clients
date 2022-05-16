namespace OpenAPI

open System.Collections.Generic
open System

module PokemonShapeApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type PokemonShapeListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type PokemonShapeListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonShapeListResult = PokemonShapeListDefaultStatusCode of PokemonShapeListDefaultStatusCodeResponse

    type PokemonShapeListArgs = {
      queryParams:Result<PokemonShapeListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PokemonShapeReadPathParams = {
      id : int ;
    }
    //#endregion


    type PokemonShapeReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PokemonShapeReadResult = PokemonShapeReadDefaultStatusCode of PokemonShapeReadDefaultStatusCodeResponse

    type PokemonShapeReadArgs = {
      pathParams:PokemonShapeReadPathParams;
    }
