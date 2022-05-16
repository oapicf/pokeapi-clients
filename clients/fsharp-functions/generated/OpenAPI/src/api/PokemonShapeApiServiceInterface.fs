namespace OpenAPI
open PokemonShapeApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PokemonShapeApiServiceInterface =

    //#region Service interface
    type IPokemonShapeApiService =
      abstract member PokemonShapeList : unit -> PokemonShapeListResult
      abstract member PokemonShapeRead : unit -> PokemonShapeReadResult
    //#endregion