using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List languages
/// </summary>

public class LanguageListEndpoint : FastEndpoints.Endpoint<LanguageListRequest, PaginatedLanguageSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/language/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("utility");
        });

        Summary(s => {
            s.Summary = "List languages";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(LanguageListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get language
/// </summary>

public class LanguageRetrieveEndpoint : FastEndpoints.Endpoint<LanguageRetrieveRequest, LanguageDetail>
{
    public override void Configure()
    {
        Get("/api/v2/language/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("utility");
        });

        Summary(s => {
            s.Summary = "Get language";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(LanguageRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

