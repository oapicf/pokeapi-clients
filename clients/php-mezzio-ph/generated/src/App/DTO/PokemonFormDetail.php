<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonFormDetail
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
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $order;

    /**
     * @DTA\Data(field="form_order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $form_order;

    /**
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_default;

    /**
     * @DTA\Data(field="is_battle_only", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_battle_only;

    /**
     * @DTA\Data(field="is_mega", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_mega;

    /**
     * @DTA\Data(field="form_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":30})
     * @var string|null
     */
    public $form_name;

    /**
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSummary::class})
     * @var \App\DTO\PokemonSummary|null
     */
    public $pokemon;

    /**
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonFormDetailSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonFormDetailSprites::class})
     * @var \App\DTO\PokemonFormDetailSprites|null
     */
    public $sprites;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     * @var \App\DTO\VersionGroupSummary|null
     */
    public $version_group;

    /**
     * @DTA\Data(field="form_names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection154::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection154::class})
     * @var \App\DTO\Collection154|null
     */
    public $form_names;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection155::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection155::class})
     * @var \App\DTO\Collection155|null
     */
    public $names;

    /**
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection156::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection156::class})
     * @var \App\DTO\Collection156|null
     */
    public $types;

}
