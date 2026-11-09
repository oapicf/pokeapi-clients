<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonHeldItemVersion
{
    /**
     * How often the item is held.
     * @DTA\Data(field="rarity")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $rarity;

    /**
     * The version in which the item is held.
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionSummary::class})
     * @var \App\DTO\VersionSummary|null
     */
    public $version;

}
