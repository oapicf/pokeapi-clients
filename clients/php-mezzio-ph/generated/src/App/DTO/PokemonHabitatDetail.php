<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonHabitatDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection158::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection158::class})
     * @var \App\DTO\Collection158|null
     */
    public $names;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection159::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection159::class})
     * @var \App\DTO\Collection159|null
     */
    public $pokemon_species;

}
