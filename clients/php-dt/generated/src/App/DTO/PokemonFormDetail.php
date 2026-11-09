<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonFormDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $name = null;

    /**
     * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $order = null;

    /**
     * The order in which forms should be sorted within a species&#39; forms.
     * @DTA\Data(field="form_order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $form_order = null;

    /**
     * True for exactly one form used as the default for each Pokémon.
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_default = null;

    /**
     * Whether or not this form can only happen during battle.
     * @DTA\Data(field="is_battle_only", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_battle_only = null;

    /**
     * Whether or not this form requires mega evolution.
     * @DTA\Data(field="is_mega", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_mega = null;

    /**
     * The name of this form.
     * @DTA\Data(field="form_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":30})
     */
    public ?string $form_name = null;

    /**
     * The Pokémon that can take on this form.
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSummary::class})
     */
    public ?\App\DTO\PokemonSummary $pokemon = null;

    /**
     * A set of sprites used to depict this Pokémon form in the game.
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonFormSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonFormSprites::class})
     */
    public ?\App\DTO\PokemonFormSprites $sprites = null;

    /**
     * The version group this Pokémon form was introduced in.
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     */
    public ?\App\DTO\VersionGroupSummary $version_group = null;

    /**
     * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
     * @DTA\Data(field="form_names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection157::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection157::class})
     */
    public ?\App\DTO\Collection157 $form_names = null;

    /**
     * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection158::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection158::class})
     */
    public ?\App\DTO\Collection158 $names = null;

    /**
     * A list of details showing types this Pokémon form has.
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection159::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection159::class})
     */
    public ?\App\DTO\Collection159 $types = null;

    /**
     * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
     * @DTA\Data(field="trigger_conditions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection160::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection160::class})
     */
    public ?\App\DTO\Collection160 $trigger_conditions = null;

    /**
     * The flavor text of this form listed in different languages and versions.
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection161::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection161::class})
     */
    public ?\App\DTO\Collection161 $flavor_text_entries = null;

}
