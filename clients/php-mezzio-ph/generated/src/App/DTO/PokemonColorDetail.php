<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonColorDetail
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection150::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection150::class})
     * @var \App\DTO\Collection150|null
     */
    public $names;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection151::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection151::class})
     * @var \App\DTO\Collection151|null
     */
    public $pokemon_species;

}
