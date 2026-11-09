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
     * A detail of how effective this type is toward others and vice versa.
     * @DTA\Data(field="damage_relations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeRelationships::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeRelationships::class})
     */
    public ?\App\DTO\TypeRelationships $damage_relations = null;

    /**
     * A list of details of how effective this type was toward others and vice versa in previous generations
     * @DTA\Data(field="past_damage_relations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection193::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection193::class})
     */
    public ?\App\DTO\Collection193 $past_damage_relations = null;

    /**
     * A list of game indices relevent to this item by generation.
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection194::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection194::class})
     */
    public ?\App\DTO\Collection194 $game_indices = null;

    /**
     * The generation this type was introduced in.
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $generation = null;

    /**
     * The class of damage inflicted by this type.
     * @DTA\Data(field="move_damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     */
    public ?\App\DTO\MoveDamageClassSummary $move_damage_class = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection195::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection195::class})
     */
    public ?\App\DTO\Collection195 $names = null;

    /**
     * A list of details of Pokémon that have this type.
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection196::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection196::class})
     */
    public ?\App\DTO\Collection196 $pokemon = null;

    /**
     * A list of moves that have this type.
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection197::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection197::class})
     */
    public ?\App\DTO\Collection197 $moves = null;

    /**
     * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection199::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection199::class})
     */
    public ?\App\DTO\Collection199 $sprites = null;

}
