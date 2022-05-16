namespace OpenAPI
open RegionApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module RegionApiServiceInterface =

    //#region Service interface
    type IRegionApiService =
      abstract member RegionList:HttpContext -> RegionListArgs->RegionListResult
      abstract member RegionRead:HttpContext -> RegionReadArgs->RegionReadResult
    //#endregion