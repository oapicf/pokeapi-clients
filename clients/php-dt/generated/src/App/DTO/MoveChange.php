<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveChange
{
    /**
     * @DTA\Data(field="accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $accuracy = null;

    /**
     * @DTA\Data(field="power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $power = null;

    /**
     * @DTA\Data(field="pp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pp = null;

    /**
     * @DTA\Data(field="effect_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $effect_chance = null;

    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection96::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection96::class})
     */
    public ?\App\DTO\Collection96 $effect_entries = null;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     */
    public ?\App\DTO\TypeSummary $type = null;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     */
    public ?\App\DTO\VersionGroupSummary $version_group = null;

}
