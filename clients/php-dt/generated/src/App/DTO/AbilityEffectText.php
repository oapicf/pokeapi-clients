<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AbilityEffectText
{
    /**
     * @DTA\Data(field="effect")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":6000})
     */
    public ?string $effect = null;

    /**
     * @DTA\Data(field="short_effect")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":300})
     */
    public ?string $short_effect = null;

    /**
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LanguageSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LanguageSummary::class})
     */
    public ?\App\DTO\LanguageSummary $language = null;

}
