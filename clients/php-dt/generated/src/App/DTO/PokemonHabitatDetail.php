<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonHabitatDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $name = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection163::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection163::class})
     */
    public ?\App\DTO\Collection163 $names = null;

    /**
     * A list of the Pokémon species that can be found in this habitat.
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection164::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection164::class})
     */
    public ?\App\DTO\Collection164 $pokemon_species = null;

}
