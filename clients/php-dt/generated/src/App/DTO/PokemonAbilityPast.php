<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonAbilityPast
{
    /**
     * Whether or not this is a hidden ability.
     * @DTA\Data(field="is_hidden", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_hidden = null;

    /**
     * The slot this ability occupies in this Pokémon species.
     * @DTA\Data(field="slot")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $slot = null;

    /**
     * The ability the Pokémon may have.
     * @DTA\Data(field="ability")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilitySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilitySummary::class})
     */
    public ?\App\DTO\AbilitySummary $ability = null;

}
