<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonFormDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $name;

    /**
     * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $order;

    /**
     * The order in which forms should be sorted within a species&#39; forms.
     * @DTA\Data(field="form_order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $form_order;

    /**
     * True for exactly one form used as the default for each Pokémon.
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_default;

    /**
     * Whether or not this form can only happen during battle.
     * @DTA\Data(field="is_battle_only", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_battle_only;

    /**
     * Whether or not this form requires mega evolution.
     * @DTA\Data(field="is_mega", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_mega;

    /**
     * The name of this form.
     * @DTA\Data(field="form_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":30})
     * @var string|null
     */
    public $form_name;

    /**
     * The Pokémon that can take on this form.
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSummary::class})
     * @var \App\DTO\PokemonSummary|null
     */
    public $pokemon;

    /**
     * A set of sprites used to depict this Pokémon form in the game.
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonFormSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonFormSprites::class})
     * @var \App\DTO\PokemonFormSprites|null
     */
    public $sprites;

    /**
     * The version group this Pokémon form was introduced in.
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     * @var \App\DTO\VersionGroupSummary|null
     */
    public $version_group;

    /**
     * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
     * @DTA\Data(field="form_names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection157::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection157::class})
     * @var \App\DTO\Collection157|null
     */
    public $form_names;

    /**
     * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection158::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection158::class})
     * @var \App\DTO\Collection158|null
     */
    public $names;

    /**
     * A list of details showing types this Pokémon form has.
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection159::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection159::class})
     * @var \App\DTO\Collection159|null
     */
    public $types;

    /**
     * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
     * @DTA\Data(field="trigger_conditions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection160::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection160::class})
     * @var \App\DTO\Collection160|null
     */
    public $trigger_conditions;

    /**
     * The flavor text of this form listed in different languages and versions.
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection161::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection161::class})
     * @var \App\DTO\Collection161|null
     */
    public $flavor_text_entries;

}
