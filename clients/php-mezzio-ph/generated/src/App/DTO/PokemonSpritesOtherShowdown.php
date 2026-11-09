<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonSpritesOtherShowdown
{
    /**
     * The URL of the default Pokémon Showdown front image, or null if unavailable.
     * @DTA\Data(field="front_default")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_default;

    /**
     * The URL of the female Pokémon Showdown front image, or null if unavailable.
     * @DTA\Data(field="front_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_female;

    /**
     * The URL of the shiny Pokémon Showdown front image, or null if unavailable.
     * @DTA\Data(field="front_shiny")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_shiny;

    /**
     * The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
     * @DTA\Data(field="front_shiny_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_shiny_female;

    /**
     * The URL of the default Pokémon Showdown back image, or null if unavailable.
     * @DTA\Data(field="back_default")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $back_default;

    /**
     * The URL of the female Pokémon Showdown back image, or null if unavailable.
     * @DTA\Data(field="back_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $back_female;

    /**
     * The URL of the shiny Pokémon Showdown back image, or null if unavailable.
     * @DTA\Data(field="back_shiny")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $back_shiny;

    /**
     * The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
     * @DTA\Data(field="back_shiny_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $back_shiny_female;

}
