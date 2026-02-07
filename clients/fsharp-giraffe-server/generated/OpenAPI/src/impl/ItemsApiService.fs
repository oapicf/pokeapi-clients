namespace OpenAPI
open OpenAPI.Model.ItemAttributeDetail
open OpenAPI.Model.ItemCategoryDetail
open OpenAPI.Model.ItemDetail
open OpenAPI.Model.ItemFlingEffectDetail
open OpenAPI.Model.ItemPocketDetail
open OpenAPI.Model.PaginatedItemAttributeSummaryList
open OpenAPI.Model.PaginatedItemCategorySummaryList
open OpenAPI.Model.PaginatedItemFlingEffectSummaryList
open OpenAPI.Model.PaginatedItemPocketSummaryList
open OpenAPI.Model.PaginatedItemSummaryList
open ItemsApiHandlerParams
open ItemsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ItemsApiServiceImplementation =

    //#region Service implementation
    type ItemsApiServiceImpl() =
      interface IItemsApiService with

        member this.ItemAttributeList ctx args =
            let content = "" :> obj :?> PaginatedItemAttributeSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemAttributeListStatusCode200 { content = content }

        member this.ItemAttributeRetrieve ctx args =
            let content = "" :> obj :?> ItemAttributeDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemAttributeRetrieveStatusCode200 { content = content }

        member this.ItemCategoryList ctx args =
            let content = "" :> obj :?> PaginatedItemCategorySummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemCategoryListStatusCode200 { content = content }

        member this.ItemCategoryRetrieve ctx args =
            let content = "" :> obj :?> ItemCategoryDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemCategoryRetrieveStatusCode200 { content = content }

        member this.ItemFlingEffectList ctx args =
            let content = "" :> obj :?> PaginatedItemFlingEffectSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemFlingEffectListStatusCode200 { content = content }

        member this.ItemFlingEffectRetrieve ctx args =
            let content = "" :> obj :?> ItemFlingEffectDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemFlingEffectRetrieveStatusCode200 { content = content }

        member this.ItemList ctx args =
            let content = "" :> obj :?> PaginatedItemSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemListStatusCode200 { content = content }

        member this.ItemPocketList ctx args =
            let content = "" :> obj :?> PaginatedItemPocketSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemPocketListStatusCode200 { content = content }

        member this.ItemPocketRetrieve ctx args =
            let content = "" :> obj :?> ItemPocketDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemPocketRetrieveStatusCode200 { content = content }

        member this.ItemRetrieve ctx args =
            let content = "" :> obj :?> ItemDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemRetrieveStatusCode200 { content = content }

      //#endregion

    let ItemsApiService = ItemsApiServiceImpl() :> IItemsApiService