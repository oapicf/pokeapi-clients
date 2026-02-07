<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ContestEffectFlavorText
{
    /**
     * @DTA\Data(field="flavor_text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":500})
     */
    public ?string $flavor_text = null;

    /**
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LanguageSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LanguageSummary::class})
     */
    public ?\App\DTO\LanguageSummary $language = null;

}
