<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Serializer for the Type resource
 */
class TypeDetail
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
     * A detail of how effective this type is toward others and vice versa.
     * @DTA\Data(field="damage_relations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeRelationships::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeRelationships::class})
     * @var \App\DTO\TypeRelationships|null
     */
    public $damage_relations;

    /**
     * A list of details of how effective this type was toward others and vice versa in previous generations
     * @DTA\Data(field="past_damage_relations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection193::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection193::class})
     * @var \App\DTO\Collection193|null
     */
    public $past_damage_relations;

    /**
     * A list of game indices relevent to this item by generation.
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection194::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection194::class})
     * @var \App\DTO\Collection194|null
     */
    public $game_indices;

    /**
     * The generation this type was introduced in.
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

    /**
     * The class of damage inflicted by this type.
     * @DTA\Data(field="move_damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @var \App\DTO\MoveDamageClassSummary|null
     */
    public $move_damage_class;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection195::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection195::class})
     * @var \App\DTO\Collection195|null
     */
    public $names;

    /**
     * A list of details of Pokémon that have this type.
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection196::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection196::class})
     * @var \App\DTO\Collection196|null
     */
    public $pokemon;

    /**
     * A list of moves that have this type.
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection197::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection197::class})
     * @var \App\DTO\Collection197|null
     */
    public $moves;

    /**
     * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection199::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection199::class})
     * @var \App\DTO\Collection199|null
     */
    public $sprites;

}
