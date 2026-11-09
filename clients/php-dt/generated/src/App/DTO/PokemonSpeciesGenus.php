<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonSpeciesGenus
{
    /**
     * The localized genus for the referenced Pokémon species
     * @DTA\Data(field="genus")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":30})
     */
    public ?string $genus = null;

    /**
     * The language this genus is in.
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LanguageSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LanguageSummary::class})
     */
    public ?\App\DTO\LanguageSummary $language = null;

}
