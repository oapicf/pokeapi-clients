<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EncounterPokemonDetail
{
    /**
     * The minimum number of perfect IVs, or null if unspecified.
     * @DTA\Data(field="min_perfect_ivs", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $min_perfect_ivs = null;

    /**
     * Whether the encountered Pokémon is always shiny.
     * @DTA\Data(field="always_shiny", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $always_shiny = null;

    /**
     * Whether the encountered Pokémon can never be shiny.
     * @DTA\Data(field="never_shiny", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $never_shiny = null;

    /**
     * Whether the encountered Pokémon is an alpha Pokémon.
     * @DTA\Data(field="is_alpha", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_alpha = null;

}
