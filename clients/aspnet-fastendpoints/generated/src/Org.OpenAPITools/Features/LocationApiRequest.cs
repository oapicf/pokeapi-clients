
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class LocationAreaListRequest
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
}
public class LocationAreaRetrieveRequest
{
    /// <summary>
    /// A unique integer value identifying this location area.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public int Id { get; set; }
}
public class LocationListRequest
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
public class LocationRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class PalParkAreaListRequest
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
public class PalParkAreaRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class RegionListRequest
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
public class RegionRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}


