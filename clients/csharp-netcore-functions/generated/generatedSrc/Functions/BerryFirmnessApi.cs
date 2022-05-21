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
    public partial class BerryFirmnessApi
    { 
        [FunctionName("BerryFirmnessApi_BerryFirmnessList")]
        public async Task<IActionResult> _BerryFirmnessList([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry-firmness/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("BerryFirmnessList");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BerryFirmnessApi_BerryFirmnessRead")]
        public async Task<IActionResult> _BerryFirmnessRead([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry-firmness/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("BerryFirmnessRead");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
