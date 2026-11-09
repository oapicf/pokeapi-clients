<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonSpritesOtherDreamWorld
{
    /**
     * The URL of the default Pokémon Dream World front image, or null if unavailable.
     * @DTA\Data(field="front_default")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_default;

    /**
     * The URL of the female Pokémon Dream World front image, or null if unavailable.
     * @DTA\Data(field="front_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_female;

}
