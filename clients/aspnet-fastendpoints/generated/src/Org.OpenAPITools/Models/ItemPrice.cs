namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ItemPrice 
{
    public int PurchasePrice { get; set; }
    public int SellPrice { get; set; }
    public CurrencySummary Currency { get; set; }
    public VersionGroupSummary VersionGroup { get; set; }
}


