<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonSpritesOtherOfficialArtwork
{
    /**
     * The URL of the default front official artwork, or null if unavailable.
     * @DTA\Data(field="front_default")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $front_default = null;

    /**
     * The URL of the shiny front official artwork, or null if unavailable.
     * @DTA\Data(field="front_shiny")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $front_shiny = null;

    /**
     * Additional official artwork grouped by version. Available keys vary by resource.
     * @DTA\Data(field="versions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $versions = null;

}
