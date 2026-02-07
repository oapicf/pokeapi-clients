namespace OpenAPI
open ItemsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ItemsApiServiceInterface =

    //#region Service interface
    type IItemsApiService =
      abstract member ItemAttributeList : unit -> ItemAttributeListResult
      abstract member ItemAttributeRetrieve : unit -> ItemAttributeRetrieveResult
      abstract member ItemCategoryList : unit -> ItemCategoryListResult
      abstract member ItemCategoryRetrieve : unit -> ItemCategoryRetrieveResult
      abstract member ItemFlingEffectList : unit -> ItemFlingEffectListResult
      abstract member ItemFlingEffectRetrieve : unit -> ItemFlingEffectRetrieveResult
      abstract member ItemList : unit -> ItemListResult
      abstract member ItemPocketList : unit -> ItemPocketListResult
      abstract member ItemPocketRetrieve : unit -> ItemPocketRetrieveResult
      abstract member ItemRetrieve : unit -> ItemRetrieveResult
    //#endregion