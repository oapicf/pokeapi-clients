namespace OpenAPI
open MachinesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MachinesApiServiceInterface =

    //#region Service interface
    type IMachinesApiService =
      abstract member MachineList:HttpContext -> MachineListArgs->MachineListResult
      abstract member MachineRetrieve:HttpContext -> MachineRetrieveArgs->MachineRetrieveResult
    //#endregion