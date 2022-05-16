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
    public partial class VersionGroupApi
    { 
        [FunctionName("VersionGroupApi_VersionGroupList")]
        public async Task<IActionResult> _VersionGroupList([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/version-group/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("VersionGroupList");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VersionGroupApi_VersionGroupRead")]
        public async Task<IActionResult> _VersionGroupRead([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/version-group/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("VersionGroupRead");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}

