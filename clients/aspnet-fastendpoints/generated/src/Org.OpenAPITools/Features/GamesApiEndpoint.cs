using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List genrations
/// </summary>

public class GenerationListEndpoint : FastEndpoints.Endpoint<GenerationListRequest, PaginatedGenerationSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/generation/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("games");
        });

        Summary(s => {
            s.Summary = "List genrations";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(GenerationListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get genration
/// </summary>

public class GenerationRetrieveEndpoint : FastEndpoints.Endpoint<GenerationRetrieveRequest, GenerationDetail>
{
    public override void Configure()
    {
        Get("/api/v2/generation/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("games");
        });

        Summary(s => {
            s.Summary = "Get genration";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(GenerationRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List pokedex
/// </summary>

public class PokedexListEndpoint : FastEndpoints.Endpoint<PokedexListRequest, PaginatedPokedexSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/pokedex/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("games");
        });

        Summary(s => {
            s.Summary = "List pokedex";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokedexListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get pokedex
/// </summary>

public class PokedexRetrieveEndpoint : FastEndpoints.Endpoint<PokedexRetrieveRequest, PokedexDetail>
{
    public override void Configure()
    {
        Get("/api/v2/pokedex/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("games");
        });

        Summary(s => {
            s.Summary = "Get pokedex";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokedexRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List version groups
/// </summary>

public class VersionGroupListEndpoint : FastEndpoints.Endpoint<VersionGroupListRequest, PaginatedVersionGroupSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/version-group/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("games");
        });

        Summary(s => {
            s.Summary = "List version groups";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(VersionGroupListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get version group
/// </summary>

public class VersionGroupRetrieveEndpoint : FastEndpoints.Endpoint<VersionGroupRetrieveRequest, VersionGroupDetail>
{
    public override void Configure()
    {
        Get("/api/v2/version-group/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("games");
        });

        Summary(s => {
            s.Summary = "Get version group";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(VersionGroupRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List versions
/// </summary>

public class VersionListEndpoint : FastEndpoints.Endpoint<VersionListRequest, PaginatedVersionSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/version/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("games");
        });

        Summary(s => {
            s.Summary = "List versions";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(VersionListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get version
/// </summary>

public class VersionRetrieveEndpoint : FastEndpoints.Endpoint<VersionRetrieveRequest, VersionDetail>
{
    public override void Configure()
    {
        Get("/api/v2/version/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("games");
        });

        Summary(s => {
            s.Summary = "Get version";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(VersionRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

