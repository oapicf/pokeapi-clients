using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class ItemsApi
    { 
        [FunctionName("ItemsApi_ItemAttributeList")]
        public async Task<ActionResult<PaginatedItemAttributeSummaryList>> _ItemAttributeList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item-attribute/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ItemAttributeList");
            return method != null
                ? (await ((Task<PaginatedItemAttributeSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ItemsApi_ItemAttributeRetrieve")]
        public async Task<ActionResult<ItemAttributeDetail>> _ItemAttributeRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item-attribute/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("ItemAttributeRetrieve");
            return method != null
                ? (await ((Task<ItemAttributeDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ItemsApi_ItemCategoryList")]
        public async Task<ActionResult<PaginatedItemCategorySummaryList>> _ItemCategoryList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item-category/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ItemCategoryList");
            return method != null
                ? (await ((Task<PaginatedItemCategorySummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ItemsApi_ItemCategoryRetrieve")]
        public async Task<ActionResult<ItemCategoryDetail>> _ItemCategoryRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item-category/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("ItemCategoryRetrieve");
            return method != null
                ? (await ((Task<ItemCategoryDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ItemsApi_ItemFlingEffectList")]
        public async Task<ActionResult<PaginatedItemFlingEffectSummaryList>> _ItemFlingEffectList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item-fling-effect/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ItemFlingEffectList");
            return method != null
                ? (await ((Task<PaginatedItemFlingEffectSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ItemsApi_ItemFlingEffectRetrieve")]
        public async Task<ActionResult<ItemFlingEffectDetail>> _ItemFlingEffectRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item-fling-effect/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("ItemFlingEffectRetrieve");
            return method != null
                ? (await ((Task<ItemFlingEffectDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ItemsApi_ItemList")]
        public async Task<ActionResult<PaginatedItemSummaryList>> _ItemList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ItemList");
            return method != null
                ? (await ((Task<PaginatedItemSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ItemsApi_ItemPocketList")]
        public async Task<ActionResult<PaginatedItemPocketSummaryList>> _ItemPocketList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item-pocket/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ItemPocketList");
            return method != null
                ? (await ((Task<PaginatedItemPocketSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ItemsApi_ItemPocketRetrieve")]
        public async Task<ActionResult<ItemPocketDetail>> _ItemPocketRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item-pocket/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("ItemPocketRetrieve");
            return method != null
                ? (await ((Task<ItemPocketDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ItemsApi_ItemRetrieve")]
        public async Task<ActionResult<ItemDetail>> _ItemRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("ItemRetrieve");
            return method != null
                ? (await ((Task<ItemDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
