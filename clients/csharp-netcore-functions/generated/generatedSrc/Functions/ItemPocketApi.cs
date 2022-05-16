/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Net;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;

namespace Org.OpenAPITools.Apis
{ 
    public partial class ItemPocketApi
    { 
        [FunctionName("ItemPocketApi_ItemPocketList")]
        public async Task<IActionResult> _ItemPocketList([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-pocket/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ItemPocketList");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ItemPocketApi_ItemPocketRead")]
        public async Task<IActionResult> _ItemPocketRead([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-pocket/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("ItemPocketRead");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}

