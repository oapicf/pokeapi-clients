namespace OpenAPI
open BerriesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BerriesApiServiceInterface =

    //#region Service interface
    type IBerriesApiService =
      abstract member BerryFirmnessList:HttpContext -> BerryFirmnessListArgs->BerryFirmnessListResult
      abstract member BerryFirmnessRetrieve:HttpContext -> BerryFirmnessRetrieveArgs->BerryFirmnessRetrieveResult
      abstract member BerryFlavorList:HttpContext -> BerryFlavorListArgs->BerryFlavorListResult
      abstract member BerryFlavorRetrieve:HttpContext -> BerryFlavorRetrieveArgs->BerryFlavorRetrieveResult
      abstract member BerryList:HttpContext -> BerryListArgs->BerryListResult
      abstract member BerryRetrieve:HttpContext -> BerryRetrieveArgs->BerryRetrieveResult
    //#endregion