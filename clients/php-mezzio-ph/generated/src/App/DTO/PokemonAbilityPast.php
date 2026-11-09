<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonAbilityPast
{
    /**
     * Whether or not this is a hidden ability.
     * @DTA\Data(field="is_hidden", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_hidden;

    /**
     * The slot this ability occupies in this Pokémon species.
     * @DTA\Data(field="slot")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $slot;

    /**
     * The ability the Pokémon may have.
     * @DTA\Data(field="ability")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilitySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilitySummary::class})
     * @var \App\DTO\AbilitySummary|null
     */
    public $ability;

}
