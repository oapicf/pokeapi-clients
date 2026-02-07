<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EncounterConditionValueDetail
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
     * @DTA\Data(field="condition")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EncounterConditionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EncounterConditionSummary::class})
     * @var \App\DTO\EncounterConditionSummary|null
     */
    public $condition;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection32::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection32::class})
     * @var \App\DTO\Collection32|null
     */
    public $names;

}
