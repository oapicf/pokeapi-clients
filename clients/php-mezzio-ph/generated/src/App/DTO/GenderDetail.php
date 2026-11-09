<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class GenderDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $name;

    /**
     * A list of Pokémon species that can be this gender and how likely it is that they will be.
     * @DTA\Data(field="pokemon_species_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection48::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection48::class})
     * @var \App\DTO\Collection48|null
     */
    public $pokemon_species_details;

    /**
     * A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
     * @DTA\Data(field="required_for_evolution")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection49::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection49::class})
     * @var \App\DTO\Collection49|null
     */
    public $required_for_evolution;

}
