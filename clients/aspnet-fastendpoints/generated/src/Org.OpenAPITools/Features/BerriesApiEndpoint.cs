using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List berry firmness
/// </summary>

public class BerryFirmnessListEndpoint : FastEndpoints.Endpoint<BerryFirmnessListRequest, PaginatedBerryFirmnessSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/berry-firmness/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("berries");
        });

        Summary(s => {
            s.Summary = "List berry firmness";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(BerryFirmnessListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get berry by firmness
/// </summary>

public class BerryFirmnessRetrieveEndpoint : FastEndpoints.Endpoint<BerryFirmnessRetrieveRequest, BerryFirmnessDetail>
{
    public override void Configure()
    {
        Get("/api/v2/berry-firmness/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("berries");
        });

        Summary(s => {
            s.Summary = "Get berry by firmness";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(BerryFirmnessRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List berry flavors
/// </summary>

public class BerryFlavorListEndpoint : FastEndpoints.Endpoint<BerryFlavorListRequest, PaginatedBerryFlavorSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/berry-flavor/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("berries");
        });

        Summary(s => {
            s.Summary = "List berry flavors";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(BerryFlavorListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get berries by flavor
/// </summary>

public class BerryFlavorRetrieveEndpoint : FastEndpoints.Endpoint<BerryFlavorRetrieveRequest, BerryFlavorDetail>
{
    public override void Configure()
    {
        Get("/api/v2/berry-flavor/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("berries");
        });

        Summary(s => {
            s.Summary = "Get berries by flavor";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(BerryFlavorRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List berries
/// </summary>

public class BerryListEndpoint : FastEndpoints.Endpoint<BerryListRequest, PaginatedBerrySummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/berry/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("berries");
        });

        Summary(s => {
            s.Summary = "List berries";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(BerryListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get a berry
/// </summary>

public class BerryRetrieveEndpoint : FastEndpoints.Endpoint<BerryRetrieveRequest, BerryDetail>
{
    public override void Configure()
    {
        Get("/api/v2/berry/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("berries");
        });

        Summary(s => {
            s.Summary = "Get a berry";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(BerryRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

