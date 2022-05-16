namespace OpenAPI
open EncounterMethodApiHandlerParams
open EncounterMethodApiServiceInterface
open System.Collections.Generic
open System

module EncounterMethodApiServiceImplementation =

    //#region Service implementation
    type EncounterMethodApiServiceImpl() =
      interface IEncounterMethodApiService with

        member this.EncounterMethodList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterMethodListDefaultStatusCode { content = content }

        member this.EncounterMethodRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterMethodReadDefaultStatusCode { content = content }

      //#endregion

    let EncounterMethodApiService = EncounterMethodApiServiceImpl() :> IEncounterMethodApiService