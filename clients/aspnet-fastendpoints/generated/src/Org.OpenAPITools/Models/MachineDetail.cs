namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MachineDetail 
{
    public int Id { get; set; }
    public ItemSummary Item { get; set; }
    public VersionGroupSummary VersionGroup { get; set; }
    public MoveSummary Move { get; set; }
}


