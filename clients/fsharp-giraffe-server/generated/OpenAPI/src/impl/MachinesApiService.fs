namespace OpenAPI
open OpenAPI.Model.MachineDetail
open OpenAPI.Model.PaginatedMachineSummaryList
open MachinesApiHandlerParams
open MachinesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module MachinesApiServiceImplementation =

    //#region Service implementation
    type MachinesApiServiceImpl() =
      interface IMachinesApiService with

        member this.MachineList ctx args =
            let content = "" :> obj :?> PaginatedMachineSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MachineListStatusCode200 { content = content }

        member this.MachineRetrieve ctx args =
            let content = "" :> obj :?> MachineDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MachineRetrieveStatusCode200 { content = content }

      //#endregion

    let MachinesApiService = MachinesApiServiceImpl() :> IMachinesApiService