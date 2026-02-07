<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EggGroupDetail
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection24::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection24::class})
     */
    public ?\App\DTO\Collection24 $names = null;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection25::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection25::class})
     */
    public ?\App\DTO\Collection25 $pokemon_species = null;

}
