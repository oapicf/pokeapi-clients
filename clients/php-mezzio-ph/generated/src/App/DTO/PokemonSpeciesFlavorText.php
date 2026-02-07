<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonSpeciesFlavorText
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
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionSummary::class})
     * @var \App\DTO\VersionSummary|null
     */
    public $version;

}
