<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PalParkAreaDetail
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection128::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection128::class})
     * @var \App\DTO\Collection128|null
     */
    public $names;

    /**
     * @DTA\Data(field="pokemon_encounters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection129::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection129::class})
     * @var \App\DTO\Collection129|null
     */
    public $pokemon_encounters;

}
