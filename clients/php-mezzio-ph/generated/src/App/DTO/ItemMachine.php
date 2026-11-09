<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemMachine
{
    /**
     * The machine that teaches a move from an item.
     * @DTA\Data(field="machine")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MachineSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MachineSummary::class})
     * @var \App\DTO\MachineSummary|null
     */
    public $machine;

    /**
     * The version group of this specific machine.
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     * @var \App\DTO\VersionGroupSummary|null
     */
    public $version_group;

}
