
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class MachineListRequest
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
public class MachineRetrieveRequest
{
    /// <summary>
    /// This parameter can be a string or an integer.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}


