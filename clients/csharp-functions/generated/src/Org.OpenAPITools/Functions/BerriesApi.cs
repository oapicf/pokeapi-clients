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
    public partial class BerriesApi
    { 
        [FunctionName("BerriesApi_BerryFirmnessList")]
        public async Task<ActionResult<PaginatedBerryFirmnessSummaryList>> _BerryFirmnessList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/berry-firmness/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("BerryFirmnessList");
            return method != null
                ? (await ((Task<PaginatedBerryFirmnessSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BerriesApi_BerryFirmnessRetrieve")]
        public async Task<ActionResult<BerryFirmnessDetail>> _BerryFirmnessRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/berry-firmness/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("BerryFirmnessRetrieve");
            return method != null
                ? (await ((Task<BerryFirmnessDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BerriesApi_BerryFlavorList")]
        public async Task<ActionResult<PaginatedBerryFlavorSummaryList>> _BerryFlavorList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/berry-flavor/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("BerryFlavorList");
            return method != null
                ? (await ((Task<PaginatedBerryFlavorSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BerriesApi_BerryFlavorRetrieve")]
        public async Task<ActionResult<BerryFlavorDetail>> _BerryFlavorRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/berry-flavor/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("BerryFlavorRetrieve");
            return method != null
                ? (await ((Task<BerryFlavorDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BerriesApi_BerryList")]
        public async Task<ActionResult<PaginatedBerrySummaryList>> _BerryList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/berry/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("BerryList");
            return method != null
                ? (await ((Task<PaginatedBerrySummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BerriesApi_BerryRetrieve")]
        public async Task<ActionResult<BerryDetail>> _BerryRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/berry/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("BerryRetrieve");
            return method != null
                ? (await ((Task<BerryDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
