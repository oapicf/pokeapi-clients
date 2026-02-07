<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonShapeDetail
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
     * @DTA\Data(field="awesome_names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection161::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection161::class})
     * @var \App\DTO\Collection161|null
     */
    public $awesome_names;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection162::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection162::class})
     * @var \App\DTO\Collection162|null
     */
    public $names;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection163::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection163::class})
     * @var \App\DTO\Collection163|null
     */
    public $pokemon_species;

}
