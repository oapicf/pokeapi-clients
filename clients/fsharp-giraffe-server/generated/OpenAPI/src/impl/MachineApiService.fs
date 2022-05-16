namespace OpenAPI
open MachineApiHandlerParams
open MachineApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module MachineApiServiceImplementation =

    //#region Service implementation
    type MachineApiServiceImpl() =
      interface IMachineApiService with

        member this.MachineList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MachineListDefaultStatusCode { content = content }

        member this.MachineRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MachineReadDefaultStatusCode { content = content }

      //#endregion

    let MachineApiService = MachineApiServiceImpl() :> IMachineApiService