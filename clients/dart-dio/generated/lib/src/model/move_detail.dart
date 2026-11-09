//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_meta.dart';
import 'package:openapi/src/model/move_change.dart';
import 'package:openapi/src/model/pokemon_summary.dart';
import 'package:openapi/src/model/move_flavor_text.dart';
import 'package:openapi/src/model/contest_type_summary.dart';
import 'package:openapi/src/model/move_target_summary.dart';
import 'package:openapi/src/model/type_summary.dart';
import 'package:openapi/src/model/contest_effect_summary.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:openapi/src/model/move_combos.dart';
import 'package:openapi/src/model/move_effect_change.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/move_meta_stat_change.dart';
import 'package:openapi/src/model/move_damage_class_summary.dart';
import 'package:openapi/src/model/move_name.dart';
import 'package:openapi/src/model/super_contest_effect_summary.dart';
import 'package:openapi/src/model/item_machine.dart';
import 'package:openapi/src/model/move_effect_effect_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_detail.g.dart';

/// MoveDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [accuracy] - The percent value of how likely this move is to be successful.
/// * [effectChance] - The percent value of how likely it is this moves effect will happen.
/// * [pp] - Power points. The number of times this move can be used.
/// * [priority] - A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
/// * [power] - The base power of this move, or null if it has no fixed base power.
/// * [contestCombos] - A detail of normal and super contest combos that require this move.
/// * [contestType] - The type of appeal this move gives a Pokémon when used in a contest.
/// * [contestEffect] - The effect the move has when used in a contest.
/// * [damageClass] - The type of damage the move inflicts on the target, e.g. physical.
/// * [effectEntries] - The effect of this move listed in different languages.
/// * [effectChanges] - The list of previous effects this move has had across version groups of the games.
/// * [generation] - The generation in which this move was introduced.
/// * [meta] - Metadata about this move
/// * [names] - The name of this resource listed in different languages.
/// * [pastValues] - A list of move resource value changes across version groups of the game.
/// * [statChanges] - A list of stats this moves effects and how much it effects them.
/// * [superContestEffect] - The effect the move has when used in a super contest.
/// * [target] - The type of target that will receive the effects of the attack.
/// * [type] - The elemental type of this move.
/// * [machines] - A list of the machines that teach this move.
/// * [flavorTextEntries] - The flavor text of this move listed in different languages.
/// * [learnedByPokemon] - List of Pokemon that can learn the move
@BuiltValue()
abstract class MoveDetail implements Built<MoveDetail, MoveDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The percent value of how likely this move is to be successful.
  @BuiltValueField(wireName: r'accuracy')
  int? get accuracy;

  /// The percent value of how likely it is this moves effect will happen.
  @BuiltValueField(wireName: r'effect_chance')
  int? get effectChance;

  /// Power points. The number of times this move can be used.
  @BuiltValueField(wireName: r'pp')
  int? get pp;

  /// A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
  @BuiltValueField(wireName: r'priority')
  int? get priority;

  /// The base power of this move, or null if it has no fixed base power.
  @BuiltValueField(wireName: r'power')
  int? get power;

  /// A detail of normal and super contest combos that require this move.
  @BuiltValueField(wireName: r'contest_combos')
  MoveCombos? get contestCombos;

  /// The type of appeal this move gives a Pokémon when used in a contest.
  @BuiltValueField(wireName: r'contest_type')
  ContestTypeSummary? get contestType;

  /// The effect the move has when used in a contest.
  @BuiltValueField(wireName: r'contest_effect')
  ContestEffectSummary? get contestEffect;

  /// The type of damage the move inflicts on the target, e.g. physical.
  @BuiltValueField(wireName: r'damage_class')
  MoveDamageClassSummary get damageClass;

  /// The effect of this move listed in different languages.
  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<MoveEffectEffectText> get effectEntries;

  /// The list of previous effects this move has had across version groups of the games.
  @BuiltValueField(wireName: r'effect_changes')
  BuiltList<MoveEffectChange> get effectChanges;

  /// The generation in which this move was introduced.
  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  /// Metadata about this move
  @BuiltValueField(wireName: r'meta')
  MoveMeta? get meta;

  /// The name of this resource listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<MoveName> get names;

  /// A list of move resource value changes across version groups of the game.
  @BuiltValueField(wireName: r'past_values')
  BuiltList<MoveChange> get pastValues;

  /// A list of stats this moves effects and how much it effects them.
  @BuiltValueField(wireName: r'stat_changes')
  BuiltList<MoveMetaStatChange> get statChanges;

  /// The effect the move has when used in a super contest.
  @BuiltValueField(wireName: r'super_contest_effect')
  SuperContestEffectSummary? get superContestEffect;

  /// The type of target that will receive the effects of the attack.
  @BuiltValueField(wireName: r'target')
  MoveTargetSummary get target;

  /// The elemental type of this move.
  @BuiltValueField(wireName: r'type')
  TypeSummary get type;

  /// A list of the machines that teach this move.
  @BuiltValueField(wireName: r'machines')
  BuiltList<ItemMachine> get machines;

  /// The flavor text of this move listed in different languages.
  @BuiltValueField(wireName: r'flavor_text_entries')
  BuiltList<MoveFlavorText> get flavorTextEntries;

  /// List of Pokemon that can learn the move
  @BuiltValueField(wireName: r'learned_by_pokemon')
  BuiltList<PokemonSummary> get learnedByPokemon;

  MoveDetail._();

  factory MoveDetail([void updates(MoveDetailBuilder b)]) = _$MoveDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDetail> get serializer => _$MoveDetailSerializer();
}

class _$MoveDetailSerializer implements PrimitiveSerializer<MoveDetail> {
  @override
  final Iterable<Type> types = const [MoveDetail, _$MoveDetail];

