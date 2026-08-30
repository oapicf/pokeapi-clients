namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BerryDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int GrowthTime { get; set; }
    public int MaxHarvest { get; set; }
    public int NaturalGiftPower { get; set; }
    public int Size { get; set; }
    public int Smoothness { get; set; }
    public int SoilDryness { get; set; }
    public BerryFirmnessSummary Firmness { get; set; }
    public List<BerryDetailFlavorsInner> Flavors { get; set; }
    public ItemSummary Item { get; set; }
    public TypeSummary NaturalGiftType { get; set; }
}


