<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokeathlonStatDetail
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
     * @DTA\Data(field="affecting_natures")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokeathlonStatDetailAffectingNatures::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokeathlonStatDetailAffectingNatures::class})
     */
    public ?\App\DTO\PokeathlonStatDetailAffectingNatures $affecting_natures = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection176::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection176::class})
     */
    public ?\App\DTO\Collection176 $names = null;

}
