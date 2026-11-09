<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonMove
{
    /**
     * The move the Pokémon can learn.
     * @DTA\Data(field="move")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveSummary::class})
     */
    public ?\App\DTO\MoveSummary $move = null;

    /**
     * The details of the version in which the Pokémon can learn the move.
     * @DTA\Data(field="version_group_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection145::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection145::class})
     */
    public ?\App\DTO\Collection145 $version_group_details = null;

}
