namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TypeRelationships 
{
    public List<TypeSummary> NoDamageTo { get; set; }
    public List<TypeSummary> HalfDamageTo { get; set; }
    public List<TypeSummary> DoubleDamageTo { get; set; }
    public List<TypeSummary> NoDamageFrom { get; set; }
    public List<TypeSummary> HalfDamageFrom { get; set; }
    public List<TypeSummary> DoubleDamageFrom { get; set; }
}


