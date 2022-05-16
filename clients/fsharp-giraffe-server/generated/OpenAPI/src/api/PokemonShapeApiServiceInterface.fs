namespace OpenAPI
open PokemonShapeApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PokemonShapeApiServiceInterface =

    //#region Service interface
    type IPokemonShapeApiService =
      abstract member PokemonShapeList:HttpContext -> PokemonShapeListArgs->PokemonShapeListResult
      abstract member PokemonShapeRead:HttpContext -> PokemonShapeReadArgs->PokemonShapeReadResult
    //#endregion