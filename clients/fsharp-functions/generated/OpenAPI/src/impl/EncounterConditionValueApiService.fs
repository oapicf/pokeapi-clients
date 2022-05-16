namespace OpenAPI
open EncounterConditionValueApiHandlerParams
open EncounterConditionValueApiServiceInterface
open System.Collections.Generic
open System

module EncounterConditionValueApiServiceImplementation =

    //#region Service implementation
    type EncounterConditionValueApiServiceImpl() =
      interface IEncounterConditionValueApiService with

        member this.EncounterConditionValueList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterConditionValueListDefaultStatusCode { content = content }

        member this.EncounterConditionValueRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterConditionValueReadDefaultStatusCode { content = content }

      //#endregion

    let EncounterConditionValueApiService = EncounterConditionValueApiServiceImpl() :> IEncounterConditionValueApiService