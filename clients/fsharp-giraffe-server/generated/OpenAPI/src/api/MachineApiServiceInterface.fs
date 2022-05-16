namespace OpenAPI
open MachineApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MachineApiServiceInterface =

    //#region Service interface
    type IMachineApiService =
      abstract member MachineList:HttpContext -> MachineListArgs->MachineListResult
      abstract member MachineRead:HttpContext -> MachineReadArgs->MachineReadResult
    //#endregion