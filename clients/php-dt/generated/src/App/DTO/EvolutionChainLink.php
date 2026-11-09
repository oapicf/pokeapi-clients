<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EvolutionChainLink
{
    /**
     * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
     * @DTA\Data(field="is_baby")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_baby = null;

    /**
     * The Pokémon species at this point in the evolution chain.
     * @DTA\Data(field="species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     */
    public ?\App\DTO\PokemonSpeciesSummary $species = null;

    /**
     * All details regarding the specific details of the referenced Pokémon species evolution.
     * @DTA\Data(field="evolution_details")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $evolution_details = null;

    /**
     * A List of chain objects.
     * @DTA\Data(field="evolves_to")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $evolves_to = null;

}
