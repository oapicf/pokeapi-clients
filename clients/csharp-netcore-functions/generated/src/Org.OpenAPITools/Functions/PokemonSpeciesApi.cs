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
    public partial class PokemonSpeciesApi
    { 
        [FunctionName("PokemonSpeciesApi_PokemonSpeciesList")]
        public async Task<ActionResult<string>> _PokemonSpeciesList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-species/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PokemonSpeciesList");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }

        [FunctionName("PokemonSpeciesApi_PokemonSpeciesRead")]
        public async Task<ActionResult<string>> _PokemonSpeciesRead([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-species/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("PokemonSpeciesRead");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }
    }
}
