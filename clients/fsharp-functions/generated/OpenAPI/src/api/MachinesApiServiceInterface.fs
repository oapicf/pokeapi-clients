namespace OpenAPI
open MachinesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MachinesApiServiceInterface =

    //#region Service interface
    type IMachinesApiService =
      abstract member MachineList : unit -> MachineListResult
      abstract member MachineRetrieve : unit -> MachineRetrieveResult
    //#endregion