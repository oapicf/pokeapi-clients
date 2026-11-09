<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonHeldItemSummary
{
    /**
     * The item the referenced Pokémon holds.
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     */
    public ?\App\DTO\ItemSummary $item = null;

    /**
     * The details of the different versions in which the item is held.
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection143::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection143::class})
     */
    public ?\App\DTO\Collection143 $version_details = null;

}
