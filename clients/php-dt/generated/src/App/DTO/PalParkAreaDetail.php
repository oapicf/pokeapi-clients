<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PalParkAreaDetail
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection128::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection128::class})
     */
    public ?\App\DTO\Collection128 $names = null;

    /**
     * @DTA\Data(field="pokemon_encounters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection129::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection129::class})
     */
    public ?\App\DTO\Collection129 $pokemon_encounters = null;

}
