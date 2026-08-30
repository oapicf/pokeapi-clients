using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List evolution chains
/// </summary>

public class EvolutionChainListEndpoint : FastEndpoints.Endpoint<EvolutionChainListRequest, PaginatedEvolutionChainSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/evolution-chain/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("evolution");
        });

        Summary(s => {
            s.Summary = "List evolution chains";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EvolutionChainListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get evolution chain
/// </summary>

public class EvolutionChainRetrieveEndpoint : FastEndpoints.Endpoint<EvolutionChainRetrieveRequest, EvolutionChainDetail>
{
    public override void Configure()
    {
        Get("/api/v2/evolution-chain/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("evolution");
        });

        Summary(s => {
            s.Summary = "Get evolution chain";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EvolutionChainRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List evolution triggers
/// </summary>

public class EvolutionTriggerListEndpoint : FastEndpoints.Endpoint<EvolutionTriggerListRequest, PaginatedEvolutionTriggerSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/evolution-trigger/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("evolution");
        });

        Summary(s => {
            s.Summary = "List evolution triggers";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EvolutionTriggerListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get evolution trigger
/// </summary>

public class EvolutionTriggerRetrieveEndpoint : FastEndpoints.Endpoint<EvolutionTriggerRetrieveRequest, EvolutionTriggerDetail>
{
    public override void Configure()
    {
        Get("/api/v2/evolution-trigger/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("evolution");
        });

        Summary(s => {
            s.Summary = "Get evolution trigger";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EvolutionTriggerRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

