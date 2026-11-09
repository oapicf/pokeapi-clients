<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EncounterConditionValueDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $name;

    /**
     * The condition this encounter condition value pertains to.
     * @DTA\Data(field="condition")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EncounterConditionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EncounterConditionSummary::class})
     * @var \App\DTO\EncounterConditionSummary|null
     */
    public $condition;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection32::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection32::class})
     * @var \App\DTO\Collection32|null
     */
    public $names;

}
