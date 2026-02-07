<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EvolutionTriggerDetail
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection38::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection38::class})
     * @var \App\DTO\Collection38|null
     */
    public $names;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection39::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection39::class})
     * @var \App\DTO\Collection39|null
     */
    public $pokemon_species;

}
