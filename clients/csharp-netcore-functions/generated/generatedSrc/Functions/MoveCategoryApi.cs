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
    public partial class MoveCategoryApi
    { 
        [FunctionName("MoveCategoryApi_MoveCategoryList")]
        public async Task<IActionResult> _MoveCategoryList([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-category/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MoveCategoryList");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MoveCategoryApi_MoveCategoryRead")]
        public async Task<IActionResult> _MoveCategoryRead([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-category/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("MoveCategoryRead");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
