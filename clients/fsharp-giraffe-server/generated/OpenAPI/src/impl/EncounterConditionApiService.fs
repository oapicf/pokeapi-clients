namespace OpenAPI
open EncounterConditionApiHandlerParams
open EncounterConditionApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module EncounterConditionApiServiceImplementation =

    //#region Service implementation
    type EncounterConditionApiServiceImpl() =
      interface IEncounterConditionApiService with

        member this.EncounterConditionList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterConditionListDefaultStatusCode { content = content }

        member this.EncounterConditionRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterConditionReadDefaultStatusCode { content = content }

      //#endregion

    let EncounterConditionApiService = EncounterConditionApiServiceImpl() :> IEncounterConditionApiService