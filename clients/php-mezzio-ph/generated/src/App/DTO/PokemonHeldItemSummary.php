<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonHeldItemSummary
{
    /**
     * The item the referenced Pokémon holds.
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     * @var \App\DTO\ItemSummary|null
     */
    public $item;

    /**
     * The details of the different versions in which the item is held.
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection143::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection143::class})
     * @var \App\DTO\Collection143|null
     */
    public $version_details;

}
