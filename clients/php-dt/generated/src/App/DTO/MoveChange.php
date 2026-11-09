<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveChange
{
    /**
     * The percent value of how likely this move is to be successful.
     * @DTA\Data(field="accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $accuracy = null;

    /**
     * The base power before the listed version group, or null if power did not change.
     * @DTA\Data(field="power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $power = null;

    /**
     * Power points. The number of times this move can be used.
     * @DTA\Data(field="pp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $pp = null;

    /**
     * The percent value of how likely it is this moves effect will take effect.
     * @DTA\Data(field="effect_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $effect_chance = null;

    /**
     * The effect of this move listed in different languages.
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection99::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection99::class})
     */
    public ?\App\DTO\Collection99 $effect_entries = null;

    /**
     * The elemental type of this move.
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     */
    public ?\App\DTO\TypeSummary $type = null;

    /**
     * The version group in which these move stat values were in effect.
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     */
    public ?\App\DTO\VersionGroupSummary $version_group = null;

}
