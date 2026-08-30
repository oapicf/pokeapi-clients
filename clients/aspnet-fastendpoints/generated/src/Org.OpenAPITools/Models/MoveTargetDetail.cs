namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MoveTargetDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<MoveTargetDescription> Descriptions { get; set; }
    public List<MoveSummary> Moves { get; set; }
    public List<MoveTargetName> Names { get; set; }
}


