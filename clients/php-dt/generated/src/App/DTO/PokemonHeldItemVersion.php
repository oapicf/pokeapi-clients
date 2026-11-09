<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonHeldItemVersion
{
    /**
     * How often the item is held.
     * @DTA\Data(field="rarity")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $rarity = null;

    /**
     * The version in which the item is held.
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionSummary::class})
     */
    public ?\App\DTO\VersionSummary $version = null;

}
