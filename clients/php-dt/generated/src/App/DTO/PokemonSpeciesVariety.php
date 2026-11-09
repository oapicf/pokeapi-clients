<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonSpeciesVariety
{
    /**
     * Whether this variety is the default variety.
     * @DTA\Data(field="is_default")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_default = null;

    /**
     * The Pokémon variety.
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSummary::class})
     */
    public ?\App\DTO\PokemonSummary $pokemon = null;

}
