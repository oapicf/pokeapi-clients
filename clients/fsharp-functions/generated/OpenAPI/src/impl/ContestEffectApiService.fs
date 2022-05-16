namespace OpenAPI
open ContestEffectApiHandlerParams
open ContestEffectApiServiceInterface
open System.Collections.Generic
open System

module ContestEffectApiServiceImplementation =

    //#region Service implementation
    type ContestEffectApiServiceImpl() =
      interface IContestEffectApiService with

        member this.ContestEffectList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ContestEffectListDefaultStatusCode { content = content }

        member this.ContestEffectRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ContestEffectReadDefaultStatusCode { content = content }

      //#endregion

    let ContestEffectApiService = ContestEffectApiServiceImpl() :> IContestEffectApiService