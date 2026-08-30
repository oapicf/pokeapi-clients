using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List machines
/// </summary>

public class MachineListEndpoint : FastEndpoints.Endpoint<MachineListRequest, PaginatedMachineSummaryList>
{
    public override void Configure()
    {
        Get("/api/v2/machine/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("machines");
        });

        Summary(s => {
            s.Summary = "List machines";
            s.RequestParam(r => r.Limit, "Number of results to return per page.");
            s.RequestParam(r => r.Offset, "The initial index from which to return the results.");
            s.RequestParam(r => r.Q, "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MachineListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get machine
/// </summary>

public class MachineRetrieveEndpoint : FastEndpoints.Endpoint<MachineRetrieveRequest, MachineDetail>
{
    public override void Configure()
    {
        Get("/api/v2/machine/{id}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("machines");
        });

        Summary(s => {
            s.Summary = "Get machine";
            s.RequestParam(r => r.Id, "This parameter can be a string or an integer.");
            s.Responses[200] = "";
        });
    }

    public override async Task HandleAsync(MachineRetrieveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

