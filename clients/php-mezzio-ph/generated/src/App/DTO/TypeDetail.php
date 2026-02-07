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
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="damage_relations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeDetailDamageRelations::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeDetailDamageRelations::class})
     * @var \App\DTO\TypeDetailDamageRelations|null
     */
    public $damage_relations;

    /**
     * @DTA\Data(field="past_damage_relations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection205::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection205::class})
     * @var \App\DTO\Collection205|null
     */
    public $past_damage_relations;

    /**
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection206::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection206::class})
     * @var \App\DTO\Collection206|null
     */
    public $game_indices;

    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

    /**
     * @DTA\Data(field="move_damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @var \App\DTO\MoveDamageClassSummary|null
     */
    public $move_damage_class;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection207::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection207::class})
     * @var \App\DTO\Collection207|null
     */
    public $names;

    /**
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection208::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection208::class})
     * @var \App\DTO\Collection208|null
     */
    public $pokemon;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection209::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection209::class})
     * @var \App\DTO\Collection209|null
     */
    public $moves;

    /**
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection211::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection211::class})
     * @var \App\DTO\Collection211|null
     */
    public $sprites;

}
