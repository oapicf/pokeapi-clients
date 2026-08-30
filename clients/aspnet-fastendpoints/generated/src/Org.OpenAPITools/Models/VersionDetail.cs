namespace Org.OpenAPITools.Models;


/// <summary>
/// Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
/// </summary>
public class VersionDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<VersionName> Names { get; set; }
    public VersionGroupSummary VersionGroup { get; set; }
}


