namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EncounterMethodDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int Order { get; set; }
    public List<EncounterMethodName> Names { get; set; }
}


