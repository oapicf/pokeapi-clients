<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveChange
{
    /**
     * @DTA\Data(field="accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $accuracy;

    /**
     * @DTA\Data(field="power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $power;

    /**
     * @DTA\Data(field="pp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $pp;

    /**
     * @DTA\Data(field="effect_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $effect_chance;

    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection96::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection96::class})
     * @var \App\DTO\Collection96|null
     */
    public $effect_entries;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     * @var \App\DTO\TypeSummary|null
     */
    public $type;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     * @var \App\DTO\VersionGroupSummary|null
     */
    public $version_group;

}
