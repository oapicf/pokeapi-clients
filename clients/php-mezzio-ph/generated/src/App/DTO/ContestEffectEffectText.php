<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ContestEffectEffectText
{
    /**
     * @DTA\Data(field="effect")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":6000})
     * @var string|null
     */
    public $effect;

    /**
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LanguageSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LanguageSummary::class})
     * @var \App\DTO\LanguageSummary|null
     */
    public $language;

}
