<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class GrowthRateDetail
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
     * @DTA\Data(field="formula")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":500})
     */
    public ?string $formula = null;

    /**
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection51::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection51::class})
     */
    public ?\App\DTO\Collection51 $descriptions = null;

    /**
     * @DTA\Data(field="levels")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection52::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection52::class})
     */
    public ?\App\DTO\Collection52 $levels = null;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection53::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection53::class})
     */
    public ?\App\DTO\Collection53 $pokemon_species = null;

}
