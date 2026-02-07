<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonGameIndex
{
    /**
     * @DTA\Data(field="game_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $game_index = null;

    /**
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionSummary::class})
     */
    public ?\App\DTO\VersionSummary $version = null;

}
