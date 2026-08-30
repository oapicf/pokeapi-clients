using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List contest effects
/// </summary>

public class ContestEffectListEndpoint : FastEndpoints.Endpoint<ContestEffectListRequest, PaginatedContestEffectSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/contest-effect/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("contests");
        });

        Summary(s => {
            s.Summary = "List contest effects";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ContestEffectListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get contest effect
/// </summary>

public class ContestEffectRetrieveEndpoint : FastEndpoints.Endpoint<ContestEffectRetrieveRequest, ContestEffectDetail>
{
    public override void Configure()
    {
        Get("/api/v2/contest-effect/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("contests");
        });

        Summary(s => {
            s.Summary = "Get contest effect";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ContestEffectRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List contest types
/// </summary>

public class ContestTypeListEndpoint : FastEndpoints.Endpoint<ContestTypeListRequest, PaginatedContestTypeSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/contest-type/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("contests");
        });

        Summary(s => {
            s.Summary = "List contest types";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ContestTypeListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get contest type
/// </summary>

public class ContestTypeRetrieveEndpoint : FastEndpoints.Endpoint<ContestTypeRetrieveRequest, ContestTypeDetail>
{
    public override void Configure()
    {
        Get("/api/v2/contest-type/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("contests");
        });

        Summary(s => {
            s.Summary = "Get contest type";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ContestTypeRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List super contest effects
/// </summary>

public class SuperContestEffectListEndpoint : FastEndpoints.Endpoint<SuperContestEffectListRequest, PaginatedSuperContestEffectSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/super-contest-effect/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("contests");
        });

        Summary(s => {
            s.Summary = "List super contest effects";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(SuperContestEffectListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get super contest effect
/// </summary>

public class SuperContestEffectRetrieveEndpoint : FastEndpoints.Endpoint<SuperContestEffectRetrieveRequest, SuperContestEffectDetail>
{
    public override void Configure()
    {
        Get("/api/v2/super-contest-effect/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("contests");
        });

        Summary(s => {
            s.Summary = "Get super contest effect";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(SuperContestEffectRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

