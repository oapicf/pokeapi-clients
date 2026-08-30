namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MoveDamageClassDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<MoveDamageClassDescription> Descriptions { get; set; }
    public List<MoveSummary> Moves { get; set; }
    public List<MoveDamageClassName> Names { get; set; }
}


