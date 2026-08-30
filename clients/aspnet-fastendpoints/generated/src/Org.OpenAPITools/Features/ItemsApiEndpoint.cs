using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List item attributes
/// </summary>

public class ItemAttributeListEndpoint : FastEndpoints.Endpoint<ItemAttributeListRequest, PaginatedItemAttributeSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/item-attribute/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("items");
        });

        Summary(s => {
            s.Summary = "List item attributes";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ItemAttributeListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get item attribute
/// </summary>

public class ItemAttributeRetrieveEndpoint : FastEndpoints.Endpoint<ItemAttributeRetrieveRequest, ItemAttributeDetail>
{
    public override void Configure()
    {
        Get("/api/v2/item-attribute/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("items");
        });

        Summary(s => {
            s.Summary = "Get item attribute";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ItemAttributeRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List item categories
/// </summary>

public class ItemCategoryListEndpoint : FastEndpoints.Endpoint<ItemCategoryListRequest, PaginatedItemCategorySummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/item-category/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("items");
        });

        Summary(s => {
            s.Summary = "List item categories";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ItemCategoryListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get item category
/// </summary>

public class ItemCategoryRetrieveEndpoint : FastEndpoints.Endpoint<ItemCategoryRetrieveRequest, ItemCategoryDetail>
{
    public override void Configure()
    {
        Get("/api/v2/item-category/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("items");
        });

        Summary(s => {
            s.Summary = "Get item category";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ItemCategoryRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List item fling effects
/// </summary>

public class ItemFlingEffectListEndpoint : FastEndpoints.Endpoint<ItemFlingEffectListRequest, PaginatedItemFlingEffectSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/item-fling-effect/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("items");
        });

        Summary(s => {
            s.Summary = "List item fling effects";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ItemFlingEffectListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get item fling effect
/// </summary>

public class ItemFlingEffectRetrieveEndpoint : FastEndpoints.Endpoint<ItemFlingEffectRetrieveRequest, ItemFlingEffectDetail>
{
    public override void Configure()
    {
        Get("/api/v2/item-fling-effect/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("items");
        });

        Summary(s => {
            s.Summary = "Get item fling effect";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ItemFlingEffectRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List items
/// </summary>

public class ItemListEndpoint : FastEndpoints.Endpoint<ItemListRequest, PaginatedItemSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/item/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("items");
        });

        Summary(s => {
            s.Summary = "List items";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ItemListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List item pockets
/// </summary>

public class ItemPocketListEndpoint : FastEndpoints.Endpoint<ItemPocketListRequest, PaginatedItemPocketSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/item-pocket/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("items");
        });

        Summary(s => {
            s.Summary = "List item pockets";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ItemPocketListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get item pocket
/// </summary>

public class ItemPocketRetrieveEndpoint : FastEndpoints.Endpoint<ItemPocketRetrieveRequest, ItemPocketDetail>
{
    public override void Configure()
    {
        Get("/api/v2/item-pocket/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("items");
        });

        Summary(s => {
            s.Summary = "Get item pocket";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ItemPocketRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get item
/// </summary>

public class ItemRetrieveEndpoint : FastEndpoints.Endpoint<ItemRetrieveRequest, ItemDetail>
{
    public override void Configure()
    {
        Get("/api/v2/item/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("items");
        });

        Summary(s => {
            s.Summary = "Get item";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(ItemRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

