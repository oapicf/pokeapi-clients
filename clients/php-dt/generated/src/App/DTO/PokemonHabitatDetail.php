<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonHabitatDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection158::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection158::class})
     */
    public ?\App\DTO\Collection158 $names = null;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection159::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection159::class})
     */
    public ?\App\DTO\Collection159 $pokemon_species = null;

}
