namespace OpenAPI
open PokemonSpeciesApiHandlerParams
open PokemonSpeciesApiServiceInterface
open System.Collections.Generic
open System

module PokemonSpeciesApiServiceImplementation =

    //#region Service implementation
    type PokemonSpeciesApiServiceImpl() =
      interface IPokemonSpeciesApiService with

        member this.PokemonSpeciesList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonSpeciesListDefaultStatusCode { content = content }

        member this.PokemonSpeciesRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonSpeciesReadDefaultStatusCode { content = content }

      //#endregion

    let PokemonSpeciesApiService = PokemonSpeciesApiServiceImpl() :> IPokemonSpeciesApiService