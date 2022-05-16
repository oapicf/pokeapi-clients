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
    public partial class LocationApi
    { 
        [FunctionName("LocationApi_LocationList")]
        public async Task<IActionResult> _LocationList([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/location/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LocationList");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_LocationRead")]
        public async Task<IActionResult> _LocationRead([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/location/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("LocationRead");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}

