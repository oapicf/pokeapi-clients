<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class NatureDetail
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
     * The stat decreased by 10% in Pokémon with this nature.
     * @DTA\Data(field="decreased_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     * @var \App\DTO\StatSummary|null
     */
    public $decreased_stat;

    /**
     * The stat increased by 10% in Pokémon with this nature.
     * @DTA\Data(field="increased_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     * @var \App\DTO\StatSummary|null
     */
    public $increased_stat;

    /**
     * The flavor liked by Pokémon with this nature.
     * @DTA\Data(field="likes_flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @var \App\DTO\BerryFlavorSummary|null
     */
    public $likes_flavor;

    /**
     * The flavor hated by Pokémon with this nature.
     * @DTA\Data(field="hates_flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @var \App\DTO\BerryFlavorSummary|null
     */
    public $hates_flavor;

    /**
     * A list of Pokéathlon stats this nature effects and how much it effects them.
     * @DTA\Data(field="pokeathlon_stat_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection126::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection126::class})
     * @var \App\DTO\Collection126|null
     */
    public $pokeathlon_stat_changes;

    /**
     * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
     * @DTA\Data(field="move_battle_style_preferences")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection127::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection127::class})
     * @var \App\DTO\Collection127|null
     */
    public $move_battle_style_preferences;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection128::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection128::class})
     * @var \App\DTO\Collection128|null
     */
    public $names;

}
