namespace Org.OpenAPITools.Models;


/// <summary>
/// Serializer for the Type resource
/// </summary>
public class TypeDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public TypeRelationships DamageRelations { get; set; }
    public List<TypePastRelationships> PastDamageRelations { get; set; }
    public List<TypeGameIndex> GameIndices { get; set; }
    public GenerationSummary Generation { get; set; }
    public MoveDamageClassSummary MoveDamageClass { get; set; }
    public List<TypeName> Names { get; set; }
    public List<TypePokemon> Pokemon { get; set; }
    public List<MoveSummary> Moves { get; set; }
    public Dictionary<string, Dictionary<string, TypeGameSprite>> Sprites { get; set; }
}


