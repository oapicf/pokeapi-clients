<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EncounterConditionDetail
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
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection29::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection29::class})
     */
    public ?\App\DTO\Collection29 $values = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection30::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection30::class})
     */
    public ?\App\DTO\Collection30 $names = null;

}
