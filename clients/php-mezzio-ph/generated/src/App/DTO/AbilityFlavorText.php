<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AbilityFlavorText
{
    /**
     * @DTA\Data(field="flavor_text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $flavor_text;

    /**
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LanguageSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LanguageSummary::class})
     * @var \App\DTO\LanguageSummary|null
     */
    public $language;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     * @var \App\DTO\VersionGroupSummary|null
     */
    public $version_group;

}
