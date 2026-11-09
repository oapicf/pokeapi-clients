<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonShapeAwesomeName
{
    /**
     * The localized \&quot;scientific\&quot; name for an API resource in a specific language.
     * @DTA\Data(field="awesome_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":30})
     */
    public ?string $awesome_name = null;

    /**
     * The language this \&quot;scientific\&quot; name is in.
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LanguageSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LanguageSummary::class})
     */
    public ?\App\DTO\LanguageSummary $language = null;

}
