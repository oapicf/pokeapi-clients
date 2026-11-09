<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EvolutionChainDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
     * @DTA\Data(field="baby_trigger_item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     */
    public ?\App\DTO\ItemSummary $baby_trigger_item = null;

    /**
     * The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
     * @DTA\Data(field="chain")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainLink::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainLink::class})
     */
    public ?\App\DTO\EvolutionChainLink $chain = null;

}
