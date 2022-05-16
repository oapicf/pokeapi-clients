namespace OpenAPI
open GrowthRateApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module GrowthRateApiServiceInterface =

    //#region Service interface
    type IGrowthRateApiService =
      abstract member GrowthRateList:HttpContext -> GrowthRateListArgs->GrowthRateListResult
      abstract member GrowthRateRead:HttpContext -> GrowthRateReadArgs->GrowthRateReadResult
    //#endregion