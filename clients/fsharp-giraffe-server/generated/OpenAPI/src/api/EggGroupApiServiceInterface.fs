namespace OpenAPI
open EggGroupApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module EggGroupApiServiceInterface =

    //#region Service interface
    type IEggGroupApiService =
      abstract member EggGroupList:HttpContext -> EggGroupListArgs->EggGroupListResult
      abstract member EggGroupRead:HttpContext -> EggGroupReadArgs->EggGroupReadResult
    //#endregion