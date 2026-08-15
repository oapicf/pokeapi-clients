//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_meta.dart';
import 'package:openapi/src/model/move_change.dart';
import 'package:openapi/src/model/move_flavor_text.dart';
import 'package:openapi/src/model/contest_type_summary.dart';
import 'package:openapi/src/model/move_target_summary.dart';
import 'package:openapi/src/model/move_detail_contest_combos.dart';
import 'package:openapi/src/model/type_summary.dart';
import 'package:openapi/src/model/contest_effect_summary.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/move_detail_effect_changes_inner.dart';
import 'package:openapi/src/model/move_damage_class_summary.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/move_detail_machines_inner.dart';
import 'package:openapi/src/model/move_name.dart';
import 'package:openapi/src/model/move_change_effect_entries_inner.dart';
import 'package:openapi/src/model/super_contest_effect_summary.dart';
import 'package:openapi/src/model/move_detail_stat_changes_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_detail.g.dart';

/// MoveDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [accuracy] 
/// * [effectChance] 
/// * [pp] 
/// * [priority] 
/// * [power] 
/// * [contestCombos] 
/// * [contestType] 
/// * [contestEffect] 
/// * [damageClass] 
/// * [effectEntries] 
/// * [effectChanges] 
/// * [generation] 
/// * [meta] 
/// * [names] 
/// * [pastValues] 
/// * [statChanges] 
/// * [superContestEffect] 
/// * [target] 
/// * [type] 
/// * [machines] 
/// * [flavorTextEntries] 
/// * [learnedByPokemon] 
@BuiltValue()
abstract class MoveDetail implements Built<MoveDetail, MoveDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'accuracy')
  int? get accuracy;

  @BuiltValueField(wireName: r'effect_chance')
  int get effectChance;

  @BuiltValueField(wireName: r'pp')
  int? get pp;

  @BuiltValueField(wireName: r'priority')
  int? get priority;

  @BuiltValueField(wireName: r'power')
  int? get power;

  @BuiltValueField(wireName: r'contest_combos')
  MoveDetailContestCombos get contestCombos;

  @BuiltValueField(wireName: r'contest_type')
  ContestTypeSummary get contestType;

  @BuiltValueField(wireName: r'contest_effect')
  ContestEffectSummary get contestEffect;

  @BuiltValueField(wireName: r'damage_class')
  MoveDamageClassSummary get damageClass;

  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<MoveChangeEffectEntriesInner> get effectEntries;

  @BuiltValueField(wireName: r'effect_changes')
  BuiltList<MoveDetailEffectChangesInner> get effectChanges;

  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  @BuiltValueField(wireName: r'meta')
  MoveMeta get meta;

  @BuiltValueField(wireName: r'names')
  BuiltList<MoveName> get names;

  @BuiltValueField(wireName: r'past_values')
  BuiltList<MoveChange> get pastValues;

  @BuiltValueField(wireName: r'stat_changes')
  BuiltList<MoveDetailStatChangesInner> get statChanges;

  @BuiltValueField(wireName: r'super_contest_effect')
  SuperContestEffectSummary get superContestEffect;

  @BuiltValueField(wireName: r'target')
  MoveTargetSummary get target;

  @BuiltValueField(wireName: r'type')
  TypeSummary get type;

  @BuiltValueField(wireName: r'machines')
  BuiltList<MoveDetailMachinesInner> get machines;

  @BuiltValueField(wireName: r'flavor_text_entries')
  BuiltList<MoveFlavorText> get flavorTextEntries;

  @BuiltValueField(wireName: r'learned_by_pokemon')
  BuiltList<AbilityDetailPokemonInnerPokemon> get learnedByPokemon;

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
    yield serializers.serialize(
      object.effectChance,
      specifiedType: const FullType(int),
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
    yield serializers.serialize(
      object.contestCombos,
      specifiedType: const FullType(MoveDetailContestCombos),
    );
    yield r'contest_type';
    yield serializers.serialize(
      object.contestType,
      specifiedType: const FullType(ContestTypeSummary),
    );
    yield r'contest_effect';
    yield serializers.serialize(
      object.contestEffect,
      specifiedType: const FullType(ContestEffectSummary),
    );
    yield r'damage_class';
    yield serializers.serialize(
      object.damageClass,
      specifiedType: const FullType(MoveDamageClassSummary),
    );
    yield r'effect_entries';
    yield serializers.serialize(
      object.effectEntries,
      specifiedType: const FullType(BuiltList, [FullType(MoveChangeEffectEntriesInner)]),
    );
    yield r'effect_changes';
    yield serializers.serialize(
      object.effectChanges,
      specifiedType: const FullType(BuiltList, [FullType(MoveDetailEffectChangesInner)]),
    );
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'meta';
    yield serializers.serialize(
      object.meta,
      specifiedType: const FullType(MoveMeta),
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
      specifiedType: const FullType(BuiltList, [FullType(MoveDetailStatChangesInner)]),
    );
    yield r'super_contest_effect';
    yield serializers.serialize(
      object.superContestEffect,
      specifiedType: const FullType(SuperContestEffectSummary),
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
      specifiedType: const FullType(BuiltList, [FullType(MoveDetailMachinesInner)]),
    );
    yield r'flavor_text_entries';
    yield serializers.serialize(
      object.flavorTextEntries,
      specifiedType: const FullType(BuiltList, [FullType(MoveFlavorText)]),
    );
    yield r'learned_by_pokemon';
    yield serializers.serialize(
      object.learnedByPokemon,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
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
            specifiedType: const FullType(int),
          ) as int;
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
            specifiedType: const FullType(MoveDetailContestCombos),
          ) as MoveDetailContestCombos;
          result.contestCombos.replace(valueDes);
          break;
        case r'contest_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ContestTypeSummary),
          ) as ContestTypeSummary;
          result.contestType.replace(valueDes);
          break;
        case r'contest_effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ContestEffectSummary),
          ) as ContestEffectSummary;
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
            specifiedType: const FullType(BuiltList, [FullType(MoveChangeEffectEntriesInner)]),
          ) as BuiltList<MoveChangeEffectEntriesInner>;
          result.effectEntries.replace(valueDes);
          break;
        case r'effect_changes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveDetailEffectChangesInner)]),
          ) as BuiltList<MoveDetailEffectChangesInner>;
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
            specifiedType: const FullType(MoveMeta),
          ) as MoveMeta;
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
            specifiedType: const FullType(BuiltList, [FullType(MoveDetailStatChangesInner)]),
          ) as BuiltList<MoveDetailStatChangesInner>;
          result.statChanges.replace(valueDes);
          break;
        case r'super_contest_effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(SuperContestEffectSummary),
          ) as SuperContestEffectSummary;
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
            specifiedType: const FullType(BuiltList, [FullType(MoveDetailMachinesInner)]),
          ) as BuiltList<MoveDetailMachinesInner>;
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
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
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

