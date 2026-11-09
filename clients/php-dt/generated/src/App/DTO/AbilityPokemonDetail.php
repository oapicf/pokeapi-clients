<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AbilityPokemonDetail
{
    /**
     * Whether or not this a hidden ability for the referenced Pokémon.
     * @DTA\Data(field="is_hidden", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_hidden = null;

    /**
     * Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
     * @DTA\Data(field="slot")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $slot = null;

    /**
     * The Pokémon this ability could belong to.
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSummary::class})
     */
    public ?\App\DTO\PokemonSummary $pokemon = null;

}
