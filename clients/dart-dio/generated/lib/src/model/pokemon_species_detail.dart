//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_species_name.dart';
import 'package:openapi/src/model/evolution_chain_summary.dart';
import 'package:openapi/src/model/pokemon_dex_entry.dart';
import 'package:openapi/src/model/pokemon_color_summary.dart';
import 'package:openapi/src/model/pokemon_species_description.dart';
import 'package:openapi/src/model/pokemon_species_pal_park_encounter.dart';
import 'package:openapi/src/model/pokemon_species_genus.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:openapi/src/model/egg_group_summary.dart';
import 'package:openapi/src/model/pokemon_shape_summary.dart';
import 'package:openapi/src/model/pokemon_species_variety.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/growth_rate_summary.dart';
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:openapi/src/model/pokemon_habitat_summary.dart';
import 'package:openapi/src/model/pokemon_species_flavor_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_species_detail.g.dart';

/// PokemonSpeciesDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [order] - The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
/// * [genderRate] - The chance of this Pokémon being female, in eighths; or -1 for genderless.
/// * [captureRate] - The base capture rate; up to 255. The higher the number, the easier the catch.
/// * [baseHappiness] - The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
/// * [isBaby] - Whether or not this is a baby Pokémon.
/// * [isLegendary] - Whether or not this is a legendary Pokémon.
/// * [isMythical] - Whether or not this is a mythical Pokémon.
/// * [hatchCounter] - Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
/// * [hasGenderDifferences] - Whether or not this Pokémon has visual gender differences.
/// * [formsSwitchable] - Whether or not this Pokémon has multiple forms and can switch between them.
/// * [growthRate] - The rate at which this Pokémon species gains levels.
/// * [pokedexNumbers] - A list of Pokedexes and the indexes reserved within them for this Pokémon species.
/// * [eggGroups] - A list of egg groups this Pokémon species is a member of.
/// * [color] - The color of this Pokémon for Pokédex search.
/// * [shape] - The shape of this Pokémon for Pokédex search.
/// * [evolvesFromSpecies] - The Pokémon species that evolves into this Pokemon_species.
/// * [evolutionChain] - The evolution chain this Pokémon species is a member of.
/// * [habitat] - The habitat this Pokémon species can be encountered in.
/// * [generation] - The generation this Pokémon species was introduced in.
/// * [names] - The name of this resource listed in different languages.
/// * [palParkEncounters] - A list of encounters that can be had with this Pokémon species in pal park.
/// * [formDescriptions] - Descriptions of different forms Pokémon take on within the Pokémon species.
/// * [flavorTextEntries] - A list of flavor text entries for this Pokémon species.
/// * [genera] - The genus of this Pokémon species listed in multiple languages.
/// * [varieties] - A list of the Pokémon that exist within this Pokémon species.
@BuiltValue()
abstract class PokemonSpeciesDetail implements Built<PokemonSpeciesDetail, PokemonSpeciesDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
  @BuiltValueField(wireName: r'order')
  int? get order;

  /// The chance of this Pokémon being female, in eighths; or -1 for genderless.
  @BuiltValueField(wireName: r'gender_rate')
  int? get genderRate;

  /// The base capture rate; up to 255. The higher the number, the easier the catch.
  @BuiltValueField(wireName: r'capture_rate')
  int? get captureRate;

  /// The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
  @BuiltValueField(wireName: r'base_happiness')
  int? get baseHappiness;

  /// Whether or not this is a baby Pokémon.
  @BuiltValueField(wireName: r'is_baby')
  bool? get isBaby;

  /// Whether or not this is a legendary Pokémon.
  @BuiltValueField(wireName: r'is_legendary')
  bool? get isLegendary;

  /// Whether or not this is a mythical Pokémon.
  @BuiltValueField(wireName: r'is_mythical')
  bool? get isMythical;

  /// Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
  @BuiltValueField(wireName: r'hatch_counter')
  int? get hatchCounter;

  /// Whether or not this Pokémon has visual gender differences.
  @BuiltValueField(wireName: r'has_gender_differences')
  bool? get hasGenderDifferences;

  /// Whether or not this Pokémon has multiple forms and can switch between them.
  @BuiltValueField(wireName: r'forms_switchable')
  bool? get formsSwitchable;

  /// The rate at which this Pokémon species gains levels.
  @BuiltValueField(wireName: r'growth_rate')
  GrowthRateSummary get growthRate;

  /// A list of Pokedexes and the indexes reserved within them for this Pokémon species.
  @BuiltValueField(wireName: r'pokedex_numbers')
  BuiltList<PokemonDexEntry> get pokedexNumbers;

  /// A list of egg groups this Pokémon species is a member of.
  @BuiltValueField(wireName: r'egg_groups')
  BuiltList<EggGroupSummary> get eggGroups;

  /// The color of this Pokémon for Pokédex search.
  @BuiltValueField(wireName: r'color')
  PokemonColorSummary get color;

  /// The shape of this Pokémon for Pokédex search.
  @BuiltValueField(wireName: r'shape')
  PokemonShapeSummary get shape;

  /// The Pokémon species that evolves into this Pokemon_species.
  @BuiltValueField(wireName: r'evolves_from_species')
  PokemonSpeciesSummary? get evolvesFromSpecies;

  /// The evolution chain this Pokémon species is a member of.
  @BuiltValueField(wireName: r'evolution_chain')
  EvolutionChainSummary get evolutionChain;

  /// The habitat this Pokémon species can be encountered in.
  @BuiltValueField(wireName: r'habitat')
  PokemonHabitatSummary? get habitat;

  /// The generation this Pokémon species was introduced in.
  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  /// The name of this resource listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<PokemonSpeciesName> get names;

  /// A list of encounters that can be had with this Pokémon species in pal park.
  @BuiltValueField(wireName: r'pal_park_encounters')
  BuiltList<PokemonSpeciesPalParkEncounter> get palParkEncounters;

  /// Descriptions of different forms Pokémon take on within the Pokémon species.
  @BuiltValueField(wireName: r'form_descriptions')
  BuiltList<PokemonSpeciesDescription> get formDescriptions;

  /// A list of flavor text entries for this Pokémon species.
  @BuiltValueField(wireName: r'flavor_text_entries')
  BuiltList<PokemonSpeciesFlavorText> get flavorTextEntries;

  /// The genus of this Pokémon species listed in multiple languages.
  @BuiltValueField(wireName: r'genera')
  BuiltList<PokemonSpeciesGenus> get genera;

  /// A list of the Pokémon that exist within this Pokémon species.
  @BuiltValueField(wireName: r'varieties')
  BuiltList<PokemonSpeciesVariety> get varieties;

  PokemonSpeciesDetail._();

  factory PokemonSpeciesDetail([void updates(PokemonSpeciesDetailBuilder b)]) = _$PokemonSpeciesDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpeciesDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpeciesDetail> get serializer => _$PokemonSpeciesDetailSerializer();
}

