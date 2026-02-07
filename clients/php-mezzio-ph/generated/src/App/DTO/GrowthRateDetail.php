<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class GrowthRateDetail
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
     * @DTA\Data(field="formula")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":500})
     * @var string|null
     */
    public $formula;

    /**
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection51::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection51::class})
     * @var \App\DTO\Collection51|null
     */
    public $descriptions;

    /**
     * @DTA\Data(field="levels")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection52::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection52::class})
     * @var \App\DTO\Collection52|null
     */
    public $levels;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection53::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection53::class})
     * @var \App\DTO\Collection53|null
     */
    public $pokemon_species;

}
