<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonSpritesOtherHome
{
    /**
     * The URL of the default Pokémon HOME front image, or null if unavailable.
     * @DTA\Data(field="front_default")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_default;

    /**
     * The URL of the female Pokémon HOME front image, or null if unavailable.
     * @DTA\Data(field="front_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_female;

    /**
     * The URL of the shiny Pokémon HOME front image, or null if unavailable.
     * @DTA\Data(field="front_shiny")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_shiny;

    /**
     * The URL of the shiny female Pokémon HOME front image, or null if unavailable.
     * @DTA\Data(field="front_shiny_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_shiny_female;

}
