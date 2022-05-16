namespace OpenAPI
open EvolutionTriggerApiHandlerParams
open EvolutionTriggerApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module EvolutionTriggerApiServiceImplementation =

    //#region Service implementation
    type EvolutionTriggerApiServiceImpl() =
      interface IEvolutionTriggerApiService with

        member this.EvolutionTriggerList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EvolutionTriggerListDefaultStatusCode { content = content }

        member this.EvolutionTriggerRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EvolutionTriggerReadDefaultStatusCode { content = content }

      //#endregion

    let EvolutionTriggerApiService = EvolutionTriggerApiServiceImpl() :> IEvolutionTriggerApiService