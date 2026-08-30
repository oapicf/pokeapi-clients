using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List encounter conditions
/// </summary>

public class EncounterConditionListEndpoint : FastEndpoints.Endpoint<EncounterConditionListRequest, PaginatedEncounterConditionSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/encounter-condition/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("encounters");
        });

        Summary(s => {
            s.Summary = "List encounter conditions";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EncounterConditionListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get encounter condition
/// </summary>

public class EncounterConditionRetrieveEndpoint : FastEndpoints.Endpoint<EncounterConditionRetrieveRequest, EncounterConditionDetail>
{
    public override void Configure()
    {
        Get("/api/v2/encounter-condition/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("encounters");
        });

        Summary(s => {
            s.Summary = "Get encounter condition";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EncounterConditionRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List encounter condition values
/// </summary>

public class EncounterConditionValueListEndpoint : FastEndpoints.Endpoint<EncounterConditionValueListRequest, PaginatedEncounterConditionValueSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/encounter-condition-value/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("encounters");
        });

        Summary(s => {
            s.Summary = "List encounter condition values";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EncounterConditionValueListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get encounter condition value
/// </summary>

public class EncounterConditionValueRetrieveEndpoint : FastEndpoints.Endpoint<EncounterConditionValueRetrieveRequest, EncounterConditionValueDetail>
{
    public override void Configure()
    {
        Get("/api/v2/encounter-condition-value/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("encounters");
        });

        Summary(s => {
            s.Summary = "Get encounter condition value";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EncounterConditionValueRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List encounter methods
/// </summary>

public class EncounterMethodListEndpoint : FastEndpoints.Endpoint<EncounterMethodListRequest, PaginatedEncounterMethodSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/encounter-method/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("encounters");
        });

        Summary(s => {
            s.Summary = "List encounter methods";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EncounterMethodListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get encounter method
/// </summary>

public class EncounterMethodRetrieveEndpoint : FastEndpoints.Endpoint<EncounterMethodRetrieveRequest, EncounterMethodDetail>
{
    public override void Configure()
    {
        Get("/api/v2/encounter-method/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("encounters");
        });

        Summary(s => {
            s.Summary = "Get encounter method";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EncounterMethodRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