class _$PokemonSpeciesDetailSerializer implements PrimitiveSerializer<PokemonSpeciesDetail> {
  @override
  final Iterable<Type> types = const [PokemonSpeciesDetail, _$PokemonSpeciesDetail];

  @override
  final String wireName = r'PokemonSpeciesDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpeciesDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.order != null) {
      yield r'order';
      yield serializers.serialize(
        object.order,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.genderRate != null) {
      yield r'gender_rate';
      yield serializers.serialize(
        object.genderRate,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.captureRate != null) {
      yield r'capture_rate';
      yield serializers.serialize(
        object.captureRate,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.baseHappiness != null) {
      yield r'base_happiness';
      yield serializers.serialize(
        object.baseHappiness,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.isBaby != null) {
      yield r'is_baby';
      yield serializers.serialize(
        object.isBaby,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isLegendary != null) {
      yield r'is_legendary';
      yield serializers.serialize(
        object.isLegendary,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isMythical != null) {
      yield r'is_mythical';
      yield serializers.serialize(
        object.isMythical,
        specifiedType: const FullType(bool),
      );
    }
    if (object.hatchCounter != null) {
      yield r'hatch_counter';
      yield serializers.serialize(
        object.hatchCounter,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.hasGenderDifferences != null) {
      yield r'has_gender_differences';
      yield serializers.serialize(
        object.hasGenderDifferences,
        specifiedType: const FullType(bool),
      );
    }
    if (object.formsSwitchable != null) {
      yield r'forms_switchable';
      yield serializers.serialize(
        object.formsSwitchable,
        specifiedType: const FullType(bool),
      );
    }
    yield r'growth_rate';
    yield serializers.serialize(
      object.growthRate,
      specifiedType: const FullType(GrowthRateSummary),
    );
    yield r'pokedex_numbers';
    yield serializers.serialize(
      object.pokedexNumbers,
      specifiedType: const FullType(BuiltList, [FullType(PokemonDexEntry)]),
    );
    yield r'egg_groups';
    yield serializers.serialize(
      object.eggGroups,
      specifiedType: const FullType(BuiltList, [FullType(EggGroupSummary)]),
    );
    yield r'color';
    yield serializers.serialize(
      object.color,
      specifiedType: const FullType(PokemonColorSummary),
    );
    yield r'shape';
    yield serializers.serialize(
      object.shape,
      specifiedType: const FullType(PokemonShapeSummary),
    );
    yield r'evolves_from_species';
    yield object.evolvesFromSpecies == null ? null : serializers.serialize(
      object.evolvesFromSpecies,
      specifiedType: const FullType.nullable(PokemonSpeciesSummary),
    );
    yield r'evolution_chain';
    yield serializers.serialize(
      object.evolutionChain,
      specifiedType: const FullType(EvolutionChainSummary),
    );
    yield r'habitat';
    yield object.habitat == null ? null : serializers.serialize(
      object.habitat,
      specifiedType: const FullType.nullable(PokemonHabitatSummary),
    );
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesName)]),
    );
    yield r'pal_park_encounters';
    yield serializers.serialize(
      object.palParkEncounters,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesPalParkEncounter)]),
    );
    yield r'form_descriptions';
    yield serializers.serialize(
      object.formDescriptions,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesDescription)]),
    );
    yield r'flavor_text_entries';
    yield serializers.serialize(
      object.flavorTextEntries,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesFlavorText)]),
    );
    yield r'genera';
    yield serializers.serialize(
      object.genera,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesGenus)]),
    );
    yield r'varieties';
    yield serializers.serialize(
      object.varieties,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesVariety)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpeciesDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpeciesDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.order = valueDes;
          break;
        case r'gender_rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.genderRate = valueDes;
          break;
        case r'capture_rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.captureRate = valueDes;
          break;
        case r'base_happiness':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.baseHappiness = valueDes;
          break;
        case r'is_baby':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isBaby = valueDes;
          break;
        case r'is_legendary':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isLegendary = valueDes;
          break;
        case r'is_mythical':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isMythical = valueDes;
          break;
        case r'hatch_counter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.hatchCounter = valueDes;
          break;
        case r'has_gender_differences':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.hasGenderDifferences = valueDes;
          break;
        case r'forms_switchable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.formsSwitchable = valueDes;
          break;
        case r'growth_rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GrowthRateSummary),
          ) as GrowthRateSummary;
          result.growthRate.replace(valueDes);
          break;
        case r'pokedex_numbers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonDexEntry)]),
          ) as BuiltList<PokemonDexEntry>;
          result.pokedexNumbers.replace(valueDes);
          break;
        case r'egg_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EggGroupSummary)]),
          ) as BuiltList<EggGroupSummary>;
          result.eggGroups.replace(valueDes);
          break;
        case r'color':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonColorSummary),
          ) as PokemonColorSummary;
          result.color.replace(valueDes);
          break;
        case r'shape':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonShapeSummary),
          ) as PokemonShapeSummary;
          result.shape.replace(valueDes);
          break;
        case r'evolves_from_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonSpeciesSummary),
          ) as PokemonSpeciesSummary?;
          if (valueDes == null) continue;
          result.evolvesFromSpecies.replace(valueDes);
          break;
        case r'evolution_chain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EvolutionChainSummary),
          ) as EvolutionChainSummary;
          result.evolutionChain.replace(valueDes);
          break;
        case r'habitat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonHabitatSummary),
          ) as PokemonHabitatSummary?;
          if (valueDes == null) continue;
          result.habitat.replace(valueDes);
          break;
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesName)]),
          ) as BuiltList<PokemonSpeciesName>;
          result.names.replace(valueDes);
          break;
        case r'pal_park_encounters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesPalParkEncounter)]),
          ) as BuiltList<PokemonSpeciesPalParkEncounter>;
          result.palParkEncounters.replace(valueDes);
          break;
        case r'form_descriptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesDescription)]),
          ) as BuiltList<PokemonSpeciesDescription>;
          result.formDescriptions.replace(valueDes);
          break;
        case r'flavor_text_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesFlavorText)]),
          ) as BuiltList<PokemonSpeciesFlavorText>;
          result.flavorTextEntries.replace(valueDes);
          break;
        case r'genera':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesGenus)]),
          ) as BuiltList<PokemonSpeciesGenus>;
          result.genera.replace(valueDes);
          break;
        case r'varieties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesVariety)]),
          ) as BuiltList<PokemonSpeciesVariety>;
          result.varieties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonSpeciesDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpeciesDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


