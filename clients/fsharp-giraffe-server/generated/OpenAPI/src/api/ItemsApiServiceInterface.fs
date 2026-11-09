namespace OpenAPI
open ItemsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ItemsApiServiceInterface =

    //#region Service interface
    type IItemsApiService =
      abstract member CurrencyList:HttpContext -> CurrencyListArgs->CurrencyListResult
      abstract member CurrencyRetrieve:HttpContext -> CurrencyRetrieveArgs->CurrencyRetrieveResult
      abstract member ItemAttributeList:HttpContext -> ItemAttributeListArgs->ItemAttributeListResult
      abstract member ItemAttributeRetrieve:HttpContext -> ItemAttributeRetrieveArgs->ItemAttributeRetrieveResult
      abstract member ItemCategoryList:HttpContext -> ItemCategoryListArgs->ItemCategoryListResult
      abstract member ItemCategoryRetrieve:HttpContext -> ItemCategoryRetrieveArgs->ItemCategoryRetrieveResult
      abstract member ItemFlingEffectList:HttpContext -> ItemFlingEffectListArgs->ItemFlingEffectListResult
      abstract member ItemFlingEffectRetrieve:HttpContext -> ItemFlingEffectRetrieveArgs->ItemFlingEffectRetrieveResult
      abstract member ItemList:HttpContext -> ItemListArgs->ItemListResult
      abstract member ItemPocketList:HttpContext -> ItemPocketListArgs->ItemPocketListResult
      abstract member ItemPocketRetrieve:HttpContext -> ItemPocketRetrieveArgs->ItemPocketRetrieveResult
      abstract member ItemRetrieve:HttpContext -> ItemRetrieveArgs->ItemRetrieveResult
    //#endregion