using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List location areas
/// </summary>

public class LocationAreaListEndpoint : FastEndpoints.Endpoint<LocationAreaListRequest, PaginatedLocationAreaSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/location-area/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("location");
        });

        Summary(s => {
            s.Summary = "List location areas";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(LocationAreaListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get location area
/// </summary>

public class LocationAreaRetrieveEndpoint : FastEndpoints.Endpoint<LocationAreaRetrieveRequest, LocationAreaDetail>
{
    public override void Configure()
    {
        Get("/api/v2/location-area/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("location");
        });

        Summary(s => {
            s.Summary = "Get location area";
            s.RequestParam(r => r.Id, "A unique integer value identifying this location area.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(LocationAreaRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List locations
/// </summary>

public class LocationListEndpoint : FastEndpoints.Endpoint<LocationListRequest, PaginatedLocationSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/location/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("location");
        });

        Summary(s => {
            s.Summary = "List locations";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(LocationListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get location
/// </summary>

public class LocationRetrieveEndpoint : FastEndpoints.Endpoint<LocationRetrieveRequest, LocationDetail>
{
    public override void Configure()
    {
        Get("/api/v2/location/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("location");
        });

        Summary(s => {
            s.Summary = "Get location";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(LocationRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List pal park areas
/// </summary>

public class PalParkAreaListEndpoint : FastEndpoints.Endpoint<PalParkAreaListRequest, PaginatedPalParkAreaSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/pal-park-area/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("location");
        });

        Summary(s => {
            s.Summary = "List pal park areas";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PalParkAreaListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get pal park area
/// </summary>

public class PalParkAreaRetrieveEndpoint : FastEndpoints.Endpoint<PalParkAreaRetrieveRequest, PalParkAreaDetail>
{
    public override void Configure()
    {
        Get("/api/v2/pal-park-area/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("location");
        });

        Summary(s => {
            s.Summary = "Get pal park area";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PalParkAreaRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List regions
/// </summary>

public class RegionListEndpoint : FastEndpoints.Endpoint<RegionListRequest, PaginatedRegionSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/region/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("location");
        });

        Summary(s => {
            s.Summary = "List regions";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(RegionListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get region
/// </summary>

public class RegionRetrieveEndpoint : FastEndpoints.Endpoint<RegionRetrieveRequest, RegionDetail>
{
    public override void Configure()
    {
        Get("/api/v2/region/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("location");
        });

        Summary(s => {
            s.Summary = "Get region";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(RegionRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

