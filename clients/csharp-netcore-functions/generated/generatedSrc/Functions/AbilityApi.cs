/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
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
    public partial class AbilityApi
    { 
        [FunctionName("AbilityApi_AbilityList")]
        public async Task<IActionResult> _AbilityList([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/ability/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AbilityList");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AbilityApi_AbilityRead")]
        public async Task<IActionResult> _AbilityRead([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/ability/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("AbilityRead");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}

