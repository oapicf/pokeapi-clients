namespace OpenAPI
open EncounterConditionValueApiHandlerParams
open EncounterConditionValueApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module EncounterConditionValueApiServiceImplementation =

    //#region Service implementation
    type EncounterConditionValueApiServiceImpl() =
      interface IEncounterConditionValueApiService with

        member this.EncounterConditionValueList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterConditionValueListDefaultStatusCode { content = content }

        member this.EncounterConditionValueRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterConditionValueReadDefaultStatusCode { content = content }

      //#endregion

    let EncounterConditionValueApiService = EncounterConditionValueApiServiceImpl() :> IEncounterConditionValueApiService