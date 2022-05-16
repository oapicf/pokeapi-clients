namespace OpenAPI
open PokemonHabitatApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PokemonHabitatApiServiceInterface =

    //#region Service interface
    type IPokemonHabitatApiService =
      abstract member PokemonHabitatList : unit -> PokemonHabitatListResult
      abstract member PokemonHabitatRead : unit -> PokemonHabitatReadResult
    //#endregion