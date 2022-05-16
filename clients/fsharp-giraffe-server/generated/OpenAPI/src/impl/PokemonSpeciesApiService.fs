namespace OpenAPI
open PokemonSpeciesApiHandlerParams
open PokemonSpeciesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module PokemonSpeciesApiServiceImplementation =

    //#region Service implementation
    type PokemonSpeciesApiServiceImpl() =
      interface IPokemonSpeciesApiService with

        member this.PokemonSpeciesList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonSpeciesListDefaultStatusCode { content = content }

        member this.PokemonSpeciesRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonSpeciesReadDefaultStatusCode { content = content }

      //#endregion

    let PokemonSpeciesApiService = PokemonSpeciesApiServiceImpl() :> IPokemonSpeciesApiService