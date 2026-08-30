
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ContestEffectListRequest
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
public class ContestEffectRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class ContestTypeListRequest
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
public class ContestTypeRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class SuperContestEffectListRequest
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
public class SuperContestEffectRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}


