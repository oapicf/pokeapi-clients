<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonFormSprites
{
    /**
     * The default depiction of this Pokémon from the front in battle.
     * @DTA\Data(field="front_default")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $front_default = null;

    /**
     * The shiny depiction of this Pokémon from the front in battle.
     * @DTA\Data(field="front_shiny")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $front_shiny = null;

    /**
     * The female depiction of this Pokémon from the front in battle.
     * @DTA\Data(field="front_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $front_female = null;

    /**
     * The shiny female depiction of this Pokémon from the front in battle.
     * @DTA\Data(field="front_shiny_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $front_shiny_female = null;

    /**
     * The default depiction of this Pokémon from the back in battle.
     * @DTA\Data(field="back_default")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $back_default = null;

    /**
     * The shiny depiction of this Pokémon from the back in battle.
     * @DTA\Data(field="back_shiny")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $back_shiny = null;

    /**
     * The female depiction of this Pokémon from the back in battle.
     * @DTA\Data(field="back_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $back_female = null;

    /**
     * The shiny female depiction of this Pokémon from the back in battle.
     * @DTA\Data(field="back_shiny_female")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $back_shiny_female = null;

    /**
     * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
     * @DTA\Data(field="other", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpritesOther::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpritesOther::class})
     */
    public ?\App\DTO\PokemonSpritesOther $other = null;

    /**
     * Sprites grouped by generation and game. Available keys vary by resource.
     * @DTA\Data(field="versions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $versions = null;

}
