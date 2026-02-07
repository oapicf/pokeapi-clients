<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EncounterConditionValueDetail
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
     * @DTA\Data(field="condition")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EncounterConditionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EncounterConditionSummary::class})
     */
    public ?\App\DTO\EncounterConditionSummary $condition = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection32::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection32::class})
     */
    public ?\App\DTO\Collection32 $names = null;

}