  @override
  final String wireName = r'MoveDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDetail object, {
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
    if (object.accuracy != null) {
      yield r'accuracy';
      yield serializers.serialize(
        object.accuracy,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'effect_chance';
    yield object.effectChance == null ? null : serializers.serialize(
      object.effectChance,
      specifiedType: const FullType.nullable(int),
    );
    if (object.pp != null) {
      yield r'pp';
      yield serializers.serialize(
        object.pp,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.priority != null) {
      yield r'priority';
      yield serializers.serialize(
        object.priority,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.power != null) {
      yield r'power';
      yield serializers.serialize(
        object.power,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'contest_combos';
    yield object.contestCombos == null ? null : serializers.serialize(
      object.contestCombos,
      specifiedType: const FullType.nullable(MoveCombos),
    );
    yield r'contest_type';
    yield object.contestType == null ? null : serializers.serialize(
      object.contestType,
      specifiedType: const FullType.nullable(ContestTypeSummary),
    );
    yield r'contest_effect';
    yield object.contestEffect == null ? null : serializers.serialize(
      object.contestEffect,
      specifiedType: const FullType.nullable(ContestEffectSummary),
    );
    yield r'damage_class';
    yield serializers.serialize(
      object.damageClass,
      specifiedType: const FullType(MoveDamageClassSummary),
    );
    yield r'effect_entries';
    yield serializers.serialize(
      object.effectEntries,
      specifiedType: const FullType(BuiltList, [FullType(MoveEffectEffectText)]),
    );
    yield r'effect_changes';
    yield serializers.serialize(
      object.effectChanges,
      specifiedType: const FullType(BuiltList, [FullType(MoveEffectChange)]),
    );
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'meta';
    yield object.meta == null ? null : serializers.serialize(
      object.meta,
      specifiedType: const FullType.nullable(MoveMeta),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(MoveName)]),
    );
    yield r'past_values';
    yield serializers.serialize(
      object.pastValues,
      specifiedType: const FullType(BuiltList, [FullType(MoveChange)]),
    );
    yield r'stat_changes';
    yield serializers.serialize(
      object.statChanges,
      specifiedType: const FullType(BuiltList, [FullType(MoveMetaStatChange)]),
    );
    yield r'super_contest_effect';
    yield object.superContestEffect == null ? null : serializers.serialize(
      object.superContestEffect,
      specifiedType: const FullType.nullable(SuperContestEffectSummary),
    );
    yield r'target';
    yield serializers.serialize(
      object.target,
      specifiedType: const FullType(MoveTargetSummary),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(TypeSummary),
    );
    yield r'machines';
    yield serializers.serialize(
      object.machines,
      specifiedType: const FullType(BuiltList, [FullType(ItemMachine)]),
    );
    yield r'flavor_text_entries';
    yield serializers.serialize(
      object.flavorTextEntries,
      specifiedType: const FullType(BuiltList, [FullType(MoveFlavorText)]),
    );
    yield r'learned_by_pokemon';
    yield serializers.serialize(
      object.learnedByPokemon,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDetailBuilder result,
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
        case r'accuracy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.accuracy = valueDes;
          break;
        case r'effect_chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.effectChance = valueDes;
          break;
        case r'pp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.pp = valueDes;
          break;
        case r'priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.priority = valueDes;
          break;
        case r'power':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.power = valueDes;
          break;
        case r'contest_combos':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MoveCombos),
          ) as MoveCombos?;
          if (valueDes == null) continue;
          result.contestCombos.replace(valueDes);
          break;
        case r'contest_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ContestTypeSummary),
          ) as ContestTypeSummary?;
          if (valueDes == null) continue;
          result.contestType.replace(valueDes);
          break;
        case r'contest_effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ContestEffectSummary),
          ) as ContestEffectSummary?;
          if (valueDes == null) continue;
          result.contestEffect.replace(valueDes);
          break;
        case r'damage_class':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveDamageClassSummary),
          ) as MoveDamageClassSummary;
          result.damageClass.replace(valueDes);
          break;
        case r'effect_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveEffectEffectText)]),
          ) as BuiltList<MoveEffectEffectText>;
          result.effectEntries.replace(valueDes);
          break;
        case r'effect_changes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveEffectChange)]),
          ) as BuiltList<MoveEffectChange>;
          result.effectChanges.replace(valueDes);
          break;
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        case r'meta':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MoveMeta),
          ) as MoveMeta?;
          if (valueDes == null) continue;
          result.meta.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveName)]),
          ) as BuiltList<MoveName>;
          result.names.replace(valueDes);
          break;
        case r'past_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveChange)]),
          ) as BuiltList<MoveChange>;
          result.pastValues.replace(valueDes);
          break;
        case r'stat_changes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveMetaStatChange)]),
          ) as BuiltList<MoveMetaStatChange>;
          result.statChanges.replace(valueDes);
          break;
        case r'super_contest_effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SuperContestEffectSummary),
          ) as SuperContestEffectSummary?;
          if (valueDes == null) continue;
          result.superContestEffect.replace(valueDes);
          break;
        case r'target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveTargetSummary),
          ) as MoveTargetSummary;
          result.target.replace(valueDes);
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TypeSummary),
          ) as TypeSummary;
          result.type.replace(valueDes);
          break;
        case r'machines':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemMachine)]),
          ) as BuiltList<ItemMachine>;
          result.machines.replace(valueDes);
          break;
        case r'flavor_text_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveFlavorText)]),
          ) as BuiltList<MoveFlavorText>;
          result.flavorTextEntries.replace(valueDes);
          break;
        case r'learned_by_pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSummary)]),
          ) as BuiltList<PokemonSummary>;
          result.learnedByPokemon.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDetailBuilder();
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


