namespace OpenAPI
open MachineApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MachineApiServiceInterface =

    //#region Service interface
    type IMachineApiService =
      abstract member MachineList : unit -> MachineListResult
      abstract member MachineRead : unit -> MachineReadResult
    //#endregion