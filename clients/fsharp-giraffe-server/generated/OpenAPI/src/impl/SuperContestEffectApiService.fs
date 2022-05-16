namespace OpenAPI
open SuperContestEffectApiHandlerParams
open SuperContestEffectApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module SuperContestEffectApiServiceImplementation =

    //#region Service implementation
    type SuperContestEffectApiServiceImpl() =
      interface ISuperContestEffectApiService with

        member this.SuperContestEffectList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SuperContestEffectListDefaultStatusCode { content = content }

        member this.SuperContestEffectRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SuperContestEffectReadDefaultStatusCode { content = content }

      //#endregion

    let SuperContestEffectApiService = SuperContestEffectApiServiceImpl() :> ISuperContestEffectApiService