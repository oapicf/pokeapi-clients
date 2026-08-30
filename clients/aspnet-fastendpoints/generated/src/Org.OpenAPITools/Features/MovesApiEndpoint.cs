using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List move meta ailments
/// </summary>

public class MoveAilmentListEndpoint : FastEndpoints.Endpoint<MoveAilmentListRequest, PaginatedMoveMetaAilmentSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/move-ailment/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "List move meta ailments";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveAilmentListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get move meta ailment
/// </summary>

public class MoveAilmentRetrieveEndpoint : FastEndpoints.Endpoint<MoveAilmentRetrieveRequest, MoveMetaAilmentDetail>
{
    public override void Configure()
    {
        Get("/api/v2/move-ailment/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "Get move meta ailment";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveAilmentRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List move battle styles
/// </summary>

public class MoveBattleStyleListEndpoint : FastEndpoints.Endpoint<MoveBattleStyleListRequest, PaginatedMoveBattleStyleSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/move-battle-style/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "List move battle styles";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveBattleStyleListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get move battle style
/// </summary>

public class MoveBattleStyleRetrieveEndpoint : FastEndpoints.Endpoint<MoveBattleStyleRetrieveRequest, MoveBattleStyleDetail>
{
    public override void Configure()
    {
        Get("/api/v2/move-battle-style/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "Get move battle style";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveBattleStyleRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List move meta categories
/// </summary>

public class MoveCategoryListEndpoint : FastEndpoints.Endpoint<MoveCategoryListRequest, PaginatedMoveMetaCategorySummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/move-category/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "List move meta categories";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveCategoryListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get move meta category
/// </summary>

public class MoveCategoryRetrieveEndpoint : FastEndpoints.Endpoint<MoveCategoryRetrieveRequest, MoveMetaCategoryDetail>
{
    public override void Configure()
    {
        Get("/api/v2/move-category/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "Get move meta category";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveCategoryRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List move learn methods
/// </summary>

public class MoveLearnMethodListEndpoint : FastEndpoints.Endpoint<MoveLearnMethodListRequest, PaginatedMoveLearnMethodSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/move-learn-method/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "List move learn methods";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveLearnMethodListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get move learn method
/// </summary>

public class MoveLearnMethodRetrieveEndpoint : FastEndpoints.Endpoint<MoveLearnMethodRetrieveRequest, MoveLearnMethodDetail>
{
    public override void Configure()
    {
        Get("/api/v2/move-learn-method/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "Get move learn method";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveLearnMethodRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List moves
/// </summary>

public class MoveListEndpoint : FastEndpoints.Endpoint<MoveListRequest, PaginatedMoveSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/move/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "List moves";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get move
/// </summary>

public class MoveRetrieveEndpoint : FastEndpoints.Endpoint<MoveRetrieveRequest, MoveDetail>
{
    public override void Configure()
    {
        Get("/api/v2/move/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "Get move";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List move targets
/// </summary>

public class MoveTargetListEndpoint : FastEndpoints.Endpoint<MoveTargetListRequest, PaginatedMoveTargetSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/move-target/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "List move targets";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveTargetListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get move target
/// </summary>

public class MoveTargetRetrieveEndpoint : FastEndpoints.Endpoint<MoveTargetRetrieveRequest, MoveTargetDetail>
{
    public override void Configure()
    {
        Get("/api/v2/move-target/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("moves");
        });

        Summary(s => {
            s.Summary = "Get move target";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveTargetRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

