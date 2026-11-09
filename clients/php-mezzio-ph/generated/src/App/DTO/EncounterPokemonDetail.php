<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EncounterPokemonDetail
{
    /**
     * The minimum number of perfect IVs, or null if unspecified.
     * @DTA\Data(field="min_perfect_ivs", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $min_perfect_ivs;

    /**
     * Whether the encountered Pokémon is always shiny.
     * @DTA\Data(field="always_shiny", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $always_shiny;

    /**
     * Whether the encountered Pokémon can never be shiny.
     * @DTA\Data(field="never_shiny", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $never_shiny;

    /**
     * Whether the encountered Pokémon is an alpha Pokémon.
     * @DTA\Data(field="is_alpha", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_alpha;

}
