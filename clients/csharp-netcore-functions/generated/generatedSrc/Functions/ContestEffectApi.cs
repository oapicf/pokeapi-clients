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
    public partial class ContestEffectApi
    { 
        [FunctionName("ContestEffectApi_ContestEffectList")]
        public async Task<IActionResult> _ContestEffectList([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/contest-effect/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ContestEffectList");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestEffectApi_ContestEffectRead")]
        public async Task<IActionResult> _ContestEffectRead([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/contest-effect/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("ContestEffectRead");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}

