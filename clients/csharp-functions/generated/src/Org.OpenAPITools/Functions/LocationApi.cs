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
    public partial class LocationApi
    { 
        [FunctionName("LocationApi_LocationAreaList")]
        public async Task<ActionResult<PaginatedLocationAreaSummaryList>> _LocationAreaList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/location-area/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LocationAreaList");
            return method != null
                ? (await ((Task<PaginatedLocationAreaSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_LocationAreaRetrieve")]
        public async Task<ActionResult<LocationAreaDetail>> _LocationAreaRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/location-area/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("LocationAreaRetrieve");
            return method != null
                ? (await ((Task<LocationAreaDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_LocationList")]
        public async Task<ActionResult<PaginatedLocationSummaryList>> _LocationList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/location/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LocationList");
            return method != null
                ? (await ((Task<PaginatedLocationSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_LocationRetrieve")]
        public async Task<ActionResult<LocationDetail>> _LocationRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/location/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("LocationRetrieve");
            return method != null
                ? (await ((Task<LocationDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_PalParkAreaList")]
        public async Task<ActionResult<PaginatedPalParkAreaSummaryList>> _PalParkAreaList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pal-park-area/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PalParkAreaList");
            return method != null
                ? (await ((Task<PaginatedPalParkAreaSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_PalParkAreaRetrieve")]
        public async Task<ActionResult<PalParkAreaDetail>> _PalParkAreaRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pal-park-area/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("PalParkAreaRetrieve");
            return method != null
                ? (await ((Task<PalParkAreaDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_RegionList")]
        public async Task<ActionResult<PaginatedRegionSummaryList>> _RegionList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/region/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RegionList");
            return method != null
                ? (await ((Task<PaginatedRegionSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_RegionRetrieve")]
        public async Task<ActionResult<RegionDetail>> _RegionRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/region/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("RegionRetrieve");
            return method != null
                ? (await ((Task<RegionDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
