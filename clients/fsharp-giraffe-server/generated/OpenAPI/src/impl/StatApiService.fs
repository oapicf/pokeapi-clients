namespace OpenAPI
open StatApiHandlerParams
open StatApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module StatApiServiceImplementation =

    //#region Service implementation
    type StatApiServiceImpl() =
      interface IStatApiService with

        member this.StatList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            StatListDefaultStatusCode { content = content }

        member this.StatRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            StatReadDefaultStatusCode { content = content }

      //#endregion

    let StatApiService = StatApiServiceImpl() :> IStatApiService