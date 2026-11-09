<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonFormSprites
{
    /**
     * The default depiction of this Pokémon from the front in battle.
     * @DTA\Data(field="front_default")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_default;

    /**
     * The shiny depiction of this Pokémon from the front in battle.
     * @DTA\Data(field="front_shiny")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_shiny;

    /**
     * The female depiction of this Pokémon from the front in battle.
     * @DTA\Data(field="front_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_female;

    /**
     * The shiny female depiction of this Pokémon from the front in battle.
     * @DTA\Data(field="front_shiny_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $front_shiny_female;

    /**
     * The default depiction of this Pokémon from the back in battle.
     * @DTA\Data(field="back_default")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $back_default;

    /**
     * The shiny depiction of this Pokémon from the back in battle.
     * @DTA\Data(field="back_shiny")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $back_shiny;

    /**
     * The female depiction of this Pokémon from the back in battle.
     * @DTA\Data(field="back_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $back_female;

    /**
     * The shiny female depiction of this Pokémon from the back in battle.
     * @DTA\Data(field="back_shiny_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $back_shiny_female;

    /**
     * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
     * @DTA\Data(field="other", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpritesOther::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpritesOther::class})
     * @var \App\DTO\PokemonSpritesOther|null
     */
    public $other;

    /**
     * Sprites grouped by generation and game. Available keys vary by resource.
     * @DTA\Data(field="versions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var array&lt;string,array&lt;string,mixed&gt;&gt;|null
     */
    public $versions;

}
