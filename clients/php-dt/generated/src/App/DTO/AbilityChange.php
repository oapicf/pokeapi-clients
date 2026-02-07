<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AbilityChange
{
    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     */
    public ?\App\DTO\VersionGroupSummary $version_group = null;

    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection3::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection3::class})
     */
    public ?\App\DTO\Collection3 $effect_entries = null;

}
