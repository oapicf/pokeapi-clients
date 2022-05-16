namespace OpenAPI
open PokemonSpeciesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PokemonSpeciesApiServiceInterface =

    //#region Service interface
    type IPokemonSpeciesApiService =
      abstract member PokemonSpeciesList : unit -> PokemonSpeciesListResult
      abstract member PokemonSpeciesRead : unit -> PokemonSpeciesReadResult
    //#endregion