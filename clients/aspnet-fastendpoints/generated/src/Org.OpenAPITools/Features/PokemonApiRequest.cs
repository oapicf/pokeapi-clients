
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AbilityListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class AbilityRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class CharacteristicListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class CharacteristicRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class EggGroupListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class EggGroupRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class GenderListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class GenderRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class GrowthRateListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class GrowthRateRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class MoveDamageClassListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class MoveDamageClassRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class NatureListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class NatureRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class PokeathlonStatListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class PokeathlonStatRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class PokemonColorListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class PokemonColorRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class PokemonFormListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class PokemonFormRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class PokemonHabitatListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class PokemonHabitatRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class PokemonListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class PokemonRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class PokemonShapeListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class PokemonShapeRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class PokemonSpeciesListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class PokemonSpeciesRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class StatListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class StatRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class TypeListRequest
{
    /// <summary>
    /// Number of results to return per page.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The initial index from which to return the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
}
public class TypeRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}


