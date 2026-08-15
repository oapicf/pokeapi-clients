//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_meta_ailment_summary.dart';
import 'package:openapi/src/model/move_meta_category_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_meta.g.dart';

/// MoveMeta
///
/// Properties:
/// * [ailment] 
/// * [category] 
/// * [minHits] 
/// * [maxHits] 
/// * [minTurns] 
/// * [maxTurns] 
/// * [drain] 
/// * [healing] 
/// * [critRate] 
/// * [ailmentChance] 
/// * [flinchChance] 
/// * [statChance] 
@BuiltValue()
abstract class MoveMeta implements Built<MoveMeta, MoveMetaBuilder> {
  @BuiltValueField(wireName: r'ailment')
  MoveMetaAilmentSummary get ailment;

  @BuiltValueField(wireName: r'category')
  MoveMetaCategorySummary get category;

  @BuiltValueField(wireName: r'min_hits')
  int? get minHits;

  @BuiltValueField(wireName: r'max_hits')
  int? get maxHits;

  @BuiltValueField(wireName: r'min_turns')
  int? get minTurns;

  @BuiltValueField(wireName: r'max_turns')
  int? get maxTurns;

  @BuiltValueField(wireName: r'drain')
  int? get drain;

  @BuiltValueField(wireName: r'healing')
  int? get healing;

  @BuiltValueField(wireName: r'crit_rate')
  int? get critRate;

  @BuiltValueField(wireName: r'ailment_chance')
  int? get ailmentChance;

  @BuiltValueField(wireName: r'flinch_chance')
  int? get flinchChance;

  @BuiltValueField(wireName: r'stat_chance')
  int? get statChance;

  MoveMeta._();

  factory MoveMeta([void updates(MoveMetaBuilder b)]) = _$MoveMeta;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveMetaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveMeta> get serializer => _$MoveMetaSerializer();
}

class _$MoveMetaSerializer implements PrimitiveSerializer<MoveMeta> {
  @override
  final Iterable<Type> types = const [MoveMeta, _$MoveMeta];

  @override
  final String wireName = r'MoveMeta';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveMeta object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ailment';
    yield serializers.serialize(
      object.ailment,
      specifiedType: const FullType(MoveMetaAilmentSummary),
    );
    yield r'category';
    yield serializers.serialize(
      object.category,
      specifiedType: const FullType(MoveMetaCategorySummary),
    );
    if (object.minHits != null) {
      yield r'min_hits';
      yield serializers.serialize(
        object.minHits,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.maxHits != null) {
      yield r'max_hits';
      yield serializers.serialize(
        object.maxHits,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.minTurns != null) {
      yield r'min_turns';
      yield serializers.serialize(
        object.minTurns,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.maxTurns != null) {
      yield r'max_turns';
      yield serializers.serialize(
        object.maxTurns,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.drain != null) {
      yield r'drain';
      yield serializers.serialize(
        object.drain,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.healing != null) {
      yield r'healing';
      yield serializers.serialize(
        object.healing,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.critRate != null) {
      yield r'crit_rate';
      yield serializers.serialize(
        object.critRate,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.ailmentChance != null) {
      yield r'ailment_chance';
      yield serializers.serialize(
        object.ailmentChance,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.flinchChance != null) {
      yield r'flinch_chance';
      yield serializers.serialize(
        object.flinchChance,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.statChance != null) {
      yield r'stat_chance';
      yield serializers.serialize(
        object.statChance,
        specifiedType: const FullType.nullable(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveMeta object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveMetaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ailment':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveMetaAilmentSummary),
          ) as MoveMetaAilmentSummary;
          result.ailment.replace(valueDes);
          break;
        case r'category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveMetaCategorySummary),
          ) as MoveMetaCategorySummary;
          result.category.replace(valueDes);
          break;
        case r'min_hits':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minHits = valueDes;
          break;
        case r'max_hits':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.maxHits = valueDes;
          break;
        case r'min_turns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minTurns = valueDes;
          break;
        case r'max_turns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.maxTurns = valueDes;
          break;
        case r'drain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.drain = valueDes;
          break;
        case r'healing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.healing = valueDes;
          break;
        case r'crit_rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.critRate = valueDes;
          break;
        case r'ailment_chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.ailmentChance = valueDes;
          break;
        case r'flinch_chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.flinchChance = valueDes;
          break;
        case r'stat_chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.statChance = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveMeta deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveMetaBuilder();
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

