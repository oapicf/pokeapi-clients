<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonSpeciesGenus
{
    /**
     * The localized genus for the referenced Pokémon species
     * @DTA\Data(field="genus")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":30})
     * @var string|null
     */
    public $genus;

    /**
     * The language this genus is in.
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LanguageSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LanguageSummary::class})
     * @var \App\DTO\LanguageSummary|null
     */
    public $language;

}
