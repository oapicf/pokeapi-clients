<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EvolutionChainDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="baby_trigger_item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     */
    public ?\App\DTO\ItemSummary $baby_trigger_item = null;

    /**
     * @DTA\Data(field="chain")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainDetailChain::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainDetailChain::class})
     */
    public ?\App\DTO\EvolutionChainDetailChain $chain = null;

}
