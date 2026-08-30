using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// 
/// </summary>

public class AbilityListEndpoint : FastEndpoints.Endpoint<AbilityListRequest, PaginatedAbilitySummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/ability/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(AbilityListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// 
/// </summary>

public class AbilityRetrieveEndpoint : FastEndpoints.Endpoint<AbilityRetrieveRequest, AbilityDetail>
{
    public override void Configure()
    {
        Get("/api/v2/ability/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(AbilityRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List charecterictics
/// </summary>

public class CharacteristicListEndpoint : FastEndpoints.Endpoint<CharacteristicListRequest, PaginatedCharacteristicSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/characteristic/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List charecterictics";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(CharacteristicListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get characteristic
/// </summary>

public class CharacteristicRetrieveEndpoint : FastEndpoints.Endpoint<CharacteristicRetrieveRequest, CharacteristicDetail>
{
    public override void Configure()
    {
        Get("/api/v2/characteristic/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get characteristic";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(CharacteristicRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List egg groups
/// </summary>

public class EggGroupListEndpoint : FastEndpoints.Endpoint<EggGroupListRequest, PaginatedEggGroupSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/egg-group/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List egg groups";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EggGroupListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get egg group
/// </summary>

public class EggGroupRetrieveEndpoint : FastEndpoints.Endpoint<EggGroupRetrieveRequest, EggGroupDetail>
{
    public override void Configure()
    {
        Get("/api/v2/egg-group/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get egg group";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(EggGroupRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List genders
/// </summary>

public class GenderListEndpoint : FastEndpoints.Endpoint<GenderListRequest, PaginatedGenderSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/gender/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List genders";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(GenderListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get gender
/// </summary>

public class GenderRetrieveEndpoint : FastEndpoints.Endpoint<GenderRetrieveRequest, GenderDetail>
{
    public override void Configure()
    {
        Get("/api/v2/gender/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get gender";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(GenderRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List growth rates
/// </summary>

public class GrowthRateListEndpoint : FastEndpoints.Endpoint<GrowthRateListRequest, PaginatedGrowthRateSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/growth-rate/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List growth rates";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(GrowthRateListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get growth rate
/// </summary>

public class GrowthRateRetrieveEndpoint : FastEndpoints.Endpoint<GrowthRateRetrieveRequest, GrowthRateDetail>
{
    public override void Configure()
    {
        Get("/api/v2/growth-rate/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get growth rate";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(GrowthRateRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List move damage classes
/// </summary>

public class MoveDamageClassListEndpoint : FastEndpoints.Endpoint<MoveDamageClassListRequest, PaginatedMoveDamageClassSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/move-damage-class/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List move damage classes";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveDamageClassListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get move damage class
/// </summary>

public class MoveDamageClassRetrieveEndpoint : FastEndpoints.Endpoint<MoveDamageClassRetrieveRequest, MoveDamageClassDetail>
{
    public override void Configure()
    {
        Get("/api/v2/move-damage-class/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get move damage class";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MoveDamageClassRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List natures
/// </summary>

public class NatureListEndpoint : FastEndpoints.Endpoint<NatureListRequest, PaginatedNatureSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/nature/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List natures";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(NatureListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get nature
/// </summary>

public class NatureRetrieveEndpoint : FastEndpoints.Endpoint<NatureRetrieveRequest, NatureDetail>
{
    public override void Configure()
    {
        Get("/api/v2/nature/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get nature";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(NatureRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List pokeathlon stats
/// </summary>

public class PokeathlonStatListEndpoint : FastEndpoints.Endpoint<PokeathlonStatListRequest, PaginatedPokeathlonStatSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/pokeathlon-stat/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List pokeathlon stats";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokeathlonStatListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get pokeathlon stat
/// </summary>

public class PokeathlonStatRetrieveEndpoint : FastEndpoints.Endpoint<PokeathlonStatRetrieveRequest, PokeathlonStatDetail>
{
    public override void Configure()
    {
        Get("/api/v2/pokeathlon-stat/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get pokeathlon stat";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokeathlonStatRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List pokemon colors
/// </summary>

public class PokemonColorListEndpoint : FastEndpoints.Endpoint<PokemonColorListRequest, PaginatedPokemonColorSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon-color/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List pokemon colors";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonColorListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get pokemon color
/// </summary>

public class PokemonColorRetrieveEndpoint : FastEndpoints.Endpoint<PokemonColorRetrieveRequest, PokemonColorDetail>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon-color/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get pokemon color";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonColorRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List pokemon forms
/// </summary>

public class PokemonFormListEndpoint : FastEndpoints.Endpoint<PokemonFormListRequest, PaginatedPokemonFormSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon-form/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List pokemon forms";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonFormListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get pokemon form
/// </summary>

public class PokemonFormRetrieveEndpoint : FastEndpoints.Endpoint<PokemonFormRetrieveRequest, PokemonFormDetail>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon-form/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get pokemon form";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonFormRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List pokemom habitas
/// </summary>

public class PokemonHabitatListEndpoint : FastEndpoints.Endpoint<PokemonHabitatListRequest, PaginatedPokemonHabitatSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon-habitat/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List pokemom habitas";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonHabitatListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get pokemom habita
/// </summary>

public class PokemonHabitatRetrieveEndpoint : FastEndpoints.Endpoint<PokemonHabitatRetrieveRequest, PokemonHabitatDetail>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon-habitat/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get pokemom habita";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonHabitatRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List pokemon
/// </summary>

public class PokemonListEndpoint : FastEndpoints.Endpoint<PokemonListRequest, PaginatedPokemonSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List pokemon";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get pokemon
/// </summary>

public class PokemonRetrieveEndpoint : FastEndpoints.Endpoint<PokemonRetrieveRequest, PokemonDetail>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get pokemon";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List pokemon shapes
/// </summary>

public class PokemonShapeListEndpoint : FastEndpoints.Endpoint<PokemonShapeListRequest, PaginatedPokemonShapeSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon-shape/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List pokemon shapes";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonShapeListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get pokemon shape
/// </summary>

public class PokemonShapeRetrieveEndpoint : FastEndpoints.Endpoint<PokemonShapeRetrieveRequest, PokemonShapeDetail>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon-shape/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get pokemon shape";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonShapeRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List pokemon species
/// </summary>

public class PokemonSpeciesListEndpoint : FastEndpoints.Endpoint<PokemonSpeciesListRequest, PaginatedPokemonSpeciesSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon-species/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List pokemon species";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonSpeciesListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get pokemon species
/// </summary>

public class PokemonSpeciesRetrieveEndpoint : FastEndpoints.Endpoint<PokemonSpeciesRetrieveRequest, PokemonSpeciesDetail>
{
    public override void Configure()
    {
        Get("/api/v2/pokemon-species/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get pokemon species";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(PokemonSpeciesRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List stats
/// </summary>

public class StatListEndpoint : FastEndpoints.Endpoint<StatListRequest, PaginatedStatSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/stat/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List stats";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(StatListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get stat
/// </summary>

public class StatRetrieveEndpoint : FastEndpoints.Endpoint<StatRetrieveRequest, StatDetail>
{
    public override void Configure()
    {
        Get("/api/v2/stat/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get stat";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(StatRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List types
/// </summary>

public class TypeListEndpoint : FastEndpoints.Endpoint<TypeListRequest, PaginatedTypeSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/type/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "List types";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(TypeListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get types
/// </summary>

public class TypeRetrieveEndpoint : FastEndpoints.Endpoint<TypeRetrieveRequest, TypeDetail>
{
    public override void Configure()
    {
        Get("/api/v2/type/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("pokemon");
        });

        Summary(s => {
            s.Summary = "Get types";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(TypeRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

